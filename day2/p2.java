package prime;

public class p2 
{

	public static void main(String[] args) 
	{
		for(int x=1;x<=3;x++)
		{
			for(int y=1;y<=3-x;y++)
			System.out.print(" ");
			for(int z=1;z<=x;z++)
			System.out.print(z);
			System.out.println();
		}

	}

}
