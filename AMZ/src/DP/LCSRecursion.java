package DP;

public class LCSRecursion {

	public static void main(String[] args) {

		 String s1 = "AGGTAB";
		    String s2 = "GXTXAYB";
		    System.out.println(LCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
	}
	
	public static int LCS(char[]a,char[]b,int m,int n){
		
		
		if(m==0||n==0)
			return 0;
		if(a[m-1]==b[n-1])
			return 1+LCS(a, b, m-1, n-1);
		else 
			return Math.max(LCS(a, b, m, n-1), LCS(a, b, m-1, n));
		
	}

}
