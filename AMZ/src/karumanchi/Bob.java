package karumanchi;

import java.util.Scanner;

public class Bob {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int[]a=new int[n];
        int[]temp=new int[r];
        for(int i=0;i<r;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-r;i++){
            temp[i]=sc.nextInt();
        }
        for(int i=0;i<r;i++){
            System.out.print(" "+a[i]);
        }
        for(int i=n-r;i>0;i--){
            System.out.print(" "+temp[i]);
        }
        
	}

}
