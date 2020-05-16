import java.sql.Date;


public class DateDemo {
	
	public static void main(String args[]){
		
		
		String str="2020-05-16";
		// conversion
	    Date date=Date.valueOf(str);
	    System.out.println(date);
	}

}
