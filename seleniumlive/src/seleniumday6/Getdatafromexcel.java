package seleniumday6;

import java.io.FileInputStream;
import java.io.IOException;


import jxl.Sheet;
import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Getdatafromexcel {
	
	public static void main(String args) throws BiffException, IOException
	{
		//excel sheet path
		String excelpath="C:\\Users\\sujit\\OneDrive\\Desktop";
		FileInputStream f=new FileInputStream(excelpath);
		Workbook workbook =Workbook.getWorkbook(f);
		//Sheet s =workbook.getSheet(0);
		Sheet s=workbook.getSheet("Loginpage");
		/*
		Cell c = s.getCell(0, 0);
		String name= c.getContents();
		System.out.println(name);*/
		int row=s.getRows();
		System.out.println(row);
		int col= s.getColumns();
		System.out.println(col);
		Cell c;
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c=s.getCell(j, i);
				String value= c.getContents();
				if(value.isEmpty())
				{
					break;
				}
				System.out.println(value);
			}
		}
		
		
	}

}
