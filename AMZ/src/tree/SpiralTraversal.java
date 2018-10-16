package tree;

import java.util.LinkedList;
import java.util.List;



class a {
	int a;
}

public class SpiralTraversal {
	Trnode root;

	public static void main(String[] args) {
		
		SpiralTraversal tree=new SpiralTraversal();
		
		
		tree.root = new Trnode(1);
        tree.root.left = new Trnode(2);
        tree.root.right = new Trnode(3);
        tree.root.left.left = new Trnode(4);
        tree.root.left.right = new Trnode(5);
        tree.root.left.right.left = new Trnode(6);
        tree.root.left.right.right = new Trnode(7);
        tree.root.left.left.right = new Trnode(8);
        tree.root.left.left.right.left = new Trnode(9);
        System.out.println("Spiral order traversal of Binary Tree is ");
       
        a ans=new a();
       // int ans=Integer.MIN_VALUE;
        System.out.println(printDiameter(tree.root, ans));
        System.out.println(">>>"+ans.a);
        //spiral(tree.root);
        
        
        
       
	}
	
	
	public void pathSum(Trnode root, int sum, List<Integer> currentResult,
			List<List<Integer>> result) {

		if (root == null)
			return;
		currentResult.add(new Integer(root.key));
		if (root.left == null && root.right == null && sum == root.key) {
			result.add(new LinkedList(currentResult));
			currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
			return;
		} else {
			pathSum(root.left, sum - root.key, currentResult, result);
			pathSum(root.right, sum - root.key, currentResult, result);
		}
		currentResult.remove(currentResult.size() - 1);
			
	}
	
	public static int printDiameter(Trnode node,a ans){

		if(node==null)
			return 0;

		
		int lh=printDiameter(node.left, ans);
		int rh=printDiameter(node.right, ans);

		if(ans.a<(lh+rh+1)){
			ans.a=lh+rh+1;
			System.out.println(node.key);
		}
		return 1+Math.max(lh, rh);

	}
	
	
	public static void spiral(Trnode node){
		
		int h=height(node);
		boolean ltr=false;
		for (int i = 0; i < h; i++) {
			printGivenLevel(node, i, ltr);
			ltr=!ltr;
		}
	}
	public static void printGivenLevel(Trnode node,int level,boolean ltr){
		
		if(node==null)
			return;
		if(level==1)
			System.out.println(node.key+" ");
		else if(level>1){
			if(ltr!=false){
				printGivenLevel(node.left, level-1, ltr);
				printGivenLevel(node.right, level-1, ltr);
			}else{
				printGivenLevel(node.right, level-1, ltr);
				printGivenLevel(node.left, level-1, ltr);
			}
		}
	}
	
	public static int height(Trnode root){
		
		if(root==null)
			return 0;
		
		else{
			int lheight=height(root.left);
			int rheight=height(root.right);
			
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;
		}
		
		
	}

}
class Trnode{

	Trnode left,right;
	int key;
	public Trnode(int data) {
		key=data;
		left=right=null;

	}

}
