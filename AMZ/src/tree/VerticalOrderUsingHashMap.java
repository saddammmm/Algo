package tree;


import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map.Entry;

public class VerticalOrderUsingHashMap {

	TNode root;
	public static ArrayList<Integer>data=new ArrayList<Integer>();
	public static void main(String[] args) {

		VerticalOrderUsingHashMap tree=new VerticalOrderUsingHashMap();



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
		//printEachpath(tree.root);

		HashMap<Integer, ArrayList<Integer>>map=new HashMap<Integer, ArrayList<Integer>>();
		int hd=0;
		verticalOrder(tree.root, hd, map);

		for (java.util.Map.Entry<Integer, ArrayList<Integer>> ee : map.entrySet()) {
		    ArrayList<Integer> values = ee.getValue();
		    System.out.println(values.get(0)+" ");
		    // TODO: Do something.
		}

		



	}

	public static void verticalOrder(TNode node,int hd,HashMap<Integer, ArrayList<Integer>>map){
		if(node==null)
			return;
		if(map.get(hd)==null){
			ArrayList<Integer>a=new ArrayList<Integer>();
			a.add(node.key);
			map.put(hd, a);
		}else{
			map.get(hd).add(node.key);
		}

		verticalOrder(node.left, hd-1, map);
		verticalOrder(node.right, hd+1, map);
	}

	public static void printEachpath(TNode node){
		int[]a=new int[1000];
		printRecur(node, a, 0);
	}
	public static void printRecur(TNode node ,int[]path,int len){

		if(node==null){
			return;
		}
		path[len]=node.key;
		len++;
		if(node.left==null&&node.right==null){
			for (int i = 0; i < len; i++) {
				System.out.print(path[i]+" ");
			}
			System.out.println("");
		}else{
			printRecur(node.left, path, len);
			printRecur(node.right, path, len);
		}

	}



}

 /*class TNode{
	 TNode left,right;
	int key;
	public TNode(int data) {
		key=data;
		left=right=null;
		
	}
	 
}*/