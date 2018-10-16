package DP;

public class Test1 {

	public static int re=0;
	public static void main(String[] args) {

		
		
		logi();
		
	}

	public static void logi(){
		re++;
		try {
			System.out.println(re+"  vdviu");
			System.out.println("22222222");
			throw new Exception();
		} catch (Exception e) {
			if(re<3){
				logi();
			}
		}
	}
	
	
}
