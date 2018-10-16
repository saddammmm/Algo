import java.text.DateFormatSymbols;


public class tttt {

	public static void main(String[] args) {

		int month=2;
	
		String monthString = new DateFormatSymbols().getMonths()[month-1];
		System.out.println(monthString);
	
	}

}
