import java.util.ArrayList;
public class ListDemo2
{

	public static void main(String[] args) 
	{
		//List 2
		ArrayList <String> List2=new ArrayList<String>();
		List2.add("Ujjawal");
		System.out.println("LIST 2="+List2);
		//List 3
		ArrayList<String> List3=new ArrayList<String>();
		List3.add("Ayush");
		List3.add("Arun");
		List3.add("Rohit");
		System.out.println("LIST 3="+List3);
		// adding both lists
		List3.addAll(List2);
		System.out.println("Before Retain="+List3);
		//applying Retain 
		List3.retainAll(List2);
		System.out.println("After Applying Retain="+List3);
		
	 }

}
