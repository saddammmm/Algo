package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList<Integer>adjList[];

	public Graph(int V) {

		this.V=V;
		adjList=new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adjList[i]=new LinkedList<Integer>();
		}
	}



	public static void addEdge(Graph g, int source, int destination){

		g.adjList[source].add(destination);
		g.adjList[destination].add(source);

	}
	public static void printGraph(Graph g){

		for (int i = 0; i < g.V; i++) {

			LinkedList<Integer>list=g.adjList[i];
			System.out.print("head");
			for (Integer integer : list) {
				System.out.print("->"+integer);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		printGraph(graph);
	}



	/*Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data 
	structures. The algorithm starts at the root node 
	(selecting some arbitrary node as the root node in the case of a graph) and explores as 
	far as possible along each branch before backtracking.*/	


	public  void DFS(){

		boolean []visited=new boolean[V];

		for (int i = 0; i < visited.length; i++) {
			if(!visited[i])
				DFSUtil(i,visited);
		}


	}
	private void DFSUtil(int v, boolean[] visited) {

		visited[v]=true;
		System.out.println(">>"+v);

		Iterator<Integer> i = adjList[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n])
				DFSUtil(n, visited);
		}
	}

}
