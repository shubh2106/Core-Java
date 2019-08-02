/*Arnav Patra*/
package asd;

public class sbaccount1 extends account1{

	
	public sbaccount1(String name, int amount, int account_no) {
		super(name, amount, account_no);
		// TODO Auto-generated constructor stub
	}
	int interest_rate=4;
	/**
	 * @param args
	 */
	public int interest(){
		return interest_rate;
		
	}
	public int calc()
	{
		System.out.println(interest_rate);
		return (interest_rate*amount/100);
	}
	public void amt()
	{
		System.out.println( amount+(interest_rate*amount/100));
	}

}
