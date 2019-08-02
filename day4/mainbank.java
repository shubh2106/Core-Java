package polymorphism;

public class mainbank {

	
	public static void main(String[] args) 
	{
		bank b;
		b=new sbi();
		System.out.println(b.get_roi());
		b=new icici();
		System.out.println(b.get_roi());
	

	}

}
