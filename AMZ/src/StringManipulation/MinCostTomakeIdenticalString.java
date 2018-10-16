package StringManipulation;

public class MinCostTomakeIdenticalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "ef"; 
        String Y = "gh"; 
        System.out.println( "Minimum Cost to make two strings "
                            + " identical is = " 
                            + findMinCost(X, Y, 10, 20)); 
	}

	
	public static int lcsLength(String x,String y){

		char[]a=x.toCharArray();
		char[]b=y.toCharArray();

		int [][]lcs=new int[a.length+1][b.length+1];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < lcs.length; j++) {
				if(i==0||j==0){
					lcs[i][j]=0;
				}else if(a[i-1]==a[j-1]){
					lcs[i][j]=lcs[i-1][j-1]+1;
				}else{
					lcs[i][j]=Math.max(lcs[i][j-1], lcs[i-1][j]);
				}

			}

		}

		return lcs[a.length][b.length];

	}
	
	public static int findMinCost(String X, String Y, int costX, int costY){
		
		int xL=X.length();
		int yL=Y.length();
		
		int lcs=lcsLength(X, Y);
		
		return  ((xL-lcs)*costX)+((yL-lcs)*costY);
		
	}
	
}
