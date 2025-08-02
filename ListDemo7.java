import java.util.ArrayList;
import java.util.List;
public class ListDemo7
{
	//iteration in collection 
	public static void main(String[] args) 
	{
	     List<String> List7=new ArrayList<String>();
	 	List7.add("Arun");
	    List7.add("Anuj");
		List7.add("Arpit");
		//duplicacy allowed in List
		List7.add("Arpit");
		for(String str:List7)
		{
			System.out.println(str);
		}

	}

}
