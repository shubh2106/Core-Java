package file;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class f2 
{
	public static boolean prime(int a)
	{
		
		// TODO Auto-generated method stub
		//int count=0;
	    int flag;        
	    flag=0;
	    for(int x=2;x<=a/2;x++)
	    {
	    	if(a%x==0)
	        {
	    		flag=1;
	    		break;
	        }
	    	
	    }
	    if(flag==0)
	    {
		   return true;
		}
	    else
	    	return false;
	}
	public static boolean isodd(int n)
	{
		if(n%2!=0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		
		try {
			File f=new File("C:\\Users\\shubham.jaiswal\\Desktop\\Newfolder\\excl.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			int a=0;
			for(int x=1;x<=6;x++)
			{
				XSSFRow row=sh.getRow(a);
				XSSFCell cell=row.getCell(0);
				int s=(int)cell.getNumericCellValue();
				boolean d=prime(s);
				boolean e=isodd(s);
				a++;
				System.out.println("prime: "+d);
				System.out.println("odd: "+e);
			}
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
			
	}
}
