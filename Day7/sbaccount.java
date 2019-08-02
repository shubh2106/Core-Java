/*Arnav Patra*/
package asd;

public class sbaccount extends account{

	public sbaccount(String name, int amount, int account_no) {
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
}

