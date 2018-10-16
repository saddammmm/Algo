package Thread;

public class MyFirstThread2 extends Thread{

	public void run(){
		System.out.println("Inside nun  ........");
		go();
	}
	
	
	private void go() {
		System.out.println("Inside go ........... ");
		more();
	}


	private void more() {
		System.out.println("Inside more .......");
	}


	public static void main(String[] args) {

		Thread tread=new MyFirstThread2();
		tread.start();
		
		System.out.println("Inside main  .......");
		
	}

}
