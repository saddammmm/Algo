package OPPS;


class A{
	
	A(String a, int b){
		System.out.println("inside AAAAAAAAAAA");
	}
	/*protected void test(){
		System.out.println("AAAA");
	}*/
}

class B extends A{
	
	B(int a, int b){
		super("aa", b);
		System.out.println("Inside BBBBBBBBB");
	}
	/*public void test(){
		System.out.println("BBBBBBBBBB");
	}*/
}

public class Overloading {

	public static void main(String[] args) {

		
		A a=new B(1,4);
		//a.test();
		
	}

}
