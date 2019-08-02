package prime;

public class arr1 {

	
	public static void main(String[] args) 
	{
		int m[]={21,23,45,67,89};
		int sum=0;
		for(int x=0;x<=4;x++)
		{
			sum=sum+m[x];
		}
		int avg=sum/5;
		for(int x=0;x<5;x++)
		{
			if(m[x]>=avg)
				System.out.println(m[x]);
		}
	}

}
