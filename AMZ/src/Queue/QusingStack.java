package Queue;

import java.util.Stack;

public class QusingStack {

	static class Queue{
		Stack<Integer>stack;
	}
	
	
	public static void main(String[] args) {

		Queue q = new Queue();
        q.stack = new Stack<>();
         
        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
         
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
         
	}
	
	
	public static void enQueue(Queue q,int i){
		q.stack.push(i);
	}
	
	public static int deQueue(Queue q){

		int res=0,x;
		if(q.stack.size()==0){
			System.out.println("Queue is empty ");
		}
		if(q.stack.size()==1){
			System.out.println("tttt");
			return q.stack.pop();
		}else{

			x=q.stack.pop();
            
			res=deQueue(q);
			q.stack.push(x);
			return res;
		}

	}
	

}
