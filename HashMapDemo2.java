import java.util.HashMap;
import java.util.Map;
public class HashMapDemo2
{
	public static void main(String[] args)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Aman","923724620");
		map.put("Rohit","27943719");
		map.put("Anuj","807426496");
		map.put("Anurag","23729642");
	    map.put("david","3793791047");
	    //get method is used for getting  value by element name
		System.out.println(map.get("Anuj"));
	}    
	
}
