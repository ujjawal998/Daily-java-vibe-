import java.util.*;
import java.util.List;
public class ListDemo10
{
	public static void main (String[] args)
	{
		List<String> List10=new ArrayList<String>();
		List10.add("Ujjawal");
		List10.add("Anuj");
		List10.add("Abhinav");
		List10.add("Arun");
	    Collections.sort(List10);
	    for(String name:List10)
	    {
	    	System.out.println(name);
	    }
	
	}
}
	
	

