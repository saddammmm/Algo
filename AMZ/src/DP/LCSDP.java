package DP;

public class LCSDP {

	public static void main(String[] args) {
		
		 String s1 = "AGGTAB";
		    String s2 = "GXTXAYB";
		    System.out.println(LCSDP(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
	}

	
	public static  int LCSDP(char []a,char[]b,int n,int m){
		
		int[][]l=new int[n+1][m+1];
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <=m; j++) {
				if(i==0||j==0)
					l[i][j]=0;
				else if(a[i-1]==b[j-1])
					l[i][j]=1+l[i-1][j-1];
				else
					l[i][j]=Math.max(l[i-1][j], l[i][j-1]);
				
			}
		}
		return l[n][m];
		
	}
	
}
