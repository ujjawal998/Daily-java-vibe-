import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMap1
{
	public static void main(String[] args)
	{
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("Aman","923724620");
		map.put("Rohit","27943719");
		map.put("Anuj","807426496");
		map.put("Anurag","23729642");
		// Overwrites the previous value for "Aman"
		map.put("Aman","1936193619");
		map.put("David","3793791047");
		System.out.println(map);
		
	}

}
