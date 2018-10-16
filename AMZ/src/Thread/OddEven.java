package Thread;


public class OddEven {

	public static void main(String[]args){

		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
		t1.setName("T1");
		Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
		t2.setName("T2");
		
		t2.start();
		t1.start();
	}
	
	
}

class TaskEvenOdd implements Runnable{

	
	private int max;
	private Printer print;
	private boolean isEvenNumber;
	
	public TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {

		this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
		
	}
	
	@Override
	public void run() {

		int num=isEvenNumber==true?2:1;
		
		while(num<max){
			System.out.println("mainnnnn");
			if(isEvenNumber){
				System.out.println(">>>>");
				print.printEven(num);
			}else{
				System.out.println("<<<<<<<");
				print.printOdd(num);
			}
			num+=2;
		}
			
		
		
		
	}
	
}


class Printer{
	
	boolean isOdd=false;
	
	synchronized   void printEven( int num){
		while(isOdd==false){
			try {
				System.out.println("waitin---"+Thread.currentThread().getName());
				wait();
			} catch (InterruptedException  e) {
				
			}
		}
		System.out.println(Thread.currentThread().getName()+"Even ::"+num);
		isOdd=false;
		notifyAll();
		
	}
	
	synchronized   void printOdd( int num){
		while(isOdd==true){
			try {
				System.out.println("waitin 222---"+Thread.currentThread().getName());
				wait();
			} catch (InterruptedException  e) {
				
			}
		}
		System.out.println(Thread.currentThread().getName()+"Odd ::"+num);
		isOdd=true;
		notifyAll();
		
	}
	
}

