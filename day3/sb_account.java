package oops;

public class sb_account extends acc
{
	public boolean withdraw(float withdraw_amt)
	{
		if(accountbal-withdraw_amt >=500)
		{
			accountbal=accountbal-withdraw_amt;
			return true;
		}
		return false;
	}
	public void deposit(float depositAmt)
	{
		accountbal=accountbal+depositAmt;
	}

}
