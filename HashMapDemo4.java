import java.util.*;
public class HashMapDemo4
{
	public static void main(String[] args)
	{
		Map<String,String> map=new HashMap<String,String>();
		map.put("Aman","923724620");
		map.put("Rohit","27943719");
		map.put("Anuj","807426496");
		map.put("Anurag","23729642");
	    map.put("david","3793791047");
	    Set<Map.Entry<String,String>> set=map.entrySet();
	    for(Map.Entry<String,String> me:set)
	    {
	    	System.out.println(me);
	    	
	    }
		
	}
}
