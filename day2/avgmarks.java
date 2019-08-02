package prime;
import java.io.*;

public class avgmarks {

	
	public static void main(String[] args)throws IOException
	
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		double max=0;
		
		String n="";
		
		
		for(int x=1;x<=3;x++)
		{
			System.out.println("Enter the name of student");
			String name=br.readLine();
			int avg=0;
			
				System.out.println("Enetr the marks of 1");
				int a=Integer.parseInt(br.readLine());
				System.out.println("Enetr the marks of 2");
				int b=Integer.parseInt(br.readLine());
				System.out.println("Enetr the marks of 3");
				int c=Integer.parseInt(br.readLine());
				System.out.println("Enetr the marks of 4");
				int d=Integer.parseInt(br.readLine());
				avg=(a+b+c+d)/4;
				System.out.println("the avg is of this student : "+avg);
				if(avg>max)
				{
					max=avg;
					n=name;
				}
				
		}
		System.out.println("Highest average"+max+" name of student is : "+n);
		

	}

}
