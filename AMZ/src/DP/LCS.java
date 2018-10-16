package DP;

public class LCS {

	public static void main(String[] args) {
		
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	    
		System.out.println(lcs(X,Y,m,n));
		System.out.println(DPLCS(X, Y, m, n));
		
	}
	
	public static  int max(int a, int b)
	  {
	    return (a > b)? a : b;
	  }
	static int lcs( char[] X, char[] Y, int m, int n )
	  {
	    if (m == 0 || n == 0)
	      return 0;
	    if (X[m-1] == Y[n-1])
	      return 1 + lcs(X, Y, m-1, n-1);
	    else
	      return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	  }
	
	
	static int DPLCS( char[] X, char[] Y, int m, int n )
	  {
		
		int[][]l=new int [m+1][n+1];
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				
				if(i==0||j==0){
					l[i][j]=0;
				}
				else if(X[i-1]==Y[j-1]){
					l[i][j]=l[i-1][j-1]+1;
				}else{
					l[i][j]=max(l[i-1][j], l[i][j-1]);
				}
				
			}
		}
		return l[m][n];
	
		
		
	  }

}
