package test;

public class AA extends BB {

	int a=14;
	public   void show(){
		
		System.out.println("AAAAAAAAAA");
	}
	
	public void display(){
		System.out.println("AAAAAAAAAA display");
	}
	
	
	public static void main(String[]args){
		
		//AA a=new BB();
		
		BB b=new AA();
		
		System.out.println(b.a);
		b.show();
		b.display();
		
	
	}
	
}

class BB{

	int a=10;
	public   void show(){
		System.out.println(" BBBBBBBBB");
	}
	
	public void display(){
		System.out.println("bbbbbbbb display"+a);
	}
}


class CC{
	
}

class DD{
	
}