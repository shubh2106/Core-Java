package abstrac;

public class consultant extends emp 
{
    int totalhours;
	consultant(int totalhrswork,int eid, String e_name, int rate_per_unit) 
	{
		super(eid, e_name, rate_per_unit);
		this.totalhours=totalhrswork;
	}

	public int calc_monthly_salary() 
	{
		int sal=totalhours*rateperunit;
		return sal;
	}
	

}
