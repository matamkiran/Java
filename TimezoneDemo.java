import java.util.TimeZone;


public class TimezoneDemo {
	
	public static void main(String[] args){
		
		String[] ids=TimeZone.getAvailableIDs();
		System.out.println("Available timezones");
		for(String s:ids){
			System.out.println(s);
		}
		
		TimeZone zone=TimeZone.getDefault();
		System.err.println(zone.getDisplayName());
	}

}
