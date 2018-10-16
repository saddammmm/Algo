import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Practo {

	public static void main(String[] args) {

		
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		for (int i = 0; i < 2*n; i++) {
			a.add(sc.nextInt());
		}
		
		Collections.sort(a);
		int sum=0;
		for (int i = 0; i <a.size(); ) {
			sum+=a.get(i);
			i=i+2;
		}
		System.out.println(sum);
		
		
		
	}

}
