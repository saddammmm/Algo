package LinkedList;

import LinkedList.LoopDetection.Node;

public class ClasicLinkedListProblem {

	public static Node head;
	
	static class Node{

		int data;
		Node next;
		public Node(int data) {

			this.data=data;

		}

	}
	
	
	public static void main(String[] args) {
/*
		for (int i = 0; i < 10; i++) {
			push(i);
		}*/
		head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node forth=new Node(4);
		Node fifth=new Node(5);
		
		head.next=second;
		second.next=third;
		third.next=forth;
		forth.next=fifth;
		fifth.next=second;
		//PrintList();
		//recursiveReverse(head, null);
		//reverseLinkedList();
		//System.out.println();
		//PrintList();
		//PrintList();
		detectLoop();
		PrintList();
		//detectLoop();
		
		
		
		
	}
	
	public static void push(int data){
		
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	public static void PrintList(){
		
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
		
	}
	
	
	public static void  reverseLinkedList(){
		
		Node current=head,prev=null,next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		head=prev;
		
	}
	
	public static void recursiveReverse(Node current ,Node prev){

		if(current.next==null){
			head=current;
			current.next=prev;
			return;
		}

		Node next2=current.next;
		current.next=prev;

		recursiveReverse(next2, current);
		return;
	}
	
	public static void detectLoop(){
		
		Node curr=head;
		Node nextNext=head.next.next;
		Node prev=null;
		
		
		while(curr!=null&&nextNext!=null&&nextNext.next!=null){
			
			if(curr==nextNext){
				System.out.println(">>>>"+curr.data+" "+nextNext.data);
				removeLoop(curr,nextNext);
				return;
			}
			prev=curr;
			curr=curr.next;
			nextNext=nextNext.next.next;
			
			
		}
		
		//System.out.println("+++++++ no loopp+++++++++++");
	}
	

	public static void removeLoop(Node first,Node Second){
		
		System.out.println(first.data+" >>"+Second.data);
		int c=0;
		while(Second.next!=first){
			
			Second=Second.next;
			c++;
		}
		while(c>1)
		{
			c--;
			first=first.next;
		}
		System.out.println("loop size +"+c);
		first.next=null;
		
	}
	
}
