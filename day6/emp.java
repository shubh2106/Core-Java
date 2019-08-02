package abstrac;

abstract class emp 
{
	int eid;
	String e_name;
	int rateperunit;
	public abstract int calc_monthly_salary();
	void emp_main(int eid, String e_name, int rate_per_unit)
	{
		this.eid=eid;
		this.e_name=e_name;
		this.rateperunit=rate_per_unit;
	}
	public emp(int eid, String ename,int rateperunit)
	{
		super();
		this.eid=eid;
		this.e_name=e_name;
		this.rateperunit=rateperunit;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getRateperunit() {
		return rateperunit;
	}
	public void setRateperunit(int rateperunit) {
		this.rateperunit = rateperunit;
	}
	

}
