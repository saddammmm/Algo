package Queue;

public class Queue {
	
	public static class Node{

		private int data;
		private Node next;
		public Node(int data) {

			this.data=data;

		}
		
}

	Node head;//removing data
	Node tail;//adding data
	
	public boolean isEmpty(){
		
		return head==null;
	}
	public int peek(){
		
		return head.data;
	}
	public void add(int data){
		
		Node node=new Node(data);
		if(tail!=null){
			tail.next=node;
		}
		tail=node;
		if(head==null)
			head=node;
	}
	public int remove(){
		int data=head.data;
		head=head.next;
		if(head==null){
			tail=null;
		}
		return data;
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
