import java.util.*;
public class ListDemo8
{
	//iteration in collection 
	public static void main(String[] args) 
	{
	     Set<String> List8=new HashSet<String>();
	 	List8.add("Arun");
	    List8.add("Anuj");
		List8.add("Arpit");
		//duplicacy  not allowed in Set
		List8.add("Arpit");
		for(String str:List8)
		{
			System.out.println(str);
		}

	}

}
