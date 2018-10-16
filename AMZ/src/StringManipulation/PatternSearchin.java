package StringManipulation;

public class PatternSearchin {

	public static void main(String[] args) {

		String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        findPattern(txt.toCharArray(), pat.toCharArray());
		
	}
	
	
	public static void findPattern(char[]text, char[]pat){
		
		
		int n=text.length;
		int m=pat.length;
		
		for (int i = 0; i < n-m; i++) {

			int j;
			for ( j = 0; j <m; j++) {
				if(text[i+j]!=pat[j]){
					break;
				}
			}

			if(j==m)
				System.out.println("pattern found at :"+i);
		}
		
		
	}
	
	public static void KMP(char[]text,char[]pat){
		
		
		
	}
	

}
