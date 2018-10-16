package Easy;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0){
			String a,b,cd;
			b=sc.nextLine();
			a=sc.nextLine();
		//	System.out.println(b+"   "+a);
			cd=a;
			int c=0;
			for (int i = a.length()-1; ; ) {

				
				if(c==2)
					break;
				
				a=a.charAt(i)+a.substring(0,a.length()-1);
				
				c++;
				//System.out.println(a);
			}
			//System.out.println("final ::"+a);
			if(a.equals(b)){
				System.out.println("1");
			}else{
				c=0;
				for (int i = 0; ; ) {

					
					if(c==2)
						break;
					
					cd=cd.substring(i+1,cd.length())+cd.charAt(i);
					c++;
				}
				if(cd.equals(b)){
					System.out.println("1");
				}else{
					System.out.println("0");
				}
			}
       t--;
		}
	}

}
