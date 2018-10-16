package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIdenticalBSTs {


	public static void main(String []args){
		int[] arrayForTree1 = {3,5,4,6,1,0,2};
		int[] arrayForTree2 = {3,1,5,2,4,6,0};
		
		//System.out.println("Check if identical BSTs: " + checkIfSameBSTs(Arrays.asList(arrayForTree1), Arrays.asList(arrayForTree2)));

	}

	public static boolean checkIfSameBSTs(List<Integer> listForTree1, List<Integer> listForTree2){

		if(listForTree1.size()!=listForTree2.size())
			return false;

		if(listForTree1.size()==0&&listForTree2.size()==0)
			return true;


		if(listForTree1.get(0) == listForTree2.get(0)){

			ArrayList<Integer> listForLeftTree1 = new ArrayList<Integer>();
			ArrayList<Integer> listForRightTree1 = new ArrayList<Integer>();
			ArrayList<Integer> listForLeftTree2 = new ArrayList<Integer>();
			ArrayList<Integer> listForRightTree2 = new ArrayList<Integer>();

			for (int i = 0; i <listForTree1.size(); i++) {

				if(listForTree1.get(0)>listForTree1.get(i)){
					listForLeftTree1.add(listForTree1.get(i));
				}else{
					listForRightTree1.add(listForTree1.get(i));
				}

				if(listForTree2.get(0)>listForTree2.get(i)){
					listForLeftTree2.add(listForTree2.get(i));
				}else{
					listForRightTree2.add(listForTree2.get(i));
				}

			}
			return checkIfSameBSTs(listForLeftTree1, listForLeftTree2)&&checkIfSameBSTs(listForRightTree1, listForRightTree2);
		}

		return false;
	}

}
