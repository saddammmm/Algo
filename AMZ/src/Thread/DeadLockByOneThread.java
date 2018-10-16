package Thread;

public class DeadLockByOneThread {

	public static void main(String[] args) {

		
		System.out.println(">>>>>>>>>>>  entering in deadlock>>>>>>>>>>>");
		try {
			Thread.currentThread().join();
            System.out.println("This will never executed >>>>>>");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
