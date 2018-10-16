package test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;




public class CyclicBarrireDemoTest implements Runnable {

	public static CyclicBarrier barrier=new CyclicBarrier(3);
	
	public static void main(String[] args) {

		CyclicBarrireDemoTest task3=new CyclicBarrireDemoTest();
		
		Thread t1=new Thread(task3);
		t1.start();
		
		
	}

	@Override
	public void run() {

		 System.out.println("Number of parties required to trip the barrier = "+
			      barrier.getParties());
			      System.out.println("Sum of product and sum = " + (Task1.product + 
			    		  Task2.sum));
			      Task1 task1=new Task1();
			      Task2 task2=new Task2();
			      
			      Thread t1=new Thread(task1);
			      Thread t2=new Thread(task2);
			      t1.start();
			      t2.start();
			      
			      try {
					CyclicBarrireDemoTest.barrier.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			      
			      
			      System.out.println("Sum of product and sum = " + (Task1.product + 
			    		  Task2.sum));
			      System.out.println("Number of parties required to trip the barrier = "+
					      barrier.getParties());
		
	}

}

class Task1 implements Runnable{

	public static int product=0;
	
	@Override
	public void run() {

		product=2*10;
		
		try {
			CyclicBarrireDemoTest.barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


class Task2 implements Runnable{

	public static int sum;
	@Override
	public void run() {

		sum=10+12;
		try {
			CyclicBarrireDemoTest.barrier.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

