package array;

import java.util.Scanner;

public class AllSubSequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(numOfIncSubseqOfSizeK(arr, n, k));
	}

	

	public static int numOfIncSubseqOfSizeK(int arr[], int n, int k) 
	{ 
	    int[][] dp=new int[k][n];int  sum = 0; 
	   
	    for (int i = 0; i < n; i++) 
	    	if(arr[i]!=0)
	        dp[0][i] = 1; 
	    	else
	    		dp[0][i] = 0;
	    
	    for (int l = 1; l < k; l++) { 
	  
	       
	        for (int i = l; i < n; i++) { 
	  
	      
	            dp[l][i] = 0; 
	            for (int j = l - 1; j < i; j++) { 
	                
	                    dp[l][i] += dp[l - 1][j]; 
	            } 
	        } 
	    } 
	  
	   
	    for (int i = k - 1; i < n; i++) 
	        sum += dp[k - 1][i]; 
	  
	   
	    return sum; 
	}
}
