import java.util.PriorityQueue;
public class QueueDemo2

{
	public static void main(String[] args)
	{
		PriorityQueue<String> Queue2=new PriorityQueue<String>();
		Queue2.offer("Anuj");
		Queue2.offer("Rohit");
		Queue2.offer("Shivam");
		System.out.println(Queue2.peek());
		Queue2.remove();
		//after removing first element (index 0) then the priority given to second 
		//element (index 1)
		System.out.println(Queue2.peek());
	}
	

}
