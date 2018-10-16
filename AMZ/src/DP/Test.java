package DP;

import java.io.*;
import java.util.*;


public class Test {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i,ele,j,k,len;
       String str,s;
       for(i=0;i<n;i++)
       {
    	   str=sc.next();
    	   len=str.length();
    	   s=sc.next();
    	   ele=sc.nextInt();
    	   int arr[]=new int[ele];
    	   List<Integer> li=new ArrayList<Integer>();
    	   for(j=0;j<ele;j++)
    		   arr[j]=sc.nextInt();
    	   System.out.println(amount_to_pay(str, s, arr));
    	  
       }
    }

    
    public static int amount_to_pay(String str, String s, int[] cost){
    
 	  int  len=str.length();
 	 
 	 int k;
 	   int index=str.indexOf(s);
 	   if(index>=0)
 	   {
 		   ArrayList<Integer>totalJump=indexTojump(str, s);
 		  ArrayList<Integer>finalRes=new ArrayList<Integer>();
 		 // System.out.println("toatal "+totalJump);
 		   for (Integer integer : totalJump) {
 			  List<Integer> li=new ArrayList<Integer>();
			index=integer;
 			  li.add(cost[index]);
 	 		   for(k=index+1;k<len;k+=index+(s.length()-1))
 	 		   {
 	 			   if(k>=cost.length-1)
 	 				   break;
 	 			   index=str.indexOf(s,k);
 	 			  // System.out.println("index :"+index);
 	 			   li.add(cost[index]);
 	 		   }
 	 		   Collections.sort(li);
 	 		   if(li.size()>1)
 	 		 finalRes.add((li.get(li.size()-1)+li.get(li.size()-2)));
 	 		   else {
 	 			 finalRes.add(li.get(li.size()-1));
			}
 	 		// li.clear();
		}
 		  Collections.sort(finalRes);
 		   return finalRes.get(finalRes.size()-1);
 	   }
 	   else{
 		 
 		  return 0;
 	   }

    }
    
    public static  ArrayList<Integer> indexTojump(String word,String guess){
    	ArrayList<Integer>aa=new ArrayList<Integer>();
    	int index = word.indexOf(guess);
    	while (index >= 0) {
    		aa.add(index);
    		//System.out.println(index);
    		index = word.indexOf(guess, index + 1);
    	}
    	return aa;
    			
    }
    
}