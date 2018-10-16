package OPPS;


class MyThred extends Thread{
	
	public void run(){
		System.out.println(" indide my run");
	}
	
}

public class Test {


	public static void main(String[]args){
		
		/*String s="abc";
		String s1=s;
		s+="d";
		
		System.out.println(s +" >"+s1+" >>"+(s==s1));//abcd abc falce
		
		StringBuilder s2=new StringBuilder("abc");
		StringBuilder s3;
		s3=s2;
		s2.append("d");
		
		System.out.println(s2 +" >"+s3+" >>"+(s2==s3));//abcd abcd true
*/	
		
		Thread t=new MyThred() {
			public void run(){
				System.out.println(" >>>>>indide my run");
			}
			
		};
		t.start();
		
	}
	
}
