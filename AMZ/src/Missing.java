import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Missing {
	
	public static void main(String[]args){
		
		
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }
		
		
	}
	
public static boolean isBalanced(String expression) {
        
        
        
        Stack<Character>exp=new Stack<Character>();
        for(int i=0;i<expression.length();i++){
            
            char ch=expression.charAt(i);
            
            if(ch=='(')
                exp.push(ch);
           else if(ch=='{')
                exp.push(ch);
            else if(ch=='[')
                exp.push(ch);
            else{
               if(exp.isEmpty()){
                   return false;
               }
               char po=exp.pop();
              // System.out.println(ch+" "+po);
              if(po=='('&&ch==')'){
                  continue;
              }else if(po=='{'&&ch=='}'){
                  continue;
              }else if(po=='['&&ch==']'){
                  continue;
              }else{
                  return false;
                  
              }
               
           }
            
            
        }
        return true;
       }

}
