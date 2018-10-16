package StringManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		for (int k = 0; k < 2; k++) {
			int n=sc.nextInt();
			sc.nextLine(	);
			ArrayList<String>str1=new ArrayList<String>();
			
			for (int i = 0; i < n; i++) {
				str1.add(sc.nextLine());
			}
			java.util.Collections.sort(str1, new java.util.Comparator<String>() {
			    @Override
			    public int compare(String s1, String s2) {
			       return (s1.substring(0,2).compareTo(s2.substring(0,2)));
			    }  
			});
			
			for (int i = 0; i < str1.size(); i++) {
				System.out.println(str1.get(i));
			}
			//System.out.println();
		}
		
	}

}
