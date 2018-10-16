
public class Flattening {
	Node head;

	static class Node{
		int data;
		Node right,down;
		Node(int data){
			this.data=data;
			right=null;
			down=null;
		}
	}

	public static void main(String[] args) {

		Flattening L=new Flattening();
		L.head = L.push(L.head, 30);
		L.head = L.push(L.head, 8);
		L.head = L.push(L.head, 7);
		L.head = L.push(L.head, 5);

		L.head.right = L.push(L.head.right, 20);
		L.head.right = L.push(L.head.right, 10);

		L.head.right.right = L.push(L.head.right.right, 50);
		L.head.right.right = L.push(L.head.right.right, 22);
		L.head.right.right = L.push(L.head.right.right, 19);

		L.head.right.right.right = L.push(L.head.right.right.right, 45);
		L.head.right.right.right = L.push(L.head.right.right.right, 40);
		L.head.right.right.right = L.push(L.head.right.right.right, 35);
		L.head.right.right.right = L.push(L.head.right.right.right, 20);


		/* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
		 */

		//  print(L.head);

		L.head=flater(L.head);

		print(L.head);



	}
	public static Node push(Node head_ref,int data){

		Node newNode=new Node(data);
		newNode.down=head_ref;
		head_ref=newNode;
		return head_ref;
	}
	public static void print(Node head_ref){
		Node temp=head_ref;

		while(head_ref!=null){
			//temp=temp.right;
			System.out.print(head_ref.data+" ");//+temp.data);
			head_ref=head_ref.down;
		}
		System.out.println();
	}
	
	
	public static Node merge(Node a,Node b){

		Node result;

		if(a==null)
			return b;
		if(b==null)
			return a;

		if(a.data<b.data){
			result=a;
			result.down=merge(a.down, b);
		}else{
			result=b;
			result.down=merge(a, b.down);
		}

		return result;
	}
	public static Node flater(Node root){

		if(root==null||root.right==null)
			return root;
		root.right=flater(root.right);
		root=merge(root, root.right);

		return root;

}
}
