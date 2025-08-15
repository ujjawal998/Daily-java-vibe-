import java.util.PriorityQueue;
public class QueueDemo3

{
	public static void main(String[] args)
	{
		PriorityQueue<String> Queue3=new PriorityQueue<String>();
		Queue3.offer("Anuj");
		Queue3.offer("Rohit");
		Queue3.offer("Shivam");
		Queue3.offer("Anurag");
		Queue3.offer("Ayush");
		//poll(); method returns null when the queue is empty
		Queue3.clear();
		System.out.println(Queue3.poll());
		
	}
	

}
