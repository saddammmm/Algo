package DP;

import java.io.*;
import java.util.*;


public class Monk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String P = br.readLine();
            String Q = br.readLine();
            int cost_size = Integer.parseInt(br.readLine().trim());
            String[] arr_cost = br.readLine().split(" ");
            int[] cost = new int[cost_size];
            for(int i_cost=0; i_cost<arr_cost.length; i_cost++)
            {
            	cost[i_cost] = Integer.parseInt(arr_cost[i_cost]);
            }

            int out_ = amount_to_pay(Q, P, cost);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int amount_to_pay(String Q, String P, int[] cost){

    	List<Integer> li=new ArrayList<Integer>();
    	int index=Q.indexOf(P);
    	System.out.println("index :"+index);
    	int len=Q.length();
 	   if(index>=0)
 	   {
 		   li.add(cost[index]);
 		   for(int k=index+1;k<len;k+=index+(Q.length()-1))
 		   {
 			   index=Q.indexOf(P,k);
 			   li.add(cost[index]);
 		   }


 		   Collections.sort(li);
 		   return (li.get(li.size()-1)+li.get(li.size()-2));
 	   }
 	   else
 		   return 0;
 		 //  System.out.println("0");
    	
    
    }
}