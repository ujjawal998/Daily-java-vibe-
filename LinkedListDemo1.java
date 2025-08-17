import java.util.LinkedList;
public class LinkedListDemo1
{

	public static void main(String[] args)
	{
		LinkedList<String> List17=new LinkedList<String>();
		List17.add("Aman");//add method of collection interface 
		List17.add("Rohit");//add method of collection interface 
		List17.add(0,"Ayush");//add method of List interface
		List17.addLast("Anurag");//add Last method of dequeue interface 
	    List17.add("Shivam");//add method of collection interface 
	    List17.addFirst("Anuj");//add first method of Dequeue interface  
	    List17.add("David");//add method of collection interface 
	   System.out.println("LIST 17="+List17);
	}

}
