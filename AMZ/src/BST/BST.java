package BST;

import java.util.TreeMap;

public class BST {


	static class Node{

		Node left,right;
		int key;
		public Node(int key) {
			left=right=null;
			this.key=key;
		}

	}

	static Node root;
	BST(){
		root=null;
	}

	void insert(int key){
		root=insertRec(root,key);
	}
	//Insertion in BST
	Node insertRec(Node root,int key) {

		
		
		if(root==null){
			root=new Node(key);
			return root;
		}

		if(key<root.key){
			root.left=insertRec(root.left, key);
		}else if(key>root.key){
			root.right=insertRec(root.right, key);
		}

		return root;
	}
	//Inorder in BST
	void inorder(Node root){

		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);

	}

	public static void main(String[] args) {

		BST tree=new BST();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder(root);
		System.out.println(">>>"+tree.getleafeCount());

	}

	//count of leafe node in BST 
	int getleafeCount(){
		return getleafeCount(root);
	}

	int getleafeCount(Node root2) {

		if(root2==null)
			return 0;
		if(root2.left==null&&root2.right==null)
			return 1;


		return getleafeCount(root2.left)+getleafeCount(root2.right);
	}

	//Searching in BST
	Node search(Node root,int key){

		if(root==null||root.key==key)
			return root;

		if(key<root.key)
			return search(root.left,key);
		return search(root.right, key);

	}

	/* Deleting a key from BST 
	 * 1) Node to be deleted is leaf: Simply remove from the tree.
        2) Node to be deleted has only one child: Copy the child to the node and delete the child
        3) Node to be deleted has two children: Find inorder successor of the node. 
        Copy contents of the inorder successor to the node and delete the inorder successor. 
        Note that inorder predecessor can also be used.

	 * */
	void deleteKey(int key){
		deleteRec(root,key);
	}

	private Node deleteRec(Node root, int key) {

		if(root==null)
			return root;


		if(key<root.key){
			return deleteRec(root.left, key);
		}else if(key>root.key){
			return deleteRec(root.right, key);
		}
		// if key is same as root's key, then This is the node
        // to be deleted
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.key=InorderSuccessor(root.right);

			root.right=deleteRec(root.right, root.key);

		}
		return root;
	}

	private int InorderSuccessor(Node root2) {

		int min=root2.key;
		while(root2.left!=null){
			min=root.left.key;
			root=root.left;
		}
		return min;
	}



}
	


