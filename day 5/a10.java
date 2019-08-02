package assignment;

public class a10 
{
	public static void main(String args[])
	{
		int a=1;
		int b=0;
		int sum=0;
		System.out.println(a);
		for(int x=1;x<=9;x++)
		{
			sum=a+b;
			System.out.println(sum);
			
			b=a;
			a=sum;
			
		}
	}
}
