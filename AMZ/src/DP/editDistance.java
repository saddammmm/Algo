package DP;

public class editDistance {

	public static void main(String[] args) {

		String str1 = "sunday";
        String str2 = "saturday";
  
        System.out.println( editDistanc( str1 , str2 , str1.length(), str2.length()) );
        
        System.out.println( editDistancDP( str1 , str2 , str1.length(), str2.length()) );
	}
	
	public static int editDistanc(String str1,String str2,int m,int n){
		/*
		 * 3^n
		 */
		
		if(n==0)
			return m;
		if(m==0)
			return n;
		if(str1.charAt(m-1)==str2.charAt(n-1))
			return editDistanc(str1, str2, m-1, n-1);
		else return 1+ Math.min(editDistanc(str1, str2, m, n-1), Math.min(editDistanc(str1, str2, m-1, n), editDistanc(str1, str2, m-1, n-1)));
		
		
		
	}

	
	public static int editDistancDP(String str1,String str2,int m,int n){
		
		
		int[][]dp=new int[m+1][n+1];
		
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j <=n; j++) {
				
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else 
					dp[i][j]=1+Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
				
			}
		}
		
		return dp[m][n];
	}
	
}
