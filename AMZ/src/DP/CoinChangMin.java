package DP;

import java.util.Arrays;

public class CoinChangMin {

	public static void main(String[] args) {


        int arr[] = {1, 2, 5};
        int m = arr.length;
        int n = 11;
        System.out.println(coinChange(arr, n));
    
		
	}
	
	 public static int coinChange(int[] coins, int amount) {
	        
	        
	     long []table=new long[amount+1];
	        
	     table[0]=1;
	        for(int i=0;i<coins.length;i++){
	            
	            for(int j=coins[i];j<=amount;j++){
	                table[j]+=table[j-coins[i]];
	            }
	            
	        }
	        long min=Long.MAX_VALUE;
	        
	        for (int i = 0; i < table.length; i++) {
				System.out.println(table[i]);
			}
	        for(int i=0;i<coins.length;i++){
	            
	        if(table[i]>0&&table[i]<min)
	            min=table[i];
	    }
	        return (int)min;
	}
	
	 static long countWays(int S[], int m, int n)
	    {
	        
	        long[] table = new long[n+1];
	 
	        Arrays.fill(table, 0);   //O(n)
	 
	        table[0] = 1;
	 
	       
	        for (int i=0; i<m; i++)
	            for (int j=S[i]; j<=n; j++){
	            	System.out.println(table[j]+">>"+table[j-S[i]]+" "+(j-S[i]));
	                table[j] += table[j-S[i]];
	                
	            }
	 
	     /*   for (int i = 0; i < table.length; i++) {
				System.out.println("++++++++++"+table[i]);
			}*/
	        
	        return table[n];
	    }
	 

}
