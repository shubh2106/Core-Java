/*Arnav Patra*/
package asd;
import java.util.Scanner;
public class test1_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	while(true)
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("Which type of account do you want(FD/SB)?");
		String s=sc.nextLine();
		if(s.equals("FD"))
		{
			System.out.println("Name ");
			String s1=sc.nextLine();
			System.out.println("Amount ");
			int i=sc.nextInt();
			System.out.println("Account_no ");
			int j=sc.nextInt();
			account1 a=new fdaccount1(s1,i,j);
			a.display();
			System.out.println("Interest Amount "+a.calc());
			a.amt();
		}
		else if(s.equals("SB"))
		{
			System.out.println("Name ");
			String s1=sc.nextLine();
			System.out.println("Amount ");
			int i=sc.nextInt();
			System.out.println("Account_no ");
			int j=sc.nextInt();
			account1 a=new sbaccount1(s1,i,j);
			a.display();
			System.out.println("Interest Amount "+a.calc());
			a.amt();
		}
		else
		{
			System.out.println("Wrong input");
			
		}
		System.out.println("Do you want to continue?(Yes/No)");
		String s2=sc.next();
		if(s2.equals("No"))
		{
			System.out.println("Good day!!!");
			break;
		}
	}}
	

}
