import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Anagram {

	public static HashSet<String>a=new HashSet<String>();
	public static ArrayList<String>ab=new ArrayList<String>();
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		//in.nextLine();
		while(t>=0){
			//HashSet<String>hasa=new HashSet<String>();
			in.nextLine();
			String aa = in.next();
			int n=in.nextInt();
			annagram("", aa);
			
			sort(a);
          
	      Collections.sort(ab);
	     System.out.println(ab.get(n-1));
	     ab.clear();
	     a.clear();
	      t--;
		}
		

	}

	
	private static void annagram(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) a.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	        	annagram(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static void  sort(HashSet<String>aa){
		Iterator iter = aa.iterator();
		while (iter.hasNext()) {
		    ab.add((String) iter.next());
		}
	}
}

