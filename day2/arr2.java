package prime;

public class arr2 {

	
	public static void main(String[] args) 
	{
		int m[]={21,44,15,50,55,10,59,6,60,5};
		for(int x=0;x<10;x++)
		{
			for(int y=x;y<10;y++)
			{
				if(m[x]+m[y]==65)
					System.out.println("the pairs are : "+m[x]+" "+m[y]);
			}
		}
	

	}

}
