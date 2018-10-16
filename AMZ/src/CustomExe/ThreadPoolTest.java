package CustomExe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void main(String[] args) throws ExecutionException {

		
		ExecutorService service =Executors.newFixedThreadPool(3);
		
		//ExecutorService service =Executors.newCachedThreadPool();
		
		
		
		for (int i = 0; i < 4; i++) {
			Task t=new Task(i);
			Future f=service.submit(t);
			System.out.println(">>>>>>"+f.isCancelled());
		}
		
		service.shutdown();
		
	}

}


class Task implements Runnable{

	int taskNumber;
	
	public Task(int taskNumber) {

		this.taskNumber=taskNumber;
	}
	
	@Override
	public void run() {
		
		System.out.println(" Task number "+taskNumber+" running by"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Completed Task Task number "+taskNumber+" running by"+Thread.currentThread().getName());
	}
	
}
