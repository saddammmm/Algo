package karumanchi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,q;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer>price=new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			price.add(sc.nextInt());
			
		}
		q=sc.nextInt();
		int [][]query=new int[q][3];
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < 3; j++) {
				query[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < q; i++) {
			int L=query[i][0];
			int R=query[i][1];
			int K=query[i][2];
			int count =0;
			System.out.println(L+"*****"+R+"*****"+K);
			for (int j = price.indexOf(L); j <=price.indexOf(R)-1; j++) {
				
				if(price.get(j)%K==0){
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
