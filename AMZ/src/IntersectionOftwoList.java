

public class IntersectionOftwoList {

	Node head,result;
	static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public static void main(String []args){
		IntersectionOftwoList list=new IntersectionOftwoList();
		Node h1,h2;
		h1=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);

		h1.next=second;
		second.next=third;
		System.out.println("list created ");
		printList(h1);
		
		
		h2=new Node(1);
		Node hsec=new Node(10);
		Node hthird=new Node(3);

		h2.next=hsec;
		hsec.next=hthird;
		System.out.println("list created h222222");
		printList(h2);
		
		System.out.println("final________");
		
		printList(list.result);
		
		
	}
	public static void printList(Node h){

		Node temp=h;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}


	}
	public static void intersection(Node h1,Node h2, IntersectionOftwoList l){

		Node t1=h1,t2=h2,temp;
		boolean []hash=new boolean[100];

		while(t1!=null){
			hash[t1.data]=true;
			t1=t1.next;
		}

		while(h2!=null){
			if(hash[h2.data]==true)
			{
				pushAtEnd(h2.data, l);
				System.out.println("hhh"+h2.data);
				h2=h2.next;
			}else{
				h2=h2.next;
			}

		}
	}

	public static void pushAtEnd(int newData,IntersectionOftwoList list){

		Node temp=list.result;
		Node newNode=new Node(newData);
		if(temp==null){
			list.result=newNode;
		}else if(temp.next==null){
			list.result.next=newNode;
		}else if(temp.next!=null){

			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	public static void deleteHight(IntersectionOftwoList list){
		
		Node temp=list.head,next;
		
		/*
		 * 12->15->10->11->5->6->2->3->NULL
		 */
		
		while(temp!=null){
			
		}
		
		
	}
	
	
}
