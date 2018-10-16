package sortinAlgo;

public class printOddEvneByTwoThread {

	public static void main(String[] args) {

		Printer print=new Printer();
		Thread t1=new Thread(new TaskEvenOdd(10, true, print));
		Thread t2=new Thread(new TaskEvenOdd(10, false, print));
		t1.setName("Even");
		t2.setName("Odd");
		t1.start();
		t2.start();
		
	}

}

class TaskEvenOdd implements Runnable{

	int max;
	boolean isEvenNumber;
	Printer print;
	
	public TaskEvenOdd(int max,boolean isEvenNumber,Printer print) {
	
		this.max=max;
		this.isEvenNumber=isEvenNumber;
		this.print=print;
		
	}
	@Override
	public void run() {
     
		int num=isEvenNumber==true?2:1;
		while(num<=max){
			if(isEvenNumber){
				print.printEven(num);
			}else{
				print.printOdd(num);
			}
			num+=2;
		}
		
	}
	
}

class Printer{

	boolean isOdd=false;
	public synchronized void printEven(int num){

		while(isOdd==false){
			try {
				System.out.println("inside print even "+Thread.currentThread().getName());
				wait();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(Thread.currentThread().getName()+ "Even num :"+num );
		isOdd=false;
		notifyAll();
	}
	public synchronized void printOdd(int num){

		while(isOdd==true){
			try {
				System.out.println("inside print odd "+Thread.currentThread().getName());
				wait();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(Thread.currentThread().getName()+ "Odd num : "+num);
		isOdd=true;
		notifyAll();
		
	}
}