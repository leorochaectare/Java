package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DiaSemana {
	
	public static String getWeek(int month, int day, int year){ 
	    String dayWeek = "";
	    GregorianCalendar gc = new GregorianCalendar();
	    
	    try {
	    	String string_month = Integer.toString(month);
	    	String string_day = Integer.toString(day);
	    	String string_year = Integer.toString(year);
	    	
	    	String data = string_month + "/" + string_day + "/" + string_year;
	    	
	        gc.setTime(new SimpleDateFormat("MM/dd/yyyy").parse(data));
	        switch (gc.get(Calendar.DAY_OF_WEEK)) {
	            case Calendar.SUNDAY:
	                dayWeek = "SUNDAY";
	                break;
	            case Calendar.MONDAY:
	                dayWeek = "MONDAY";
	                break;
	            case Calendar.TUESDAY:
	                dayWeek = "TUESDAY";
	            break;
	            case Calendar.WEDNESDAY:
	                dayWeek = "WEDNESDAY";
	                break;
	            case Calendar.THURSDAY:
	                dayWeek = "THURSDAY";
	                break;
	            case Calendar.FRIDAY:
	                dayWeek = "FRIDAY";
	                break;
	            case Calendar.SATURDAY:
	                dayWeek = "SATURDAY";

	        }
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return dayWeek;
	}
	
	public static void main(String[] args) {
		System.out.println(getWeek(8,05,2015));
	}
}
