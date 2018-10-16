package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String twoStrings(String s1, String s2) {


		
		for(char a:"abcdefghijklmnopqrstuvwxyz".toCharArray()){
			if(s2.contains(""+a))
				return "YES";
		}

		return "NO";
	}
}
