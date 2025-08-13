import java.util.PriorityQueue;
public class QueueDemo1

{
	public static void main(String[] args)
	{
		PriorityQueue<String> Queue1=new PriorityQueue<String>();
		Queue1.offer("Anuj");
		Queue1.offer("Rohit");
		Queue1.offer("Shivam");
		Queue1.offer("Ujjawal");
		Queue1.offer("Anurag");
		//this peek(); method prints the first element 
		System.out.println(Queue1.peek());
	}
	

}
