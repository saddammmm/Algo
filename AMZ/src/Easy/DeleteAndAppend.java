package Easy;

import java.util.Scanner;

public class DeleteAndAppend {

	public static void main(String[] args) {
		
		
		String s,t;
		int k;
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextLine();
		t=sc.nextLine();
		k=sc.nextInt();
		int index=0;
		for (int i = 0; ; i++) {
			index=i;
			if(s.charAt(i)!=t.charAt(i))
				break;
		}
		System.out.println(s.length()-6+t.length()-6==k);
		
	}

}
