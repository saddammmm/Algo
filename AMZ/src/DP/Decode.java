package DP;

import java.util.Scanner;

public class Decode{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String str;
		sc.nextLine();
		while(t>0){
			str=sc.nextLine();
			System.out.println(decode1(str));
			
			
			t--;
			
		}
	}
   
	static String decode1(String s){
		
		
		
		 String res="";
		 
		 char[]a=s.toCharArray();
		 res=""+a[0];
		 boolean flag=false;
		 if((s.length()-1)%2==0){
		     flag=true;
		 }
		 for (int j=1; j<a.length;j++) {
			
			 if(flag){
			     flag=false;
				 res=""+a[j]+res;
			 }else{
			     flag=true;
				 res=res+""+a[j];
			 }	 
		} 
		 return res; 
	    
  }
}