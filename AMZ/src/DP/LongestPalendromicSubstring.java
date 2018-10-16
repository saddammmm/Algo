package DP;

public class LongestPalendromicSubstring {

	public static void main(String[] args) {

		
		
		String str="forgeeksskeegfor";
		
		int res=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
			
				String str1=str.substring(i,j);
				if(isPal(str1)&&res<str1.length()){
					res=str1.length();
				}
				
			}
		}
		
		System.out.println(res);
	}
	
	public static boolean isPal(String str){


		int l=0;
		int h=str.length()-1;

		while(l<h){
			if(str.charAt(l++)!=str.charAt(h--))
				return false;
		}


		return true;

	}
	
	

}
