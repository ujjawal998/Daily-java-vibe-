import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo 
{
    public static void main(String[] args)
 {

        Deque<String> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque after additions: " + deque);

        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removals: " + deque);

        // Peeking at the front and rear
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
    }
}
