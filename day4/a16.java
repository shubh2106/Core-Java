package assignment;

public class a16 
{
	public static void main(String args[])
	{
	int a=99;
	int b=82;
	int c1=9;
	int c2=8;
	for(int x=1;x<=8;x++)
	{
		if(x%2!=0)
		{
		System.out.println(a);
		a=a-c1;
		c1=c1-2;
		}
		else
		{
			System.out.println(b);
			b=b-c2;
			c2=c2-2;
		}
		
	}
	
}
}
