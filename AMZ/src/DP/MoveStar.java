package DP;

import java.util.Scanner;

public class MoveStar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//int numberofMove=sc.nextInt();
		
		int initialPosition=0;
		
		String bo="##*##";
		
		
		
		for (int i = 0; ; i++) {
			
			int currentIndex=0;
			//System.out.println("intial position "+bo);
			String move=sc.nextLine();
			
			if(move.equals("R")){
				//initialPosition++;
				
				
				currentIndex=bo.indexOf("*");
				bo=bo.replace("*", "#");
				if(currentIndex==bo.length()-1){
					bo="*"+bo.substring(1);
				}else{
					bo=bo.substring(0,currentIndex+1)+"*"+bo.substring(currentIndex+2);
				}
				
			}else if(move.equals("L")){
				//initialPosition--;
				currentIndex=bo.indexOf("*");
				bo=bo.replace("*", "#");
				//if(currentIndex)
				if(currentIndex==0){
					bo=bo.substring(0,bo.length()-1)+"*";
				}else{
					bo=bo.substring(0,currentIndex-1)+"*"+bo.substring(currentIndex);	
				}
				
			}else if(move.equals("DONE")){
				break;
			}
			
			
			
			System.out.println(" Position after "+i+" move is :"+bo);
			
		}
		
		System.out.println("DONE>>>>>");
		
		
		
	}

}
