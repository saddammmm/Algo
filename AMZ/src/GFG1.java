
import java.util.ArrayList;
import java.util.Scanner;
class GFG1 {
	public static void main(String args[] ) throws Exception {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int r=0;r<t;r++){
			int n=sc.nextInt();
			int[]arr=new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i];
			}
			ArrayList<Integer>res=new ArrayList<Integer>();
			int s2=0;
			for (int i = 0; i < arr.length; i++) {

				s2+=arr[i];

				if((sum-s2)-s2>0)
					
				res.add((sum-s2)-s2);
				else if((sum-s2)-s2==0)
					res.add(0);
				else
					break;
			}
			System.out.println(res);
			//Collections.sort(res);
			if(res.size()<=0){
				System.out.println("-1");
			}else{
				System.out.println(res.get(res.size()-1));
			}
			




		}


	}


}
