package prime;

public class electricity {

	
	public static void main(String[] args) 
	{
     int units=300;
     double sum=0;
     if (units<=100)
     {
    	 sum= sum+units*1.5;
    	 
     }
     else if(units>100 && units<=200)
     {
    	 sum=sum+100*1.5+(units-100)*2.0;
    	 
     }
     else if(units > 200 && units <=250)
     {
    	 sum=sum+100*1.5+100*2.0+(units-200)*2.50;     
     }
     else
    	 sum=sum+100*1.5+100*2.0+50*2.5+(units-250)*4.0;
     System.out.println(sum);
	}

}
