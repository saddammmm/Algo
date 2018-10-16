public class ReverseLinked {

	
	Node head;

	public static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}

	}
	public static void main(String[] args) {
		ReverseLinked list=new ReverseLinked();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);

		list.head.next=second;
		second.next=third;
		System.out.println("list created ");
		printList(list);
		list.head=reverse(list.head);
		printList(list);
		
	}
	public static void printList(ReverseLinked list){

		Node temp=list.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	//1-2-3-4-5
	public static Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

}
