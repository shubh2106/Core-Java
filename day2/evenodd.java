package prime;
import java.util.Scanner;

public class evenodd {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");

	}

}
