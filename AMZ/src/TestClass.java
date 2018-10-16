import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
    public static void main(String args[] ) throws Exception {
    	
    
    	Scanner sc=new Scanner(System.in);
    	int n,k, t;
    	t=sc.nextInt();
    	int []res=new int[t];
    	ArrayList<Integer>re=new ArrayList<Integer>();
    	for (int u = 0; u <t; u++) {
    		
    			n=sc.nextInt();
    			k=sc.nextInt();

    			int[]a=new int[n];
    			for (int i = 0; i < n; i++) {
    				a[i]=sc.nextInt();
    			}
    			re.add(cal(a, n, k));
    			System.out.println(re);
    			sc.next();
    		
    		
    	}
    	System.out.println(res);
    	
    }
    
    public static void baseconvert(ArrayList<BigInteger>arr, BigInteger n, int base){
     
     
    BigInteger rem,j;
     
     while(n.compareTo(BigInteger.ZERO)>0){
         rem=n.mod(new BigInteger("4"));
         arr.add(rem);
         n=n.divide(new BigInteger("4"));
     }
     
    }
    
    static int solve(int n){
        
        int res=0;
        
        return 1+(n*2)+(n*((n*n)-1)/2);
        
        
        
 
    }
    
    static int cal(int arr[], int n, int k) {
    	int ans = 0; 

    	int count = 0;

    	int f = 0;

    	for (int i = 0; i < n;) {
    		count = 0;
    		f = 0;

    		while (i < n && arr[i] <= k) {
    			count++;
    			if (arr[i] == k)
    				f = 1;
    			i++;
    		}

    		if (f == 1)
    			ans += count;

    		while (i < n && arr[i] > k)
    			i++;
    	}
    	return ans;
    }
 
}
