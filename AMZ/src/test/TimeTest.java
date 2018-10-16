package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ForkJoinPool;

public class TimeTest {

	
	public static void main(String []args) throws ParseException{
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
		String currentDateandTime = sdf.format(new Date());

		Date date = sdf.parse(currentDateandTime);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.HOUR, 3);
		
		Date end=calendar.getTime();
		System.out.println(end.getTime());
		
		//long d=1536425760000l;
		
		Date end2=new Date();
		long diffMs = 1536425760000l - end2.getTime();
		long diffSec = diffMs / 1000;
		long min = diffSec / 60;
		long sec = diffSec % 60;
		System.out.println("The difference is "+min+" minutes and "+sec+" seconds.");
		
		
		//System.out.println(end-date);

		System.out.println("Time here "+end);
		
		
		  /* // long time = 1427723278405L;
		    long time=System.nanoTime();
	        SimpleDateFormat sdf = new SimpleDateFormat();
	        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
	        System.out.println(sdf.format(new Date(time)));*/
		
		
	}
	
}
