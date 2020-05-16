import java.util.Calendar;


public class CalendarDemo {
	
	public static void main(String args[]){
		
		
		Calendar calendar= Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		System.err.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.err.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.err.println(calendar.get(Calendar.WEEK_OF_YEAR));

		calendar.add(Calendar.DATE,-20);
		System.out.println("date 20 days ago" +calendar.getTime());
		calendar.add(Calendar.MONTH,4);
		System.out.println("date 4 months later " +calendar.getTime());
		calendar.add(Calendar.YEAR,2);
		System.out.println("date 2 years later " +calendar.getTime());
		System.err.println(calendar.get(Calendar.DAY_OF_WEEK));


	}

}
