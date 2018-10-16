package DP;

public class BaloonBrust {

	public static void main(String[] args) {
		System.out.println(" ");
	}


	public static  int maxCoins(int[] nums) {



		int n=nums.length;

		if(n==0)
			return 0;

		int [][]T=new int[n][n];

		for(int len=1;len<=n;len++){

			for(int i=0;i<=n-len;i++){

				int j=i+len-1;
				for(int k=i;k<=j;k++){

					int leftVal=1;
					int rightVal=1;

					if(i!=0){
						leftVal=nums[i-1];
					}
					if(j!=n-1){
						rightVal=nums[j+1]; 
					}

					int before=0;
					int after=0;
					if(i!=k){
						before=T[i][k-1];
					}
					if(j!=k){
						after=T[k+1][j];
					}
					T[i][j]=Math.max(leftVal*nums[k]*rightVal+before+after,T[i][j]);

				}
			}

		}

		return T[0][n-1];
	}
}
