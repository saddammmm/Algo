package tree;

import java.util.Stack;

public class printTreeWithoutRecursion {

	Node root;
	
	static class Node{
		Node left,right;
		int data;
		 Node(int data) {
          this.data=data;
          left=right=null;
		}
	}
	
	public static void main(String[] args) {

		
		printTreeWithoutRecursion tree = new printTreeWithoutRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        inorder(tree.root);
        
		
        
        
        
        printTreeWithoutRecursion tree1 = new printTreeWithoutRecursion();
        tree1.root = new Node(10);
        tree1.root.left = new Node(8);
        tree1.root.right = new Node(2);
        tree1.root.left.left = new Node(3);
        tree1.root.left.right = new Node(5);
        tree1.root.right.left = new Node(2);
        preOrder(tree1.root);
        
        postOrder(tree1.root);
        
	}
	
	public static void preOrder(Node root){
		System.out.println("preOrder");
		
		if(root==null)
			return;
		
		Node node=root;
		Stack<Node>s=new Stack<Node>();
	
		s.add(node);
		
		while(!s.isEmpty()){
			
			node=s.pop();
			System.out.print(node.data +" ");
			if(node.right!=null)
			s.push(node.right);
			
			if(node.left!=null)
				s.push(node.left);
				
		}
		
		
	}

	
	public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }
	
	public static void postOrder(Node root){
		
		
		System.out.println("Post order ");
		
		if(root==null)
			return;
		
		Stack<Node>s1=new Stack<printTreeWithoutRecursion.Node>();
		Stack<Node>s2=new Stack<printTreeWithoutRecursion.Node>();
		
		Node node=root;
		s1.push(node);
		
		while(!s1.isEmpty()){
			
			node=s1.pop();
			s2.push(node);
			if(node.right!=null)
				s1.push(node.right);
			if(node.left!=null)
				s1.push(node.left);
			
		}
		
		while(!s2.isEmpty())
			System.out.print(s2.pop().data+ " ");
		
	}
	
	
}
