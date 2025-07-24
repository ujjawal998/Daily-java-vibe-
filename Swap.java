public class Swap 
{

	public static void main(String[] args)
	{
		int x=30,y=40;
		int Swap;
		System.out.println("Before Swap x="+x+" and y="+y);
		Swap=x;
		x=y;
		y=Swap;
		System.out.println("After Swap x="+x+" and y="+y);
	}
}