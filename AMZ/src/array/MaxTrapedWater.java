package array;

import java.util.Scanner;

public class MaxTrapedWater {

	public static void main(String[] args) {

		 /* int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
	     
		   findMax(arr, arr.length);*/
		Scanner sc=new Scanner(System.in);
		String userID=sc.nextLine();
		userID=userID.replace("\"","\\\"");
		String pwd="asdfg";
		pwd=pwd.replace("\"","\\\"");
		System.out.println(userID+" "+pwd);
	}
	
	public static void findMax(int[]arr,int n){
		
		int left[]=new int[n];
		int right[]=new int[n];
		
		left[0]=arr[0];
		
		for (int i = 1; i < n; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		right[n-1]=arr[n-1];
		for (int i = n-2; i >= 0; i--) {
			left[i]=Math.max(right[i+1], arr[i]);
		}
		
		int water=0;
		
		for (int i = 0; i < n; i++) {
			water+=Math.min(left[i], right[i])-arr[i];
		}
		System.out.println(water);
	}

}
