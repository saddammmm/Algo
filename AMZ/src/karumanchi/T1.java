package karumanchi;

import java.util.Scanner;

public class T1 {

	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
        
        int t= s.nextInt();
        int t1= s.nextInt();
        
        int a=0;
        int loop=0000;
        for (loop=0000; loop<=2400; loop++)
        {
            a = pallindrome(loop);
            
            System.out.println(loop);  
        }
	}
	
	public static int pallindrome(int loop)
	{
	    if (loop >= 10)
	    {
	        int temp, temp1 = 0, sum = 0;
	        for(temp = 0; temp < 2;temp++)
	        {
	            temp1 = loop % 10;
	            loop = loop / 10;
	            sum = sum * 10 + temp1;
	        }
	        return(sum);
	    }
	    else
	    {
	        return(loop * 10);
	    }
	}

}




