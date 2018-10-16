package DP;

public class LongestCommonSubsequenceDPandRecursive {

	public static void main(String[] args) {
		
		 String s1 = "AGGTAB";
		    String s2 = "GXTXAYB";
		    System.out.println(LCS(s1, s2, s1.length(), s2.length()));
		    System.out.println(LCSDP(s1, s2, s1.length(), s2.length()));
			
	}

	
	public static int LCS(String x,String y,int n,int m){


		if(m==0||n==0)
			return 0;
		if(x.charAt(n-1)==y.charAt(m-1))
			return 1+LCS(x, y, n-1, m-1);
		else
			return Math.max(LCS(x, y, n, m-1), LCS(x, y, n-1, m));
}
	
	public static int LCSDP(String x,String y,int n,int m){
		
		int[][]li=new int[n+1][m+1];
		
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <= m; j++) {
				
				if(i==0||j==0)
					li[i][j]=0;
				else if(x.charAt(i-1)==y.charAt(j-1))
					li[i][j]=1+li[i-1][j-1];
				else
					li[i][j]=Math.max(li[i][j-1], li[i-1][j-1]);
			}
		}
		return li[n][m];
		
	}
	
}
