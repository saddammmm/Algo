import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class phone {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		HashMap<String, String>ph=new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String a=sc.nextLine();
			String key=a.substring(0,a.indexOf(" "));
			String value=a.substring(a.indexOf(" "));
			ph.put(key, value);
		}
		while(n>0){
			String name=sc.nextLine();
			String phno=null;
			phno=ph.get(name);
			/*for (String key : ph.keySet()) {
				if(key.equals(name)){
					phno=ph.get(key);
					break;
				}
			}
*/			if(phno==null){
				System.out.println("Not found");
			}else{
				System.out.println(name+"="+phno);
			}
			n--;}
	}

}
