package prime;

public class stucallobj {

	
	public static void main(String[] args) 
	{
		objstu stu1=new objstu();
		objstu stu2=new objstu();
		stu1.name="Shubham";
		stu1.s1=67;
		stu1.s2=76;
		stu1.avg();
		float a1=stu1.a;
		stu2.name="Arun";
		stu2.s1=87;
		stu2.s2=89;
		stu2.avg();
		float a2=stu1.a;
		if(a1>a2)
		{
			stu1.displaydetails();
		}
		else
		{
			stu2.displaydetails();
		}

	}

}
