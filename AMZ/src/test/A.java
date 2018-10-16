package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class B {
	public static void show(){
		System.out.println("Hellow show BBB");
	}
	
	public void display(){
		System.out.println(" display  BBBBB");
		
		//Executors.newCachedThreadPool()
	}
	
}
public class A extends B
{
	
	public static void show(){
		System.out.println("Hellow show AAAAAAAAA");
	}
	
	public void display(){
		System.out.println(" display  AAAAAA");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	A a=(A) new B();
		
		B a=new A();
		a.display();
		a.show();
		
		
	}

}
