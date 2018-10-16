import java.util.Scanner;


public class RotateArray {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int r=sc.nextInt();
	        int[]array=new int[n];
	        for (int i = 0; i < n; i++) {
	        	array[i]=sc.nextInt();
	        }
	        
	        for (int i = r; i <n; i++) {
				System.out.print(array[i]+" ");
				
			}
	        
	        for (int i = 0; i <r; i++) {
				System.out.print(array[i]+" ");
			}
	        
	        

	}

}
