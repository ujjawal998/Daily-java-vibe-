import java.util.*;
import java.util.LinkedList;
public class LinkedListDemo
{
	public static void main (String[] args)
	{
		//LinkedList is only method for sorting,there is  no other method for sorting in queue 
		 LinkedList<String> List12=new LinkedList<String>();
		List12.add("Ujjawal");
		List12.add("Anuj");
		List12.add("Abhinav");
		List12.add("Arun");
		List12.add("Alok");
		List12.add("Ayush");
		List12.add("Ayush");
        Collections.sort(List12);
	    for(String str:List12)
	    {
	    	System.out.println(str);
	    }
	
	}
	
}
