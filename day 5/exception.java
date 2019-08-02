package oops;

public class exception 
{
	public static void main(String args[])
	{
		try
		{
			int a=10,b=0,c;
			int [] b1={23,45,78,90,12};
			
			System.out.println(b1[5]);
			System.out.println(a/b);
			System.out.println(b1[4]);
			
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("yoo");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("here");
			//continue;
		}
		System.out.println("there");
	}
}
