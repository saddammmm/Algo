package tree;

import java.util.ArrayList;

public class LCS {
	
	private ArrayList<Integer> path1 = new ArrayList<>();
    private ArrayList<Integer> path2 = new ArrayList<>();
    node root;
	
	static class node{
		node left,right;
		int data;
		public node(int d) {
			left=right=null;
			data=d;
		}
	}
	
	public static void main(String[] args) {

		LCS tree = new LCS();
		tree.root = new node(1);
		tree.root.left = new node(2);
		tree.root.right = new node(3);
		tree.root.left.left = new node(4);
		tree.root.left.right = new node(5);
		tree.root.right.left = new node(6);
		tree.root.right.right = new node(7);

		System.out.println(tree.findDistBttowNode(1, 7));
		
		/*System.out.println(tree.findLCA(4,5));
		System.out.println(tree.findLCA(4,6));
		System.out.println(tree.findLCA(3,4));
		System.out.println(tree.findLCA(2,4));*/
	}
	
	 int findDistBttowNode(int a , int b){
		
		findPath(root, a, path1);
		findPath(root, b, path2);
		
		int j=0;
		for ( j = 0; j <path1.size()&&j<path2.size() ; j++) {
			
			if(!path1.get(j).equals(path2.get(j)))
				break;
		}
		
		int d= path1.size()+path2.size()-2*j;
		
		
		
		return d;
	}
	
	int findLCA(int n1, int n2) {
        path1.clear();
        path2.clear();
        return findLCAInternal(root, n1, n2);
    }
	public  int findLCAInternal(node root,int n1,int n2){

		if(!findPath(root, n1, path1)||!findPath(root, n2, path2)){
			return -1;
		}
		
		int j=0;
		for ( j = 0; j <path1.size()&&j<path2.size() ; j++) {
			
			if(!path1.get(j).equals(path2.get(j)))
				break;
		}
		
		return path1.get(j-1);
	}

	public static boolean findPath(node root,int n,ArrayList<Integer>path){

		if(root==null)
			return false;
		path.add(root.data);

		if(root.data==n)
			return true;

		if(root.left!=null&&findPath(root.left, n, path))
			return true;

		if(root.right!=null&&findPath(root.right, n, path))
			return true;

		path.remove(path.size()-1);
		return false;

	}
	
	
	
}
