package abstrac;

public class emp_main 
{
	public static void main(String args[])
	{
		consultant c=new consultant(123,1234,"xyz",301);
		int x=c.calc_monthly_salary();
		System.out.println("salary : "+x);
	}
}
