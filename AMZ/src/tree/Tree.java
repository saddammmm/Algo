package tree;

import java.util.Stack;

public class Tree {
	
	public static float getAngle(int  x,int y) {
		float angle = (float) Math.toDegrees(Math.atan2(y - 50, x - 50));
		return angle;
	}


	public static void main(String[] args) {
		
		
		String acountNumber="Sad  dam hussaun 123456";
		
		System.out.println(validParent("{}{}"));
	}
	
	public static boolean validParent(String str){


		Stack<Character>a=new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='['){
				a.push(str.charAt(i));
			}else if(str.charAt(i)=='}'||str.charAt(i)==')'||str.charAt(i)==']'){
				if(a.empty()){
					return false;
				}else{
					if(!isMatchingPair(a.pop(), str.charAt(i))){
						return false;
					}
				}

			}


		}
		if(a.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
	

}
