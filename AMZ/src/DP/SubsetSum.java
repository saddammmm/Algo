package DP;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int set[] = {3, 34, 4, 12, 5, 2};
	        int sum = 9;
	        int n = set.length;
	        isSubsetSum(set, n, sum);
	}

	
	public static void isSubsetSum(int[]set, int m, int sum){
		
		
		
		boolean [][]table=new boolean[sum+1][m+1];
		
		for (int i = 0; i <= m; i++) {
			table[0][i]=true;
		}
		
		for (int i = 1; i <=sum; i++) {
			table[i][0]=false;
		}
		
		
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <=m; j++) {
				table[i][j] = table[i][j-1];
				if (i >= set[j-1])
					table[i][j] = table[i][j] || 
					table[i - set[j-1]][j-1];
			}
		}
		
		System.out.println(table[sum][m]);
	}
	
	
}
