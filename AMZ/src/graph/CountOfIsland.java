package graph;

public class CountOfIsland {

	public static void main(String[] args) {


		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 0, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}
		};
		CountOfIsland I = new CountOfIsland();
		System.out.println("Number of islands is: "+ I.countIslands(M));



	}
			
	private int n=5,m=5;

	private int countIslands(int[][] M) {
		boolean [][]visited=new boolean[n][m];
		int c=0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(M[i][j]==1&&!visited[i][j]){
					DFS(M,i,j,visited);
					c++;
				}
			}
		}
		return c;
	}

	private void DFS(int[][] m2, int row, int col, boolean[][] visited) {


		visited[row][col]=true;
		int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
		int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};

		for (int k = 0; k < 8; k++) {

			if(isSafe(m2, row+rowNbr[k], col+colNbr[k], visited)){
				DFS(m2, row+rowNbr[k], col+colNbr[k], visited);
			}
		}
	}

	boolean isSafe(int[][]M ,int row,int col,boolean[][]visited){
		return (row>=0)&&(col>=0)&&(row<n)&&(col<m)&&(M[row][col]==1)&&(!visited[row][col]);
	}

}
