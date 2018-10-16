package tree;

public class PrintDiameter {

	public static void main(String[] args) {

		
	  
	   // diameter(root); 

	}
	public static int height(Node root, int ans,Node start,int lmh,int rmh,int f){

		if(root==null)
			return 0;

		int lh=height(root.left,ans,start,lmh,rmh,f);
		int rh=height(root.right,ans,start,lmh,rmh,f);
		if(ans<(lh+rh+1)){
			ans=Math.max(ans, lh+rh+1);
			lmh=lh;
			rmh=rh;
		}
		return Math.max(lh,rh)+1;
	}
	
	
	public void diameter(Node root){
	
		if (root == null) 
	        return; 
	  
	    // lh will store height of left subtree 
	    // rh will store height of right subtree 
	    int ans = Integer.MIN_VALUE, lh = 0, rh = 0; 
	  
	    // f is a flag whose value helps in printing 
	    // left & right part of the diameter only once 
	    int f = 0; 
	    Node k=null; 
	    int height_of_tree = height(root, ans, k, lh, rh, f); 
	    int lPath[]=new int[100];int  pathlen = 0; 
	  
	    // print the left part of the diameter 
	    printPath(k.left, lPath, pathlen, lh, f); 
	   System.out.println(k.data);
	    int rPath[]=new int[100]; 
	    f = 1; 
	  
	    // print the right part of the diameter 
	    printPath(k.right, rPath, pathlen, rh, f); 
		
		
	}
	
	
	
	public static void printPath(Node node, int[]path,int pathLength,int max, int f){
		
		if(node==null)
			return;
		
		path[pathLength]=node.data;
		
		pathLength++;
		if(node.left==null&&node.right==null){
			
			if (pathLength == max && (f == 0 || f == 1)) { 
	            printArray(path, pathLength, f); 
	            f = 2; 
	        } 
			
		}
		
	}
	private static void printArray(int[] ints, int len, int f) {

		 int i; 
		  
		    // print left part of the path in reverse order 
		    if (f == 0) { 
		        for (i = len - 1; i >= 0; i--) { 
		        	System.out.println(ints[i]);
		        } 
		    } 
		  
		    // print right part of the path 
		    else if (f == 1) { 
		        for (i = 0; i < len; i++) { 
		            System.out.println(ints[i]);
		        } 
		    } 
	}
	
	
}
