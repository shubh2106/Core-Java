package assignment;

public class a14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int sum=0;
		for(int x=0;x<=200;x++)
		{
			if(x%7==0 && x%11==0)
				sum=sum+x;
		}
		System.out.println(sum);

	}

}
