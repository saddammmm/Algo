package tree;


public class VerticalOrderTr {
	TNode root;


	public static void main(String[] args) {
		VerticalOrderTr tree=new VerticalOrderTr();
		Value val=new Value();
		tree.root=new TNode(1);
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.left.right = new TNode(5);
		tree.root.right.left = new TNode(6);
		tree.root.right.right = new TNode(7);
		tree.root.right.left.right = new TNode(8);
		tree.root.right.right.right = new TNode(9);




		findMaxMin(tree.root, val, val, 0);

		for (int i = val.min; i < val.max; i++) {
			verticalOrder(tree.root, i, 0);
			System.out.println("");
		}


	}

	public static void findMaxMin(TNode node,Value min,Value max,int hd){

		if(node==null)
			return;
		if(hd<min.min){
			min.min=hd;
		}
		if(hd>max.max){
			max.max=hd;
		}


		findMaxMin(node.left, min, max, hd-1);
		findMaxMin(node.right, min, max, hd+1);
	}

	public static void verticalOrder(TNode node,int lineNo,int hd){
		if(node==null)
			return;
		if(lineNo==hd)
			System.out.println(node.key+" ");

		verticalOrder(node.left, lineNo, hd-1);
		verticalOrder(node.right, lineNo, hd+1);

	}

}
 class TNode{
	TNode left,right;
	int key;
	public TNode(int data) {
		key=data;
		left=right=null;
	}
}
class Value{
	int max,min;
}