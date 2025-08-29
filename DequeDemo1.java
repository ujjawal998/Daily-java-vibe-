import java.util.Deque;
import java.util.ArrayDeque;
public class DequeDemo1
{
    public static void main(String[] args)
    {
        Deque<String> d=new ArrayDeque<String>();
        //adding elements
        d.addFirst("A");
        d.addFirst("C");
        d.add("E");
        d.add("F");
        d.addLast("B");
        d.addLast("D");
        System.out.println(d);
        //removing elements 
        d.removeFirst();
        d.removeLast();
        System.out.println(d);
        //peek element
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
       
        }
}