package DP;

public class CuttingaRod {

	public static void main(String[] args) {

		//int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
		int arr[] = new int[] {1, 5, 8, 9};
		int size = arr.length;
		System.out.println("Maximum Obtainable Value is "+
				cutRodRecursive(arr, 4));
	}
	public static int cutRodRecursive(int[]price,int n){
		if(n==0)
			return 0;
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			max=Math.max(max, price[i]+cutRodRecursive(price, n-i-1));
			System.out.println(" "+max);
		}
		return max;
	}

	public static int cutRodDP(int[]price,int n){
		
		if(n==0)
			return 0;
		
		int []dp=new int[n+1];
		
		for (int i = 1; i <=n; i++) {
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < i; j++) {
				max=Math.max(max, price[i]+dp[i-j-1]);
			}
			dp[i]=max;
			
		}
		
		return dp[n];
		
	}

}
