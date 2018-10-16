import java.util.Arrays;
import java.util.Scanner;


public class Pal {

	
	 public static void main(String args[] ) throws Exception {
	       
	       Scanner sc=new Scanner(System.in);
	       int test=sc.nextInt();
	       
	       for (int i = 0; i < test; i++) {
	    	   String str=sc.next();
	    	   
	    	    if(IsoneSwap(str)){
	    	     
	    		  System.out.println("Yes");
	    	  }else{
	    		  System.out.println("No");
	    	  }
	       }
	       
	       
	       
	       

	    }
	 
	 public  static boolean IsoneSwap(String str) throws Exception{

		 int[] chr = new int[256];
		 Arrays.fill(chr, 0);
		 for (int i = 0; i < str.length(); i++) {
			 chr[(int)str.charAt(i)]++;
		 }
		 int odd=0;
		 for (int i = 0; i < chr.length; i++) {

			 
			 if((chr[i]&1)==1){
				 odd++;
			 }
			 if(odd>1)
				 return false;
		 }
		 
		 
		 int left=0;int  right=str.length()-1;
		 
		 int c=0;
		 int a=0,b=0;
		 while (left!=right&&left<=right) {
			 if(str.charAt(left)!=str.charAt(right)){
				 a=left;
				 b=right;
				 c++;
			 }
			 
			 left++;
			 right--;
		 }
		 
		 if(c<=1)
			
				return true;
		else
			return false;

	 }
	 
	
}
