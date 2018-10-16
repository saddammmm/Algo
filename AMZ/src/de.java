import java.util.Scanner;


public class de {

	public static void main(String[] args) {
		
		int t,n;
		int mod=1000000007;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0){
			int cabLen=0;
			n=sc.nextInt();
			int[]l=new int[n];
			int[]p=new int[n];
			for (int i = 0; i < n; i++) {
				l[i]=sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				p[i]=sc.nextInt();
			}
			
			for (int i = 0; i <n; i++) {
				for (int j = i+1; j < n; j++) {
					int diff=l[j]-l[i];
					int cab=max(p[i], p[j]);
					cabLen+=(diff*cab)%mod;
				}
				
			}
			
			/*int last=l[n-1]-l[0];
			int lastpop=max(p[n-1], p[0]);
			cabLen+=(last*lastpop)%mod;*/
			
			System.out.println(cabLen%mod);
			
			
			
			t--;
		}
		
		
	}
	
	public static int max(int a,int b){
		
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}

}
