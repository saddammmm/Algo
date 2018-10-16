package Queue;

import java.util.Stack;

public class QueuewitTwoStack {

	
	static class Queue{
		Stack<Integer>s1;
		Stack<Integer>s2;
	}
	
	
	public static void main(String[] args) {

		
		
		 Queue q= new Queue();
	        q.s1 = new Stack<>();
	        q.s2 = new Stack<>();
	        enQueue(q, 1);
	        enQueue(q, 2);
	        enQueue(q, 3);
	         
	        System.out.print(deQueue(q)+" ");
	        System.out.print(deQueue(q)+" ");
	        System.out.println(deQueue(q)+" ");
		
		
	}
	
	
	public static void enQueue(Queue q,int i){
		q.s1.push(i);
	}

	public static int deQueue(Queue q){
		
		if(q.s1.size()==1){
			return q.s1.pop();
		}else{
			
			if(q.s2.empty()){
				
				while(!q.s1.isEmpty()){
					q.s2.push(q.s1.pop());
				}
				
			}
			
		}
		return q.s2.pop();
		
		
	}
	
}
