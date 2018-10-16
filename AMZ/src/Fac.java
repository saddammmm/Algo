import java.math.BigInteger;
import java.util.Scanner;


public class Fac {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,t;
		t=sc.nextInt();
		while(t>0){
			n=sc.nextInt();
			System.out.println(fact(n));
			t--;
		}

	}

	public static BigInteger fact(int n){
		BigInteger res=BigInteger.ONE;
		for(int i=1;i<=n;i++){
			res=res.multiply(BigInteger.valueOf(i));
		}
		return res.mod(BigInteger.valueOf(1000000007));
	}
}
