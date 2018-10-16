package StringManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


class countIndex {
	
	int index,count;
	public countIndex(int index) {
		this.index=index;
		count=1;
		
	}
	public void incrCount(){
		count++;
	}
	
}
public class FirstNonReapatingChar {
	
	
	


	static HashMap<Character, countIndex>map=new HashMap<Character, countIndex>(256);

	public static void main(String[] args) {


		String s="geeksforgeeksandgeeksquizfor";
         //countFirstNonRep(s);
		countFirstNonRepStream(s);
		

	}

	
	public static void countFirstNonRepStream(String Stream){
		
		boolean[]repate=new boolean[256];
		
		List<Character>dll=new ArrayList<Character>();
		
		for (int i = 0; i < Stream.length(); i++) {

			char c=Stream.charAt(i);
			System.out.println("processins s char"+c);

			if(!repate[c]){

				if(!dll.contains(c)){
					dll.add(c);
					
				}else {
					dll.remove((Character)c);
					repate[c]=true;
				}
			}
			if(dll.size()!=0){
				System.out.println(dll.get(0));
			}
		}
		
		
		
	}

	public static void countFirstNonRep(String s){
		for (int i = 0; i < s.length(); i++) {

			if(map.containsKey(s.charAt(i))){
				map.get(s.charAt(i)).incrCount();
			}else {
				map.put(s.charAt(i), new countIndex(i));
			}
		}

		int res=Integer.MAX_VALUE;

		Set<Character> key=map.keySet();
		Iterator< Character>it=key.iterator();

		while (it.hasNext()) {
			char c=it.next();
			if(map.get(c).count==1&&res>map.get(c).index){
				res=map.get(c).index;
			}

		}

		System.out.println(s.charAt(res));
	}
}
