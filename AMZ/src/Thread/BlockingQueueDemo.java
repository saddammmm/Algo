package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class Message{
	
	String message;
	
	public Message(String msg) {
		
		message=msg;
	}
	
	public String getMessage(){
		
		return message;
	}
	
	
}

class Producerqq implements Runnable{

	BlockingQueue<Message>q;
	
	public Producerqq(BlockingQueue<Message>q ) {
		
		this.q=q;
	}
	
	
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			
			Message m=new Message(""+i);
			try {
				Thread.sleep(i);
				q.put(m);
				System.out.println("Producing message >>"+m.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		Message ex=new Message("exit");
		try {
			q.put(ex);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}



class Consumerrr implements Runnable{

	BlockingQueue<Message>q;
	
	public Consumerrr(BlockingQueue<Message>q ) {
		
		this.q=q;
	}
	
	
	@Override
	public void run() {

		try {
			Message msg;

			while((msg = q.take()).getMessage() !="exit"){
				Thread.sleep(10);
				System.out.println("Consumed "+msg.getMessage());
			}
		} catch (InterruptedException  e) {
			// TODO: handle exception
		}

	}
	
	
}


public class BlockingQueueDemo {

	public static void main(String []args){
		BlockingQueue<Message>q=new ArrayBlockingQueue<Message>(10);
		Producerqq p=new Producerqq(q);
		Consumerrr c=new Consumerrr(q);
		new Thread(p).start();
		new Thread(c).start();
	}
}

