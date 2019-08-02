package oops;

public class test_sb_acc 
{

	
	public static void main(String[] args) 
	{
		sb_account sbacc=new sb_account();
		sbacc.accountno=13579;
		sbacc.accountbal=1000;
		sbacc.int_rate=10;
		sbacc.deposit(1000);
		System.out.println(sbacc.get_account_det());
		sbacc.withdraw(500);
		System.out.println(sbacc.get_account_det());

	}

}
