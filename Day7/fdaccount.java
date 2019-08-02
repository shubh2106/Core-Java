/*Arnav Patra*/
package asd;

public class fdaccount extends account{
	
	public fdaccount(String name, int amount, int account_no) {
		super(name, amount, account_no);
		// TODO Auto-generated constructor stub
	}
	int interest_rate=4;

	/**
	 * @param args
	 */
	public int interest()
	{
		return interest_rate;
	}
	public int maturity()
	{
		return amount+(amount*interest_rate/100);
	}
}

