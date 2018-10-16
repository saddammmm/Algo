package StringManipulation;

public class LargestDub {

	
	public static void main(String[]args){
		
		System.out.println(":::::::::::::::::");
		
		String input="jaaaavvvvvvvvaaaaaaaaaa";
		
		int maxlen=0;
		int start=0;
		int temp=1;
		int startIndex=0;
		
		char f=input.charAt(0);
		for (int i = 1; i <input.length(); i++) {
			
			if(f==input.charAt(i)){
				temp++;
			}else if(temp>maxlen){
				maxlen=temp;
				temp=1;
				start=i-maxlen;
				startIndex=i;
			}
			
		}
		System.out.println(MaxOccuredChar(input)+" "+maxlen+" "+startIndex);
		
	}
	
	public static String MaxOccuredChar(String str) {

		char[] array = str.toCharArray();
		int maxCount = 1;
		char maxChar = array[0];

		for(int i = 0, j = 0; i < str.length() - 1; i = j){
			int count = 1;
			while (++j < str.length() && array[i] == array[j]) {
				count++;
			}

			if (count > maxCount) {
				maxCount = count;
				maxChar = array[i];
			}

		}

		return (maxChar + " = " + maxCount);
	}
}
