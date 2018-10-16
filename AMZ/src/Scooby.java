import java.math.BigInteger;
import java.util.Scanner;


public class Scooby {

	public static void main(String[] args) {
		
		
		int t;
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		
		BigInteger a,b,n;
		while(t>0){
			a=sc.nextBigInteger();
			b=sc.nextBigInteger();
			n=sc.nextBigInteger();
			BigInteger res=n.divide(b);
			System.out.println(res);
		}
		
		
		
	}

}
