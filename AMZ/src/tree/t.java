package tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



public class t {
	public int a;
	public static void main(String[] args) {
Queue<Integer>a=new LinkedList<Integer>();

a.poll();
		String accountId="4836-2470";
		
		//System.out.println(accountId.replaceAll("-", ""));
		if(accountId.matches("[0-9]*-[0-9]*")){
			System.out.println(accountId.replaceAll("-", ""));
		}else{
			System.out.println(">>>>>>>>>>");
		}
	}
	
	public static void getDatat(int a){
		
	}
}
