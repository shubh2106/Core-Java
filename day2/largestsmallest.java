package prime;
import java.util.Scanner;
public class largestsmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int large=0;
		int small=0;
		if(a>b && a>c)
		{
			large=a;
			if(c>b)
				small=b;
			else
				small=c;
		
		}
		else if(c>a && c>b)
		{
			large=c;
			if(a>b)
				small=b;
			else
				small=a;
					
		}
		else
		{
			large=b;
			if(a>c)
				small=c;
			else
				small=a;
		
		}
		System.out.println("largest no is: "+large);
		System.out.println("smallest no is: "+small);
		

	}

}
