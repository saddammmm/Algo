
public class Tree1 {
	Node root;
	/*public Tree1(int key) {
		root=new Node(key);
	}
	public Tree1() {
		root=null;
	}*/

	public static void main(String[] args) {
		System.out.println("start main");
		Tree1 tr=new Tree1();
		tr.root=new Node(1);
		tr.root.left=new Node(2);
		tr.root.right=new Node(3);
		tr.root.left.left=new Node(4);
		tr.root.left.right=new Node(5);
		System.out.println("tree created");
		printPostOrder(tr.root);
		System.out.println("level order traversal");
		levelOrderTraversal(tr.root);



	}
	/*
	 * Algorithm Postorder(tree)
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.
	 */
	public static void printPostOrder(Node root){

		if(root==null)
			return;

		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println("node"+root.key);
		
	}
	/*
	 * Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
	 */
	public static void printPreOrder(Node root){

		if(root==null)
			return;

		System.out.println("node"+root.key);
		printPostOrder(root.left);
		printPostOrder(root.right);

	}
	/*
	 * Algorithm Inorder(tree)
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
	 */

	public static void printInOrder(Node root){

		if(root==null)
			return;
		printPostOrder(root.left);
		System.out.print(root.key+" ");
		printPostOrder(root.right);
		
	}

	
	public static int height(Node root){
		
		if(root==null)
			return 0;
		else{
			int lHeigh=height(root.left);
			int rHeigh=height(root.right);
			if(lHeigh>rHeigh)
				return lHeigh+1;
			else 
				return rHeigh+1;
		}
		
		
	}
	
	public static void levelOrderTraversal(Node root){
		int h=height(root);
		for (int i = 1; i <=h; i++) {
			printGivenLevel(root, i);
		}
	}
	public static void printGivenLevel(Node root,int level){
		if(root==null)
			return;
		if(level==1){
			System.out.print(root.key+" ");
		}else if(level>1){
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
}

class Node {

	Node left,right;
	int key;
	public Node(int data) {
		key=data;
		left=right=null;
	}
}