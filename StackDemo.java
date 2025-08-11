import java.util.*;;
public class StackDemo 
{
	public static void undo(Stack<Character> stack)
	{
		System.out.println(stack.pop());
		System.out.println(stack);
	}
		public static void main(String[] args)
		{
			Stack<Character> stack=new Stack<Character>();
			stack.push('U');
			stack.push('J');
			stack.push('J');
			stack.push('A');
			stack.push('W');
			stack.push('A');
			stack.push('L');
			undo(stack);
			undo(stack);
			undo(stack);
			undo(stack);
			undo(stack);
			undo(stack);
			undo(stack);
			System.out.println("after undo="+stack);
		
			
			
		}

}
