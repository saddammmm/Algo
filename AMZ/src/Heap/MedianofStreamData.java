package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianofStreamData {

	
	public static void getMedian(int[]arr){

		//max heap
		PriorityQueue<Integer>lower= new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return -1*a.compareTo(b);
			}
		});		
		PriorityQueue<Integer>higher=new PriorityQueue<Integer>();
		
		double []median=new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			int num=arr[i];
			addNumber(num,lower,higher);
			rebalance(lower,higher);
			median[i]=getMedian(lower,higher);
			
		}
		
	}
	
	private static double getMedian(PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void rebalance(PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher) {
		// TODO Auto-generated method stub
		
	}

	private static void addNumber(int num, PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher) {

		if(lower.size()==0||num<lower.peek()){
			lower.add(num);
		}else{
			higher.add(num);
		}
		
	}

	public static void main(String[] args) {

		
		
	}

}
