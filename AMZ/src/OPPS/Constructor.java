package OPPS;

public class Constructor extends test1 {

	Constructor(int a,int b){
		super(a, b);
		System.out.println("hellll Vyas Radhakrishnan"+a+" "+b);
	}
	
	public static void main(String[]args){
		
		test1 a=new Constructor(1,2);
	}
}
  

class test1 {
	test1(float  a,int b){
		System.out.println("hello   "+a+" "+b);
	}
}