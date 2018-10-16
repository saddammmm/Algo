import javax.print.attribute.standard.Finishings;




public class Loop {
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
		
		Loop list=new Loop();
		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node forth=new Node(4);
		Node fifth=new Node(5);


		list.head.next=second;
		second.next=third;
		third.next=fifth;
		fifth.next=list.head;
		loop(list.head);
	}
	
	public static void loop(Node head){
		
		Node slow=head,fast=head;
		
		while(fast!=null&&slow!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow){
				System.out.println("loop detect");
				return;
			}
			
			
		}
		
	}

}
