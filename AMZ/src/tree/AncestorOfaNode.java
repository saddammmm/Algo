package tree;

public class AncestorOfaNode {
	
	tree2 root;
	public static void main(String []args){
		
		AncestorOfaNode tree=new AncestorOfaNode();
		tree.root = new tree2(1);
        tree.root.left = new tree2(2);
        tree.root.right = new tree2(3);
        tree.root.left.left = new tree2(4);
        tree.root.left.right = new tree2(5);
        tree.root.left.left.left = new tree2(7);
        
  
        pritAncestar(tree.root, 7);
	}
	
	
	public static boolean pritAncestar(tree2 node,int target){

		if(node==null){
			return false;
		}
		if(node.key==target){
			System.out.println("inside tttttttt");
			return true;
		}
		if(pritAncestar(node.left, target)||pritAncestar(node.right, target)){
			System.out.print(node.key+" ");
			return true;
		}
		return false;
}
}
class tree2{
	
	tree2 left,right;
	int key;
	public tree2(int data) {
		
		key=data;
		left=right=null;
		
	}
	
	
}
