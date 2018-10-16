package OPPS;


class test3{
	public void foo(){
		System.out.println(">> fooo");
	}
	
	public void foo4(){
		System.out.println(">> fooo test3");
	}
}

class test4 extends test3{
	
	public void foo(){
		System.out.println(">> fooo2222222222");
	}
	
	public void foo2(){
		System.out.println(">> fooooooooooooooo test4");
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		test3 obj=new test4();
		
		
		obj.foo4();

	}

}
