package DP;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSubArrayProb(a));
		
	}

	public static int maxSubArrayProb(int[]a){
		int max=0,maxending=0;

		for (int i = 0; i < a.length; i++) {
			maxending=maxending+a[i];
			if(maxending<0)
				maxending=0;
			else if(max<maxending){
				max=maxending;
			}
					
		}
		
		return max;
	}
	
}
