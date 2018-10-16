package Intresting;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

	public static void main(String[] args) {


		/*{"mobile","samsung","sam","sung",
            "man","mango","icecream","and",
             "go","i","like","ice","cream"};
		*/
		Set<String>dict=new HashSet<String>();
		dict.add("mobile");
		dict.add("samsung");
		dict.add("sam");
		dict.add("sung");
		dict.add("man");
		dict.add("mango");
		dict.add("icecream");
		dict.add("go");
		dict.add("i");
		dict.add("like");
		dict.add("ice");
		dict.add("cream");
		System.err.println(wordBreak("ilikesamsung", dict));
		
		
		

	}

	public static  boolean wordBreak(String s, Set<String> dict) {
		return wordBreakHelper(s, dict, 0);
	}

	public static boolean wordBreakHelper(String s, Set<String> dict, int start){
		if(start == s.length()) 
			return true;

		for(String a: dict){
			int len = a.length();
			int end = start+len;

			//end index should be <= string length
			if(end > s.length()) 
				continue;

			if(s.substring(start, start+len).equals(a))
				if(wordBreakHelper(s, dict, start+len))
					return true;
		}

		return false;
	}




}
