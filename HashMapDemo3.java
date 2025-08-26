import java.util.HashMap;
import java.util.Map;
public class HashMapDemo3
{
	public static void main(String[] args)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Aman","923724620");
		map.put("Rohit","27943719");
		map.put("Anuj","807426496");
		map.put("Anurag","23729642");
	    map.put("David","3793791047");
	    //contains method is used for checking value exist or not 
		System.out.println(map.containsKey("Anuj"));
		System.out.println(map.containsKey("Arun"));
	}

}
