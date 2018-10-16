import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.Scanner;


public class LinkedList {
	Node head;

	public static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}

	}

	public static void main(String []args){

		LinkedList list=new LinkedList();
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();

		list.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);

		list.head.next=second;
		second.next=third;
		System.out.println("list created ");
		printList(list);
		System.out.println("list created9999999999 ");
		pushAtEnd(1,list);
		printList(list);
		/*printList(list);
		deleteNode(1, list);
		printList(list);

		deleteAtgivenPos(2, list);
		printList(list);*/
		remove(list);
		System.out.println("list created 888888888");
		printList(list);

	}

	public static void printList(LinkedList list){

		Node temp=list.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}


	}
	public static void push(int new_data,LinkedList list){

		Node newNode=new Node(new_data);
		newNode.next=list.head;
		list.head=newNode;


	}
	public static void pushAtEnd(int newData,LinkedList list){

		Node temp=list.head;
		Node newNode=new Node(newData);
		if(temp==null){
			list.head=newNode;
		}else if(temp.next==null){
			list.head.next=newNode;
		}else if(temp.next!=null){

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public static void deleteNode(int data,LinkedList list){

		Node temp=list.head,prev=null;

		if(temp!=null&&temp.data==data)
		{
			list.head=temp.next;
			return;
		}
		while(temp!=null&&temp.data!=data){
			prev=temp;
			temp=temp.next;
		}

		if(temp==null)
			return;
		prev.next=temp.next;



	}

	public static void deleteAtgivenPos(int index,LinkedList list){

		Node temp=list.head,prev=null;

		if(temp==null){
			return;
		}
		if(index==0){
			list.head=temp.next;
			return;
		}
		System.out.println("debug");
		for (int i = 0; temp!=null&&i<index-1; i++) {
			System.out.println("debug"+i);
			prev=temp;
			temp=temp.next;
		}

		if(temp==null||temp.next==null)
			return;

		prev.next=temp.next;


	}
	public static int count(LinkedList list){
		int c=0;

		Node temp=list.head;
		while(temp!=null){
			c++;
			temp=temp.next;
		}

		return c;
	}
	public static int countRecursive(Node head){
		if(head==null)
			return 0;
		return 1+countRecursive(head.next);
	}
	public static void remove(LinkedList list){

		boolean []hash=new boolean[100];
		Arrays.fill(hash, false);
		Node temp=list.head,current=null;

		while(temp!=null&&temp.next!=null){
			if(hash[temp.data]!=true){
				hash[temp.data]=true;
				temp=temp.next;
			}else{
				deleteNode(temp.data, list);
				//temp.next=current;
				temp=temp.next;
			}

		}

	}

}
