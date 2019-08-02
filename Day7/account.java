/*Arnav Patra*/
package asd;

public abstract class account {
	public abstract int interest();
	String name;
	int amount;
	int account_no;

	public account(String name,int amount,int account_no)
	{
		this.name=name;
		this.amount=amount;
		this.account_no=account_no;
	}
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("Amount "+amount);
		System.out.println("Account_no"+account_no);
	}
	public int calc(account a)
	{
		int interest_rate=a.interest();
		return amount*interest_rate/100;
	}
	public void mat1()
	{
		fdaccount a =new fdaccount(this.name,this.amount,this.account_no);
		System.out.println("Maturity "+a.maturity());
	}
	
}
