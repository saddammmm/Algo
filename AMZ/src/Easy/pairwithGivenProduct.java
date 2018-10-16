package Easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class pairwithGivenProduct {

	public static void main(String[] args) {
		
		int t;
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		while(t>0){
			
			int n=sc.nextInt();
			int x=sc.nextInt();
			System.out.println(x+"::::"+n);
			int[]a=new int[n];
			for (int i = 0; i < n; i++) {
				a[i]=sc.nextInt();
				
			}
			
			HashMap<Integer, Integer>pai=new HashMap<Integer, Integer>();
			
			for (int i = 0; i < a.length; i++) {
				
				
				if (a[i] == 0)
		        {
		           if (x == 0)
		               System.out.println("Yes");
		           else
		               continue;
		        }
				if (x%a[i] == 0)
		        {
		            if (pai.get(x/a[i]) !=null)
		               System.out.println("Yes");
		 
		            // Insert arr[i]
		           pai.put(x/a[i], x/a[i]);
		        }
				
			}
			
			
			
			t--;
		}
		
		
		
}

}
