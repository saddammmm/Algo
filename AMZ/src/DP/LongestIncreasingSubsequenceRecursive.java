package DP;

import java.util.Arrays;

public class LongestIncreasingSubsequenceRecursive {

	int max_ref=0;
	static int[]memo=new int[100+1];
	
	public static void main(String[] args) {
		Arrays.fill(memo, 1);
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is "
                           + LIS(arr, n) );
        
        System.out.println("Length of lisDP is "
                + LISDPBottom(arr, n) );
	}
	
	public static int LIS(int []a,int n){
		
		if(n==1)
			return 1;
		int res=0,meh=1;
		
		for (int i = 1; i < n; i++) {

			res=LIS(a, i);
			if(a[i-1]<a[i]&&res+1>meh){
				meh=res+1;
			}
		}
		return meh;
		
	}
	
	public static int LISDP(int[]a,int n){
		
		
		if(n==1)
			return 1;
		int res=0;
		for (int i = 1; i < n; i++) {
			
			if(a[i-1]<a[i]&&memo[i-1]+1>res){
				res=memo[i-1]+1;
				memo[i]=res;
			}else{
				res=LISDP(a, n);
				memo[i]=res;
			}
		}
		
		
		for (int i = 0; i < memo.length; i++) {
			System.out.print(memo[i]+" ");
		}
		
		return res;
		
	}

	public static int LISDPBottom(int[]a,int n){
		
		 int[]memo2=new int[n];
		 Arrays.fill(memo2, 1);
		 int max=0;
		 for (int i = 1; i < n; i++) {
			
			 for (int j = 0; j < i; j++) {
				if(a[i]>a[j]&&memo2[i]<memo2[j]+1)
				 memo2[i]=memo2[j]+1;
			}
		}
		
		 for (int i = 0; i < memo2.length; i++) {
			if(max<memo2[i])
				max=memo2[i];
		}
		 return max;
	}
	
	
}
