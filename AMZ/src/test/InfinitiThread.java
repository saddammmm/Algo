package test;

public class InfinitiThread {

	Object monitor=new Object();
	int n=1;
	int max=10;

	public static void main(String[] args) {

		InfinitiThread obj=new InfinitiThread();
		
		Thread t1=new Thread( obj.new Printer(3, 0));
		Thread t2=new Thread( obj.new Printer(3, 1));
		Thread t3=new Thread( obj.new Printer(3, 2));
		
		t1.start();
		t2.start();
		t3.start();
		
	}




	class Printer implements Runnable{


		int maxThred;
		int threadId;

		public Printer(int maxThred,int threadId) {
			this.threadId=threadId;
			this.maxThred=maxThred;
		}


		@Override
		public void run() {

			try {
				printTask();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void printTask() throws InterruptedException{

			while(true){

				synchronized(monitor){

					Thread.sleep(100);
					if(n%maxThred!=threadId){
						try {
							monitor.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else{
						System.out.println("Thread["+threadId+"]"+n);
						monitor.notifyAll();
						n++;
						
						if(n==max-1)
							break;
					}
					
				}

			}

		}



	}

}


