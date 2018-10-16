package Services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TestThreadPool {
	public static void main(String[] args) throws InterruptedException {
		//create queue size - 3
		//Number of threads - 4
		ThreadPool threadPool = new ThreadPool(3,4);
		//Created 15 Tasks and submit to pool
		
		ScheduledExecutorService se=Executors.newScheduledThreadPool(10);
		
			for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
				TestTask task = new TestTask(taskNumber);
				threadPool.submitTask(task);
				
			}
		
	}
}