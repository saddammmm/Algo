public class H1 {

	public static void main(String[] args) {
		int a[]={1,2,6,2,5};
		int sum[]=new int[a.length];
		int sum1=0;
		for(int i=0;i<a.length;i++){
			sum1=sum1+a[i];
			sum[i]=sum1;
		}
		int min=(Math.abs(a[0]-sum[a.length-1]));
		for(int i=1;i<a.length;i++){
			int currSum=sum[i-1]+a[i];
			int req=Math.abs(sum[a.length-1]-currSum);
			int minReq=Math.abs(req-currSum);
			if(currSum>req){
				continue;
			}
			if(min>minReq){
				min=minReq;
			}
		}
		System.out.println("min->"+min);
	}
}