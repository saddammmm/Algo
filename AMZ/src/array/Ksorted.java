package array;

import java.util.PriorityQueue;

public class Ksorted {

	public static void main(String[] args) {


	}

		public static void  sortK(int[]arr,int k){
			int i,j;
	
			for (i=1;i<arr.length;i++) {
	
				int key=arr[i];
				j=i-1;
				while(j>0&&arr[j]>key){
					arr[j+1]=arr[j];
					j=j-1;
	
				}
				arr[j+1]=key;
			}
		}


	public void kSorted(int []arr,int k){

		PriorityQueue<Integer>q=new PriorityQueue<Integer>(k);
		
		for (int i = 0; i < k; i++) {
			q.add(arr[i]);
		}
      
		int index=0;
		
		for (int i = k+1; i < arr.length; i++) {
			
			arr[index++]=q.poll();
			q.add(arr[i]);
		}
		
		while (!q.isEmpty()) {
			arr[index++]=q.poll();	
		}

		
	}


}

