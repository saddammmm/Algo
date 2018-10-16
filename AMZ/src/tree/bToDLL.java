	package tree;

public class bToDLL {

	TNode root;
	public static void main(String[] args) {
		bToDLL tree=new bToDLL();
		//tree.root=new TNode(1);
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.left.right = new TNode(5);
		tree.root.right.left = new TNode(6);
		tree.root.right.right = new TNode(7);
		tree.root.right.left.right = new TNode(8);
		tree.root.right.right.right = new TNode(9);
		
		printLisr(treeToList(tree.root));
	}

	//<-1<->2<->3<->4<->    <-5<->6<->7->
	public static TNode concnate(TNode a, TNode b){

		if(a==null)
			return b;
		if(b==null)
			return a;

		TNode aEnd=a.left;
		TNode bEnd=b.left;

		a.left=bEnd;
		bEnd.right=a;

		aEnd.right=b;
		b.left=aEnd;

		return a;

	}

	public static TNode treeToList(TNode n){

		if(n==null)
			return n;

		TNode leftList=treeToList(n.left);
		TNode rightList=treeToList(n.right);

		n.right=n;
		n.left=n;

		n=concnate(leftList, n);
		n=concnate(rightList, n);
		return n;


	}
	
	public static void printLisr(TNode head){
		
		TNode temp=head;
		if(temp!=null){
			do{
				System.out.print(temp.key+" ");
				temp=temp.left;
			}while(temp!=head);
		}
	}

}

