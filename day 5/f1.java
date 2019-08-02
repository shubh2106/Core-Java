package file;
import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class f1 {

	
	public static void main(String[] args) 
	{
		
		try {
			File f=new File("C:\\Users\\shubham.jaiswal\\Desktop\\Newfolder\\Book1.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet("Sheet1");
			//XSSFRow row=sh.getRow(0);
			//XSSFCell cell=row.getCell(0);
			//String s=cell.getStringCellValue();
			//System.out.println("Data : "+s);
			XSSFRow row=sh.createRow(2);
			XSSFCell cell1=row.createCell(0);
			cell1.setCellValue("Globallogic");
			FileOutputStream fos=new FileOutputStream(f);
			//celll.setCellValue("Noida");
			wb.write(fos);
			String s=cell1.getStringCellValue();
			System.out.println("Data : "+s);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
				
	

	}

}
