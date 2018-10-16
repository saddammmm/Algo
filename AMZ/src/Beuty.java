import java.util.Scanner;


public class Beuty {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		char[]a={'a','e','i','0','u'};
		PossibleStr(a, "", 5, n);
		
	}
	
	public static void PossibleStr(char[]set,String prefix,int n,int k){
		int res=0;
		
		if(k==0){
			System.out.println(prefix);
			return;
		}
		
		for (int i = 0; i < n; ++i)
		{

			String newPrefix = prefix + set[i]; 
            System.out.println("test:  "+newPrefix);
			PossibleStr(set, newPrefix, n, k - 1); 
		}
		
		
		
		
	}

}
