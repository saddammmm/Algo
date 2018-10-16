package Easy;

public class BinaryTreeisSumTree {

	Node root;
	
	static class Node{
		Node left,right;
		int key;
		public Node(int data) {
			key=data;
		}
	}
	
	public static int sum(Node node){
		
		if(node==null)
			return 0;
		
		return sum(node.left)+node.key+sum(node.right);
		
		
	}
	public static void main(String[] args) {
		
		BinaryTreeisSumTree t1=new BinaryTreeisSumTree();
		t1.root=new Node(1);
		t1.root.left=new Node(2);
		t1.root.right=new Node(3);
		t1.root.left.left=new Node(4);
		t1.root.right.right=new Node(5);
		
	}
	
	public static int isBinaryTreeisSumTree(Node node){
		
		Boolean result=false;
		
		
		int ls=sum(node.left);
		int rs=sum(node.right);
		
		if(ls==node.key&&rs==node.key
				&&(isBinaryTreeisSumTree(node.left)!=0)&&isBinaryTreeisSumTree(node.right)!=0){
					return 1;
				}
		
		return 0;
		
		
		
	}

}
