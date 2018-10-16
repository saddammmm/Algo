package array;

import java.util.ArrayList;
import java.util.Arrays;


public class SortArraybyReversingSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void sort(int[]array){
		int up=0,down=0;
		
		int j,k;
		
		for (int i = 1; i < array.length-1; i++) {
			
			j=i-1;
			k=i+1;
			if(array[i]>array[j]&&array[i]>array[k]){
				up++;
			}else if(array[i]<array[j]&&array[i]<array[k]){
				down++;
			}
		}
	
		if(up==down){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}

}
