
package tree;




class TreeTest {
	 
    int data;
    TreeTest left, right;
 
    TreeTest(int item) {
        data = item;
        left = right = null;
    }
}
 

class Res {
    int val;
}

public class Max_path_sum_leafs {
	
/*int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }*/
	

	static TreeTest root;
	 
	public static void main(String[] args) {

		
		Max_path_sum_leafs tree = new Max_path_sum_leafs();
	        tree.root = new TreeTest(2);
	        tree.root.left = new TreeTest(-1);
	       /* tree.root.right = new TreeTest(6);
	        tree.root.left.left = new TreeTest(-8);
	        tree.root.left.right = new TreeTest(1);
	        tree.root.left.left.left = new TreeTest(2);
	        tree.root.left.left.right = new TreeTest(6);
	        tree.root.right.left = new TreeTest(3);
	        tree.root.right.right = new TreeTest(9);
	        tree.root.right.right.right = new TreeTest(0);
	        tree.root.right.right.right.left = new TreeTest(4);
	        tree.root.right.right.right.right = new TreeTest(-1);
	        tree.root.right.right.right.right.left = new TreeTest(10);*/
	        System.out.println("Max pathSum of the given binary tree is "
	                + tree.maxPath(root));
		
	}
	
	public int maxPath(TreeTest root){

		Res res=new Res();
		maxsumPath(root, res);
		//System.out.println(res.val);

		return res.val;
	}
	

	public int maxsumPath(TreeTest TreeTest,Res res){

		if(TreeTest==null)
			return 0;
		else if(TreeTest.left==null&&TreeTest.right==null){
			//res.val=TreeTest.data;
			return TreeTest.data;

		}
		int ls =maxsumPath(TreeTest.left,res);
		int rs=maxsumPath(TreeTest.right,res);
		System.out.println(ls+">> "+rs);
		if(TreeTest.left!=null&&TreeTest.right!=null){


			res.val=Math.max(res.val, rs+ls+TreeTest.data);

			System.out.println(res.val);
			return Math.max(rs,ls)+TreeTest.data;

		} else{
			System.out.println(res.val+">>>");
			if(TreeTest.left==null){
				res.val=Math.max(rs,TreeTest.data);
			}else{
				res.val=Math.max(ls,TreeTest.data);
			}
		}
		System.out.println(TreeTest.data);



		return (TreeTest.left==null)? rs+TreeTest.data:ls+TreeTest.data;

	}
	
	
}
