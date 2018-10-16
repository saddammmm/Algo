
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public static void selectionSort(int[]arr){
		
		//n2

		int n=arr.length;

		for (int i = 0; i < n; i++) {

			int min_index=i;
			for (int j = i+1; j < n; j++) {
				if(arr[j]<=arr[min_index]){
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;

		}
	}
	public static void bubbleSort(int[]arr){

		int l=arr.length;

		for (int i = 0; i < l-1; i++) {

			for (int j = 0; j < l-i-1; j++) {

				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}


			}
		}

	}
	public static void InsertionSort(int[]arr){
		
		int l=arr.length;
		
		for (int i = 1; i < arr.length; i++) {


			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key){

				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
			
		}
		
}

}
