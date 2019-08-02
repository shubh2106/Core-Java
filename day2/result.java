package prime;

public class result {



	public static void main(String[] args) 
	{
		float marks=75.0f;
		if(marks>=75)
			System.out.println("FCD");
		else if(marks<75 && marks>=60)
			System.out.println("FC");
		else if(marks<60 && marks >=50)
			System.out.println("SC");
		else if(marks<50 && marks>=35)
			System.out.println("PC");
		else
			System.out.println("F");

	}

}
