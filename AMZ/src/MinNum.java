import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class MinNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		ArrayList<BigInteger>a=new ArrayList<BigInteger>();
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
			
			a.add(sc.nextBigInteger());
			
		}
		
		BigInteger sum=BigInteger.ZERO;
		
		for (int i = 0; i < a.size(); i++) {
			sum=sum.add(a.get(i));
		}
		
		BigInteger diff1=sum,diff2=BigInteger.ZERO;
		
		for (int i = 0; i < a.size(); i++) {
			
			if(diff2.compareTo(diff1)<0){
			diff1=diff1.subtract(a.get(i));
			diff2=sum.subtract(diff1);
			}
			
		}
		System.out.println(diff2.subtract(diff1));
		
	}

}
