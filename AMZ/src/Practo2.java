import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Practo2 {

	public static int max=0;
	public static  ArrayList<Integer>aa;
	public static void main(String[] args) {

		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		aa=new ArrayList<Integer>(str.length());
		for (int i = 0; i <str.length(); i++) {
			aa.add(0);
		}
		try {
			for (int i = 0; i < k; i++) 
				
			{
				
				int q1=sc.nextInt();
				
				if(q1==1){
					char[]char1=str.toCharArray();
					
					System.out.println(getMaxLength(char1, n));
					max=getMaxLength(char1, n);
				}else{
					int q2=sc.nextInt();
					int c=aa.get(q2);
					if(c==0){
						
					}
				}
				System.out.println(aa);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	
	public static int getMaxLength(char arr[], int n)
	{
	    int count = 0; 
	    int result = 0; 

	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] == '0'){
	        	System.out.println("ccc "+count);
	        	int inde=0;
	        	if(count>0){
	        	inde=count;
	        	for (int j = i-inde; j<inde ; j++) {
	        		aa.add(j,inde);
				}
	        	
	        	}
	        	 count = 0;
	        	
	           
	           
	        }
	       
	        else
	        {
	            count++;
	            result = Math.max(result, count);
	        }
	    }

	    return result;
	}
	
}
