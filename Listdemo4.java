import java.util.ArrayList;

public class Listdemo4
{

	public static void main(String[] args) 
	{
		ArrayList<String> List4=new ArrayList<String>();
		List4.add("Ayush");
		List4.add("Arun");
		List4.add("Rohit");
		//Before clearing method
		System.out.println("Before Clearing Method List 4 ="+List4);
		//After clearing method
		List4.clear();
		System.out.println("After Clearing Method List 4="+List4);
	
	}
}
