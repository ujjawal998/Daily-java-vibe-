import java.util.ArrayList;

public class ListDemo3
{

	public static void main(String[] args) 
	{
		ArrayList<String> List3=new ArrayList<String>();
		List3.add("Ayush");
		List3.add("Arun");
		List3.add("Rohit");
		//if name exist then TRUE
		System.out.println(List3.contains("Rohit"));
		//if name not exist then FAlSE
		System.out.println(List3.contains("Alok"));
		 
	}

}
