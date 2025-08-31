import java.util.Arrays;

public class ArrayDemo1
{
	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40};
		System.out.println("initial size=" + arr.length);

		int[] narr=new int[arr.length*2];

		for(int i=0;i<arr.length;i++)
		{
			narr[i]=arr[i];
		}

		arr=narr;
		System.out.println("current size=" + arr.length);

		int[] arr1=narr;
		int[] arr11= {10,20,30,40,50,60,70};
		System.out.println("arr11 length=" + arr11.length);

		// print actual array elements
		System.out.println("arr = " + Arrays.toString(arr1));
	}
}
