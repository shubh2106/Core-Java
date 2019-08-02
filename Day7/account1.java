/*Arnav Patra*/
package asd;

public abstract class account1 {
	public abstract int interest();
	String name;
	int amount;
	int account_no;
	int interest_rate;
	public account1(String name,int amount,int account_no)
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
	
	
}
