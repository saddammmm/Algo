package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>a=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		System.out.println(atMostSum(a, 23));
	}
	
	public static int subArraySum(List<Integer> outfits, int money) 
    {
		
		int n=outfits.size();
        int current = outfits.get(0); int s = 0, i;
 
        for (i = 1; i <= n; i++) 
        {
            while (current > money && s < i-1)
            {
            	current = current - outfits.get(s);
                s++;
            }
            
           
             
            if (current >= money&&s!=1) 
            {
                int e = i-1;
                
                return e-s+1;
            }
             
            if (i < n)
            	current = current + outfits.get(s);
             
        }
 
        return 0;
    }

	
	 public static int atMostSum(List<Integer> outfits, int money)
	 {
		 
		 int n=outfits.size();
		 int initial = 0;
		 int current = 0, longest = 0;

		 for (int i = 0; i < n; i++) {

			
			 if ((initial + outfits.get(i)) <= money) {
				 initial += outfits.get(i); 
				 current++;
			 } 

			
			 else if(initial!=0)
			 {
				
				 initial = initial -  outfits.get(i-current) +  outfits.get(i);
			 }

			 longest = Math.max(current, longest); 
		 }
		 return longest;
}
}
