package Thread;

public class MyFirstThread {

	public static void main(String[] args) {

		Task task=new Task();
		Thread thred=new Thread(task);//NEW
		thred.start();//Runnable
		
		System.out.println("Inside main ......");
		
	}

}


class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(" inside run .....");
		go();
		
	}

	private void go() {
		System.out.println(" inside go .....");	
		more();
	}

	private void more() {
		System.out.println(" inside more .....");			
	}
	
	
	
	
}