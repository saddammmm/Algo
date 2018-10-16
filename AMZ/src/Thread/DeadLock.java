package Thread;

public class DeadLock implements Runnable {

	public static void main(String[] args) {

		Thread t1=new Thread(new DeadLock());
		Thread t2=new Thread(new DeadLock());
		t1.start();
		t2.start();
		
	}


	public void method1() { 
		synchronized (String.class) { 
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object"); 
			} 
		} 
	}

	public void method2() { 
		synchronized (Integer.class) { 
			System.out.println("Aquired lock on String.class object"); 
			synchronized (String.class) {
				System.out.println("Aquired lock on Integer.class object"); 
			} 
		} 
	}


	@Override
	public void run() {

		
			method1();
			method2();
		
	}
}
