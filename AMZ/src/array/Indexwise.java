package array;

import java.util.HashMap;

public class Indexwise {

	public static void main(String[] args) {

		int[]a= {1 ,3, 5 ,4, 2 ,0};

		/*HashMap<Integer, Integer>m=new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			m.put(a[i], i);
		}

		for (int i = 0; i < a.length; i++) {
			a[i]=m.get(i);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}*/
		
		int n=a.length;
		for (int i = 0; i < n; i++) {
			a[a[i]%n]+=i*n;
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]/n;
		}
		

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	
	

}
