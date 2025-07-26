import java.util.ArrayList;
public class List 
{
      public static void main(String[] args) 
	{
		ArrayList<String> List=new ArrayList<String>();
		//List 
		List.add("Aman");
		List.add("Alok");
		System.out.println("LIST ="+List);
		ArrayList<String> List1=new ArrayList<String>();
		//List 2 
		List1.add("Ujjawal");
		List1.add("Anuj");
		List1.add("Rohit");
		System.out.println("LIST 1="+List1);
		//List 3
		ArrayList<String> List2=new ArrayList<String>();
		List2.add("Ayush");
	    System.out.println("LIST 2"+List2);
		//Adding all List1+List2+List3 
	    List2.addAll(List);
	    List2.addAll(List1);
	    System.out.println("LIST 2"+List2);
	   
	    }

}
