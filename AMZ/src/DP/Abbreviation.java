package DP;

import java.util.concurrent.CountDownLatch;

public class Abbreviation {

	public static void main(String[] args) {
		System.out.println(Abb("AabacH", "ABC"));
		
	}

	public static boolean Abb(String a,String b){


		if(b.equals("")&a.toLowerCase().equals(a)||(a.equals("")&&b.equals("")))
			return true;
		if(b.equals("")&!a.toLowerCase().equals(a)||(a.equals("")&&!b.equals("")))
            return false;
        
		if((""+a.charAt(a.length()-1)).equalsIgnoreCase((""+b.charAt(b.length()-1)))){
			return Abb((a.substring(0,a.length()-1)), (b.substring(0,b.length()-1)))
					|| Abb((a.substring(0,a.length()-1)), (b.substring(0,b.length())));
		}
		
		if(!Character.isUpperCase(a.charAt(a.length()-1)))
		     return   Abb((a.substring(0,a.length()-1)), b);
		else return false;
		
	}

}
