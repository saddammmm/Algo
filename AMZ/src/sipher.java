import java.util.Scanner;


public class sipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int k=sc.nextInt();
        String res="";
        for (int i = 0; i < str.length(); i++) {
        	
        	int ass=str.charAt(i);
        	if(ass>=65&&ass<=90){
        		ass=ass+k;
            	
        		while(ass>90){
        			ass=ass%90;
        			ass=64+ass;
        			
        		}
        		res+=(char)ass;
        	}else if(ass>=97&&ass<=122){
        		ass=ass+k;
        		while(ass>122){
        			ass=ass%122;
        			ass=96+ass;
        			
        		}
        		res+=(char)ass;
        	}else{
        		res+=(char)ass;
        	}
        	
		}
        
        System.out.println(res);
        

	}

}
