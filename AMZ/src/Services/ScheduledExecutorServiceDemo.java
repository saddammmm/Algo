package Services;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	
	public static void main(String[]args){
		
		ScheduledExecutorService s= Executors.newScheduledThreadPool(5);
		ScheduledThreadPoolExecutor a=new ScheduledThreadPoolExecutor(10);
		
		
		T task=new T();
		s.scheduleAtFixedRate (task, 5,5, TimeUnit.SECONDS);
		//s.shutdown();
		
	}
	
}

class T implements  Runnable{

	

	@Override
	public void run() {
		System.out.println("Running task");
		// TODO Auto-generated method stub
		
	}
	
}
