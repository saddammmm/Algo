package array;

import java.util.Arrays;
import java.util.Comparator;


class Activity{
	int start;
	int finish;
	public Activity(int s,int f) {
		this.start=s;
		this.finish=f;
	}
}


public class GreedyActivity {

	public static void main(String[] args) {

		//Activity arr=new Activity();
		
		Activity[]array=new Activity[10];
		for (int i = 0; i < 10; i++) {
			Activity a=new Activity(i, i);
			array[i]=a;
		}
		
		Arrays.sort(array, new Comparator<Activity>() {

			@Override
			public int compare(Activity o1, Activity o2) {
				
				Integer f1=o1.finish;
				Integer f2=o2.finish;
				return f1.compareTo(f2)>0?1:-1;
			}
		});;
		
	}

}
