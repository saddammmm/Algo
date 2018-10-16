



public class NthNodeinLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
		
	}

	public static void main(String[] args) {
		
		
		
		
		
	}
	public static void printList(NthNodeinLinkedList list){

		Node temp=list.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}


	}
	public static void push(int new_data,NthNodeinLinkedList list){

		Node newNode=new Node(new_data);
		newNode.next=list.head;
		list.head=newNode;


	}
}
