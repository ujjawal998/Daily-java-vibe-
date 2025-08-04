import java.util.*;
public class ListDemo9
{
//iteration in collection foreach
	public static void main(String[] args) 
	{
	     Queue<String> List9=new PriorityQueue<String>();
	 	List9.add("Arun");
	    List9.add("Anuj");
		List9.add("Arpit");
		//duplicacy   allowed in Queue
		List9.add("Arpit");
		for(String str:List9)
		{
			System.out.println(str);
		}

	}

}
