package karumanchi;

import java.util.Scanner;

public class TimeFo {

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		sc.nextLine();
		while(t>0){
			String start,finalh="",finalm="",end;
			start=sc.nextLine();
			end=start.substring(start.indexOf(" ")+1);
			start=start.substring(0,start.indexOf(" "));
			
			//System.out.println(start+"----"+end);
			String h1=start.substring(0,2);
			String m1=start.substring(2,4);

			int fh=Integer.parseInt(h1);
			int fm=Integer.parseInt(m1);


			String h2=end.substring(0,2);
			String m2=end.substring(2,4);


			int fh1=Integer.parseInt(h2);
			int fm1=Integer.parseInt(m2);

			int count=0;

			for(int i=fh;i<fh1;i++){

				for(int j=fm;j<=59;j++){
					if(i<10)
						finalh="0"+Integer.toString(i);
					else
						finalh=Integer.toString(i);
					if(j<10)
						finalm="0"+Integer.toString(j);
					else
						finalm=Integer.toString(j);
					String test=new StringBuilder(finalh+finalm).reverse().toString();
					if(test.equals(finalh+finalm)){
						count++;
					}

				}

			}
			if(new StringBuilder(end).reverse().toString().equals(end)){
				count++;
			}
			System.out.println(count);
			t--;
		}
	}
}
