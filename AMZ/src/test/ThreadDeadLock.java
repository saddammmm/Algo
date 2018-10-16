package test;

public class ThreadDeadLock {

	public static Object lock1=new Object();
	public static Object lock2=new Object();
	
	public static void main(String[]args){
		
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		
		t1.start();
		t2.start();
		
	}
	
	
	public static class thread1 extends Thread{
		
		public void run(){
			synchronized (lock1) {
				System.out.println("Thread 1 : holding  lock 1 ");
				
				System.out.println("Thread1 : waiting for lock 2");
				
				synchronized (lock2) {
					System.out.println("Thread 1 : holding  lock 2 ");
				}
			}
		}
		
	}
	
public static class thread2 extends Thread{
		
		public void run(){
			synchronized (lock2) {
				System.out.println("Thread 2 : holding  lock 2 ");
				
				System.out.println("Thread2 : waiting for lock 1");
				
				synchronized (lock1) {
					System.out.println("Thread 2 : holding  lock 1 ");
				}
			}
		}
		
	}
	
	
}

