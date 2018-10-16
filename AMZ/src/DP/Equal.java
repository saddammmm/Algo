package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {

		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		
		Collections.sort(a);
		
		ArrayList<Integer>aa=new ArrayList<Integer>();
		for (int i = 0; i <a.size(); i++) {
			aa.add(a.get(i)-a.get(0));
		}
		
		int a1 = 0,b = 0,c = 0;
		for (int i = 0; i < aa.size(); i++) {
			
			a1+=aa.get(i)/5;
			b+=(aa.get(i)%5)/2;
			c+=((aa.get(i)%5)%2)/1;
			
		}
		System.out.println(a1+b+c);
		
	}

}
