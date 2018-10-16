package DP;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(candies(n, a));
	}
	
	static long candies(int n, int[] arr) {


		long[]dp=new long[n];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=1;
		}
		
		for (int i = 1; i < n; i++) {
			if(arr[i] > arr[i-1]){
	            dp[i] = dp[i] + dp[i-1]; 
	        }
		}
		
		for(int i = n-2 ; i >= 0 ; i--){ // back track
	        if(arr[i] > arr[i+1] && dp[i] <= dp[i+1]){
	            dp[i] = dp[i+1] + 1;
	        }
	    }

		
		 long ans=0;
		 for (int i = 0; i < dp.length; i++) {
			System.out.print(" "+dp[i]);
		}
		for (int i = 0; i < dp.length; i++) {
			ans+=dp[i];
		}
		return ans;
    }
}
