
public class DiaOfATree {
	treeNode root;

	public static void main(String[] args) {

		DiaOfATree tree=new DiaOfATree();
		tree.root = new treeNode(1);
        tree.root.left = new treeNode(2);
        tree.root.right = new treeNode(3);
        tree.root.left.left = new treeNode(4);
        tree.root.left.right = new treeNode(5);
		
		
		inOrder(tree.root);
		System.out.println(height(tree.root));
		System.out.println("Dia "+Dia(tree.root));
		
	
	}
	public static void inOrder(treeNode root){
		
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	
	public static int height(treeNode root){
		
		if(root==null)
			return 0;
		
		return (1+Math.max(height(root.left), height(root.right)));
	}
	public static int Dia(treeNode root){
		
		if(root==null)
			return 0;
		
		int lheight=height(root.left);
		int rheight=height(root.right);
		
		int ldia=Dia(root.left);
		int rDia=Dia(root.right);
		
		return (Math.max(lheight+rheight+1, Math.max(ldia, rDia)));
		
	}

}

class treeNode{

	treeNode left,right;
	int key;

	public treeNode(int data) {

		left=right=null;
		key=data;
	}


}