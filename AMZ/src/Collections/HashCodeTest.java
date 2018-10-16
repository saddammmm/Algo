package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashCodeTest {

	public static void main(String[] args) {

		
		int a=50;
		System.out.println(a>>1);
		
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(null);
		System.out.println(hs);
		
		/*Integer i=new Integer(123);
		Integer i2=new Integer(123);
		
		System.out.println(i.hashCode()+" "+i2.hashCode());
		
		HashMap<String, String>a=new HashMap<String, String>();
		*/
		
	}

}
