import java.util.ArrayList;
public class Week
{
	public static void main(String[] args)
	{
		ArrayList<String> Week=new ArrayList<String>();
		Week.add("Sunday");
		Week.add("Monday");
		Week.add("Tuesday");
		Week.add("Wednesday");
		Week.add("Thursday");
		//Before adding 
		System.out.println("Before adding days(OLD)="+Week);
		// now adding 2 more days
		Week.add("Friday");
		Week.add("Saturday");
		System.out.println("After adding days(NEW)"+Week);
		
	}

}
