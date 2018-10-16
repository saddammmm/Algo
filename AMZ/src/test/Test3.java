package test;

public class Test3 {

	public static void main(String[] args) {/*

		int i=10;

		try {

			i=15;
			//throw new Exception();

		} catch (Exception e) {
			System.out.println(i);
		}finally{
			i=100;
		}
		System.out.println(i);
	 */


		/*String s=new String("saddam");
		s=null;
		Integer i=new Integer(1);
		i=null;*/
		Test3 t=new Test3();
		Test3 t2=new Test3();
		t2=null;
		//t.finalize();
		t=null;
		
		System.gc();
		System.out.println("system .out ");
	}
	
	public void finalize(){
		System.out.println("Main completed ");
		
		int i=10/0;
		
	}
}
