import java.util.*;
import java.util.Comparator;
 
public class LargestSubArray  {
 
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		List<Pair> list = new ArrayList<Pair>();
		for (int k = 0; k <t; k++) {
			int n=sc.nextInt();
			for (int j = 1; j <= n; j++) {
				list.add(new Pair(sc.nextInt(),k));
				Collections.sort(list, new Pair());

				Integer currentMaxIndex = list.get(0).getSecond();
				Integer finalAnswer = -1;
				for(int i = 1; i < list.size(); i++){
					Pair p = list.get(i);
					if(currentMaxIndex > p.getSecond()){
						p.setLongestFromCurrent(currentMaxIndex - p.getSecond() + 1);
					}
					else{
						currentMaxIndex = p.getSecond();
					}
					finalAnswer = finalAnswer < p.getLongestFromCurrent() ? 
							p.getLongestFromCurrent(): finalAnswer;
				}

				System.out.println(finalAnswer);
			}
		}
		
 
		
	}
	
}
 
class Pair implements Comparator<Pair>{
 
	private Integer first;
	private Integer second;
	private Integer longestFromCurrent;
 
	Pair(){
		this.first = 0;
		this.second = 0;
		this.longestFromCurrent = 1;
	}
 
	Pair(Integer first, Integer second){
		this.first = first;
		this.second = second;
		this.longestFromCurrent = 1;
	}
 
	public int compare(Pair a, Pair b){
		if(a.first == b.first){
			return b.second - a.second;
		}
		return a.first - b.first;
	}
 
	public String toString(){
		return "First: "+this.first+", Second: "+this.second + ", 	Length of Longest Subarray From Current: " + this.longestFromCurrent;
	}
 
	public Integer getLongestFromCurrent(){
		return longestFromCurrent;
	}
 
	public void setLongestFromCurrent(Integer longestFromCurrent){
		this.longestFromCurrent = longestFromCurrent;
	}
 
	public Integer getFirst(){
		return first;
	}
 
	public Integer getSecond(){
		return second;
	}
 
}