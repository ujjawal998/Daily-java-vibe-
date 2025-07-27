import java.util.ArrayList;

public class ListDemo1
{
	public static void main(String[] args)
	{
		ArrayList<String> List1=new ArrayList<String>();
		//List 1
		List1.add("Ujjawal");
		List1.add("Anuj");
		List1.add("Rohit");
		System.out.println("LIST 1="+List1);
		//List 2
		ArrayList<String> List2=new ArrayList<String>();
		List2.add("Aman");
		List2.add("Alok");
		System.out.println("LIST 2="+List2);
		//List 3
		ArrayList<String> List3=new ArrayList<String>();
		List3.add("Ayush");
		System.out.println("LIST 3="+List3);
		// adding all List
		List3.addAll(List1);
		List3.addAll(List2);
		System.out.println("Before removing List 2="+List3);
		//removing List 2
		List3.removeAll(List2);
		System.out.println("After removing List 2="+List3);
		
		}

}
