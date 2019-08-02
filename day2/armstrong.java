package prime;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int a=sc.nextInt();
		int sum=0;
		int count=0;
		int n=a;
		int f=a;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		while(a!=0)
		{
			int d=a%10;
			a=a/10;
			sum=sum+(int)Math.pow(d,count);
		}
		if(sum==f)
			System.out.println("Armstrong no");
		else
			System.out.println("Not a Armstrong no"+sum);
		
		

	}

}
