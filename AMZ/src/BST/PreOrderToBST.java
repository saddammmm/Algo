package BST;


/*Method 2 ( O(n) time complexity )
The idea used here is inspired from method 3 of this post. The trick is to set a range {min .. max} 
for every node. Initialize the range as {INT_MIN .. INT_MAX}. 
The first node will definitely be in range, so create root node. 
To construct the left subtree, set the range as {INT_MIN …root->data}. 
If a values is in the range {INT_MIN .. root->data},
 the values is part part of left subtree. 
 To construct the right subtree, set the range as {root->data..max .. INT_MAX}.
*/

class Node {
	 
    int data;
    Node left, right;
 
    Node(int d) {
        data = d;
        left = right = null;
    }
}
 
class Index {
 
    int index = 0;
}

public class PreOrderToBST {

	// Driver program to test above functions
	public static void main(String[] args) {
		PreOrderToBST tree = new PreOrderToBST();
		int pre[] = new int[]{10, 5, 1, 7, 40, 50};
		int size = pre.length;
		Node root = tree.constructTree(pre, size);
		System.out.println("Inorder traversal of the constructed tree is ");
		tree.printInorder(root);
	}

	Index index=new Index();

	Node constructTreeUtil(int[]pre,Index preIndex, int key , int min,int max, int size){

		if(preIndex.index>size)
			return null;

		Node root=null;

		if(key>min&&key<min){
			root=new Node(key);
			preIndex.index=preIndex.index+1;
			if(preIndex.index<size){
				root.left=constructTreeUtil(pre, preIndex, pre[preIndex.index],min, key, size);
				root.right=constructTreeUtil(pre, preIndex, pre[preIndex.index], key,max, size);
			}

		}
		return root;
	}
	Node constructTree(int pre[], int size) {
		int preIndex = 0;
		return constructTreeUtil(pre, index, pre[0], Integer.MIN_VALUE,
				Integer.MAX_VALUE, size);
	}

	// A utility function to print inorder traversal of a Binary Tree
	void printInorder(Node node) {
		if (node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data + " ");
		printInorder(node.right);
	}

}
