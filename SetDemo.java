import java.util.*;
import java.util.Set;
public class SetDemo
{
	public static void main (String[] args)
	{
		//tree set is used for sorting in set there is no other method in set for sorting
		Set<String> set11=new TreeSet<String>();
		set11.add("Ujjawal");
		set11.add("Anuj");
		set11.add("Abhinav");
		set11.add("Arun");
		set11.add("Alok");
		set11.add("Ayush");
		set11.add("Ayush");

	    for(String str:set11)
	    {
	    	System.out.println(str);
	    }
	
	}
	
	
	

}
