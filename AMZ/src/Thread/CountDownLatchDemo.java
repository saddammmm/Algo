package Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[]args) throws InterruptedException{
		 // Let us create task that is going to 
        // wait for four threads before it starts
       // CountDownLatch latch = new CountDownLatch(4);
		CustomCountDownLatch latch=new CustomCountDownLatch(4);
 
        // Let us create four worker 
        // threads and start them.
        Worker first = new Worker(latch, 1000, 
                                  "WORKER-1");
        Worker second = new Worker(latch, 2000, 
                                  "WORKER-2");
        Worker third = new Worker(latch, 3000, 
                                  "WORKER-3");
        Worker fourth = new Worker(latch, 4000, 
                                  "WORKER-4");
        first.start();
        second.start();
        third.start();
        fourth.start();
 
        // The main task waits for four threads
        latch.await();
 
        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                           " has finished");
		
		
	}
	
	
}

class Worker extends Thread{

	private CustomCountDownLatch latch;
	//String name;
	private int delay;
	public Worker(CustomCountDownLatch latch,int delay,String name) {
		//super(name);
		this.latch=latch;
		this.delay=delay;
	}
	
	@Override
	public void run() {

		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()
                    + " finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}