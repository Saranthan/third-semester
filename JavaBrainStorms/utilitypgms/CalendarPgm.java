import java.util.Calendar;
import java.text.SimpleDateFormat; //note the package is not util here it's text



public class CalendarPgm{

	public static void main(String... args){

		Calendar cal = Calendar.getInstance(); //Calendar class is abstract 
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("The year is : " + year); // This prints the current Year
		
		int date = cal.get(Calendar.DATE);
		System.out.println("The date is : "+date);
		
		int month = cal.get(Calendar.MONTH) + 1; // The month parameter here is Zero based so add one to it.
		System.out.println("The Month is : "+month);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);	

		System.out.println("The format is : " + hour +" " + minute +" "+ seconds);

		SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE");
		String dayName = dateFormatter.format(cal.getTime());
		System.out.println("The dayName of is : " + dayName);
		
			
				
	}
}
