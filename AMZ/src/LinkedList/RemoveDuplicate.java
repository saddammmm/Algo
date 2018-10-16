package LinkedList;

import java.util.HashSet;

public class RemoveDuplicate {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		RemoveDuplicate list = new RemoveDuplicate();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);
 
        list.removeDuplicate2();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head);

	}
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	
	public static void  removeDuplicate2(){
		
		HashSet<Integer>hash=new HashSet<Integer>();
		
		Node current=head,prev=null;
		
		while(current!=null){
			
			int val=current.data;
			if(hash.contains(val)){
				prev.next=current.next;
			}else{
				
				hash.add(val);
				prev=current;
				
			}
			current=current.next;
		}
		
		
		
	}
	
	
	public static void  removeDuplicate(){

		Node ptr1=null,ptr2=null,dup=null;

		ptr1=head;

		while(ptr1!=null&&ptr1.next!=null){

			ptr2=ptr1;

			while(ptr2.next!=null&&ptr2.next.next!=null){

				if(ptr1.data==ptr2.next.data){
					dup=ptr2;
					ptr2=ptr2.next.next;
					System.gc();
				}else{
					ptr2=ptr2.next;
				}

			}

			ptr1=ptr1.next;
		}
	}
}
