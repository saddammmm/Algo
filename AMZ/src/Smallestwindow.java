import java.util.Scanner;


public class Smallestwindow {

	public static void main(String[] args) {
		
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		
		if(str1.length()>str2.length()){
			System.out.println("no window found");
		}
		
		int hash_pat[] = new int[256];
	    int hash_str[] = new int[256];
		
		for (int i = 0; i < str2.length(); i++) {
			hash_pat[(int)str2.charAt(i)]++;
		}
		for (int i = 0; i < hash_pat.length; i++) {
			if(hash_pat[i]!=0)
			System.out.print(hash_pat[i]+"-");
		}
		int c=0;
		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
		for (int i = 0; i < str2.length(); i++) {
			hash_str[(int)str2.charAt(i)]++;


			if (hash_pat[(int)str2.charAt(i)] != 0 &&
					hash_str[(int)str2.charAt(i)] <= hash_pat[(int)str2.charAt(i)] )
				c++;
			if(c==str1.length()){
				while ( hash_str[(int)str2.charAt(i)] > hash_pat[(int)str2.charAt(i)] || hash_pat[(int)str2.charAt(i)] == 0)
				{

					if (hash_str[(int)str2.charAt(i)] > hash_pat[(int)str2.charAt(start)])
						hash_str[(int)str2.charAt(i)]--;
					start++;
				}

				// update window size
				int len_window = i - start + 1;
				if (min_len > len_window)
				{
					min_len = len_window;
					start_index = start;
				}
			}


		}
		System.out.println( str2.substring(start_index, min_len));
		
	}

}
