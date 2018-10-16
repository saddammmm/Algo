package test;


public class EvenOddTest {

	public static void main(String[] args) {

		Print print=new Print();
		Thread odd=new Thread(new EvenOddTask(print, false, 10));
		Thread even=new Thread(new EvenOddTask(print, true, 10));

		
		even.start();
		odd.start();
	}

}


class EvenOddTask implements Runnable{

	Print print;
	boolean isEvenNumber;
	int maxNum;


	public EvenOddTask(Print print,boolean isEvenNumber,int maxNum) {

		this.print=print;
		this.isEvenNumber=isEvenNumber;
		this.maxNum=maxNum;
	}


	@Override
	public void run() {

		int num;
		if(isEvenNumber)
			num=2;
		else
			num=1;

		while(num<=maxNum){

			if(isEvenNumber)
				print.printEven(num);
			else
				print.printOdd(num);

			num+=2;
		}

	}
}



class Print{
	
	boolean isOdd=false;
	
	public synchronized void printOdd(int num){
		
		
		while(isOdd==true){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Odd num"+num);
		isOdd=true;
		notifyAll();
		
	}
			
	public synchronized void printEven(int num){
		
		while(isOdd==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Even Num"+num);
		isOdd=false;
		notifyAll();
	}
	
	
	
}