package StringManipulation;

import java.util.Scanner;

public class MinMainupulationTomakeAnnaGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []count=new int[26];
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		String str2=sc.nextLine().toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)-'a']++;
		}
		int c=0;
		
		for (int i = 0; i < str2.length(); i++) {
			if(count[str2.charAt(i)-'a']--<=0)
				c++;
		}
		
		System.out.println(c);
	}

}
