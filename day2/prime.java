package prime;


public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        int flag;        
        
        int sum=0;
        for(int n=2;n<100;n++)
        {
        	flag=0;
        	for(int x=2;x<=n/2;x++)
        	{
        		if(n%x==0)
        		{
        			flag=1;
        			break;
        		}
 		   
        	}	
        	if(flag==0 && count<10)
        	{
			   System.out.println("the no is prime : "+n);
			   sum+=n;
			   count++;
		    }
        }
        System.out.println("Sum of prime numbers is : "+sum);
		
	}

}
