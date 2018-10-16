import java.util.Scanner;


public class test extends Variant {

	public static void main(String[] args) {
		
		
		
		
		
		int array[]= new int[100];
		{
			int index=0;
			for(int i=0;i<100;i++)
			{
				int m; 
				m=search(i);
				if(m==2 ){
					array[index++]=i;
				}
			}
		}}


	static int search(int i) 
	{
		for(int n=1;n<=Math.sqrt(i);n++){
			 if(i%2==0){
				i=i/2;
				System.out.println(i);
			}
		}
		return i;
	}
}
