import java.util.Scanner;


public class SwapNode {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	public static void main(String[] args) {

		SwapNode list=new SwapNode();
		int n,m,x,y;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		Node h1=null,h2=null;

		for(int i=0;i<n;i++){
			if(i==0)
				h1=new Node(sc.nextInt());
			else

				pushAtEnd(sc.nextInt(), h1);
		}
		printList(h1);

		x=sc.nextInt();
		y=sc.nextInt();


		swap(h1, x, y);
		printList(h1);



	}
	public static void pushAtEnd(int newData,Node head){

		Node temp=head;
		Node newNode=new Node(newData);
		if(temp==null){
			head=newNode;
		}else if(temp.next==null){
			head.next=newNode;
		}else if(temp.next!=null){

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	public static void printList(Node head){

		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}


	}

	public static void swap(Node h,int x,int y){

		Node t1=h,t2=h;

		if(x==y)
			return;


		while(t1!=null&&t1.data!=x){
			t1=t1.next;
		}
		while(t2!=null&&t2.data!=y){
			t2=t2.next;
		}

		if(t1==null||t2==null)
			return;


		int temp=t1.data;
		t1.data=t2.data;
		t2.data=temp;

	}

}
