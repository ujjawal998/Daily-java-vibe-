import java.util.PriorityQueue;
public class QueueDemo 
{

	public static void main(String[] args) 
	{
	
			PriorityQueue<String> queue=new PriorityQueue<String>();
			//this offer(); method is also use like add(); method 
			queue.offer("Aman");
			queue.offer("Rakesh");
			queue.offer("David");
			queue.offer("Anuj");
			queue.offer("Ramesh");
			System.out.println(queue);
			
			
				
		}
}
