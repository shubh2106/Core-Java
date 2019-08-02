package prime;

public class obj1
{
	String color;
	float len;
	float breadth;
	String brand;
	public void call()
	{
		System.out.println("Mobileis calling");
		
	}
	public void msg()
	{
		System.out.println("Mobile is messaging");
		
	}
	public void displaydetails()
	{
		System.out.println("color= "+color+" len= "+len+" brand= "+brand);
	}
	public static void main(String args[])
	{
		obj1 smg=new obj1();
		smg.color="black";
		smg.len=8;
		smg.breadth=1;
		smg.brand="oneplus";
		smg.call();
		smg.msg();
		smg.displaydetails();
	}

}
