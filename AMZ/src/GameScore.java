
public class GameScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int[] scores(int[] a) {

		int []res=new int[2];

		int julia=0,sama=0;
		int n=a.length-1;
		boolean j=true,s=false;
		for(int i=0;i<=n;){
			if(j){
				julia+=max(a[i],a[n]);
				if(max(a[i],a[n])==a[i]){
					i++;
				} else{
					n--;
				} 
				j=false;
				s=true;
			}else{
				sama+=max(a[i],a[n]);
				if(max(a[i],a[n])==a[i]){
					i++;
				} else{
					n--;
				} 
				j=true;
				s=false;
			}

		}
		System.out.println("88"+julia+"--"+sama);
		res[0]=julia;
		res[1]=sama;

		return res;

	}

	public static int max(int a,int b){
		return a>b?a:b;
	}
	public static int min(int a,int b){
		return a<b?a:b;
	}

}
