package sortinAlgo;

public class Counting {

	public static void main(String[] args) {

		int[] arr={1,2,3,0,99,0,8,0,80,0,7,44,2,0,4,8};
		int[]sorted=countingSort(arr, 99);
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i]+" ");
		}
	}
	
	public static int[] countingSort(int[]arr,int max){
		
		int[]count=new int[max+1];
		
		for (int i : arr) {
			count[i]++;
		}
		
		int[]sortedArr=new int[arr.length];
		
		int sortedIndex=0;
		
		for (int i = 0; i < count.length; i++) {
			
			int numCount=count[i];
			for (int j = 0; j < numCount; j++) {
				sortedArr[sortedIndex]=i;
				sortedIndex++;
			}
			
		}
		
		return sortedArr;
		
	}

}
