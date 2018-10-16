package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortWithMaxyeild {

	public static void main(String []args){
		
		
		ArrayList<String>arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in)
		;
		
		 arr.add("54");
	        arr.add("546");
	        arr.add("548");
	        arr.add("60");
		/*int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			a.add(sc.nextLine());
		}*/
		
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				
				String ab=a+b;
				String ba=b+a;
				
				return ab.compareTo(ba)>0?-1:1;
			}
		});
		
		
		System.out.println(arr);
		
	}
	
	
}
