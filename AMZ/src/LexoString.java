import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class LexoString {

	public static void main(String[] args) {
		
		
		int n,t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0){

			n=sc.nextInt();
			sc.next();
			ArrayList<String>str=new ArrayList<String>();
			for (int i = 0; i <n; i++) {
				str.add(sc.nextLine());
			}
           System.out.println(str);

Collections.sort(str);
System.out.println(str);



			t--;
		}
	}

}
