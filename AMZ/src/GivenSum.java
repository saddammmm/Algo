import java.util.HashMap;
import java.util.Scanner;


public class GivenSum {

	public static void main(String[] args) {
		
		int t,n,m,x;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t>0){

			n=sc.nextInt();
			m=sc.nextInt();
			x=sc.nextInt();
            boolean t2=true;
			HashMap<Integer, Integer>aa=new HashMap<Integer, Integer>();

			int[]a=new int[n];
			int[]b=new int[n];
          // sc.nextLine();
			for (int i = 0; i < n; i++) {
				int te=sc.nextInt();
				a[i]=te;
				int p=x-te;
				aa.put(p,p);
			}
			//sc.nextLine();
			for (int i = 0; i < m; i++) {
				b[i]=sc.nextInt();
			}
			for (int i = 0; i < b.length; i++) {
				if(aa.get(b[i])!=null){
					t2=false;
					System.out.print(x-aa.get(b[i])+" "+b[i]);
					if(i!=b.length-1)
					System.out.print(",");
				}
				
			}
         
          if(t2){
        	  System.out.println("-1");
          }
			t--;
		}	
		
	}

}
