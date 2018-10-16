
public class mul7 {

	public static void main(String[] args) {

		
		int a=5;
		//System.out.println(mult(5, 0));
		System.out.println(multiplyTen(5));
	}
	
	public static  int mult(int x,int y){
		
		if(y==0)
			return 0;
		if(y>0)
			return x+ mult(x,y-1);
		
			return -mult(x, -y);
		
	}
	
	public static int multiplyTen(int n)
	{
		
	    return (n<<1) + (n<<3);
	}

}
