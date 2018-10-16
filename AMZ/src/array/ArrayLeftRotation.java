package array;

import java.util.Scanner;


public class ArrayLeftRotation {

	public static void main(String[] args) {
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int[]a=new int[n];
		
		for (int i = 0; i <n; i++) {
			
			a[(i+n-k)%n]=sc.nextInt();
			
		}

		for (int i = 0; i <n; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
