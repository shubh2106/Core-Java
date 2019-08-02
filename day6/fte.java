package abstrac;

public class fte extends emp
{
	public fte(int totaldaysworked,int eid, String e_name, int rate_per_unit) {
		super(eid, e_name, rate_per_unit);
		this.totaldays=totaldaysworked;
	}
	int totaldays;
	
	public int calc_monthly_salary() 
	{
		int sal=totaldays*rateperunit;
		return sal;
	}
	
}
