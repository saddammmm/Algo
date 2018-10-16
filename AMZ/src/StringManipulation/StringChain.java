package StringManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;



public class StringChain {

	public static void main(String[] args) {
		  String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
	       
	        System.out.println("longestChain " );
	        longestChain(words);
	}
	
	
	public static void longestChain(String []wordlist){
		
		List<String>wordlist1=Arrays.asList(wordlist);
		
		int max=0;
		for (String string : wordlist1) {
			
			int current=maxChain(string,wordlist1);
			if(max<current)
				max=current;
			
		}
		System.out.println(">>>"+max);
	}


	private static int maxChain(String word, List<String> wordlist1) {
		
		if(word.length()==1)
			return 1;
		int s=0;
		int e=1;
		
		Stack<String>chain=new Stack<String>();
		
		chain.add(word);
		
		while(!chain.isEmpty()){
			
			 String currentWord = chain.peek();
			
			if(e>currentWord.length())
				break;
			
			if(wordlist1.contains(currentWord)){
				
				StringBuilder modi=new StringBuilder(currentWord);
				modi.delete(s, e);
				chain.add(modi.toString());
			}else{
				chain.pop();
				s++;
				e++;
			}
			
			
		}
		
		
		return chain.size();
	}
	

}
