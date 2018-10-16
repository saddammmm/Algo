		
package DP;

public class SubsetSumProblem {

	public static void main(String[] args) {

		int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
           System.out.println("Found a subset with given sum");
        else
           System.out.println("No subset with given sum");
        
        
       isSubSetDP(set, n, sum);
	}
	
	public static boolean isSubsetSum(int[]a,int n,int sum){	
		if(sum==0)
			return true;
		if(sum>0&&n==0)
			return false;
		
		if(a[n-1]>sum)
			return isSubsetSum(a, n-1, sum);
		
		return (isSubsetSum(a, n-1, sum-a[n-1])||isSubsetSum(a, n-1, sum));	
	}
	
	public static void isSubSetDP(int[]a,int n,int sum){
		
		boolean[][]dp=new boolean[a.length+1][sum+1];
		
		
		for (int i = 0; i < a.length+1; i++) {
			dp[i][0]=true;
		}
		
	
		for (int i = 1; i < a.length+1; i++) {
			for (int j = 1; j <sum+1; j++) {

				if(j-a[i-1]>=0){
					
					//go one top and a[i-1] back and update its value 
						dp[i][j]=dp[i-1][j] || dp[i-1][j-a[i-1]];
					
				}else{
					//copy top value because j is not able to make sum as it is greater than sum
					dp[i][j]=dp[i-1][j];
				}

			}
		}
		
		/*for (int i = 0; i < a.length+1; i++) {
			for (int j = 0; j < sum+1; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println(dp[a.length][sum]);
	}
	
}
