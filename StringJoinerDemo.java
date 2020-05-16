import java.util.StringJoiner;


public class StringJoinerDemo {
	
	public static void main(String args[]){
		
		StringJoiner joinnames= new StringJoiner(",");
		
		joinnames.add("Sreekanth");
		joinnames.add("Kicha");
		joinnames.add("Yashukanthu");
		joinnames.add("punya");
		
		System.out.println(joinnames);

		
		StringJoiner joinnames1= new StringJoiner(",");
		
		joinnames1.add("shankar");
		joinnames1.add("Yash");
		joinnames1.add("Panda");
		joinnames1.add("Kumar");
		
		System.out.println(joinnames1);
		
		StringJoiner joinnew=joinnames.merge(joinnames1);
		System.out.println(joinnew);
	}

}
