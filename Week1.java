import java.util.ArrayList;
public class Week1 
{ 
	public static void main(String[] args)
	{
		ArrayList<String> Week1=new ArrayList<String>();
		// before removing
		Week1.add("Sunday");
		Week1.add("Monday");
		Week1.add("Tuesday");
		Week1.add("Wednesday");
		Week1.add("Thursday");
		Week1.add("Friday");
		Week1.add("Saturday");
		System.out.println("OLD List="+Week1);
		//removing by name
		Week1.remove("Monday");
		System.out.println("NEW List1="+Week1);
		//removing by index
		Week1.remove(4);
		System.out.println("NEW List2="+Week1);
	}
}
