package LinkedList;

public class LoopDetection {
	 Node  head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	public static void main(String[] args) {
		
		int a,b,c;
		a=b=c=12;
		System.out.println(a);
		LoopDetection loop=new LoopDetection();
		loop.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node forth=new Node(4);
		Node fifth=new Node(5);
		
		loop.head.next=second;
		second.next=third;
		third.next=forth;
		forth.next=fifth;
		fifth.next=second;
		System.out.println(loop);
		//printList(loop.head);
		detectLoop(loop.head);
		//1-2-3-4-5-2
	}
	public static void detectLoop(Node head){
		Node n=head,temp=head;
		
		while(n!=null&&temp!=null&&temp.next!=null){
			n=n.next;
			temp=temp.next.next;
			System.out.println(n.data+"===="+temp.data);
			if(n==temp){
				System.out.println("Loop detected");
				break;
			}
			
			
		}
	}

	public static void printList(Node head){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
		
	}
	public static void reverseList(Node Head){

		Node current=Head,prev=null,next=null;

		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;

		}
		Head=prev;
	}
	
	
	public static Node reverseListInGroupofK(Node Head,int k){

		Node current=Head,prev=null,next=null;

		int count=0;
		while(current!=null&&count<k){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;

		}
		
		if(next.next!=null)
			Head.next=reverseListInGroupofK(Head,k);
		
		return prev;
		
	}
}
