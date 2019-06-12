import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Alltriplet {

	public static void main(String[]argd) throws IOException, ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yy");
		String d1="25 DEC 2018";
		
		Date d=new Date("03/12/2018");
		
		Date d3=sdf.parse(d1);
		System.out.println(d3.before(d));
		
		
		
	}
	}

