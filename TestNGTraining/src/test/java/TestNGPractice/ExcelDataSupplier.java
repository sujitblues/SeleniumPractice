package TestNGPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSupplier {
	public static void main(String[] args) throws IOException
	{
		File excelFile =new File("./src/test/resources/Test.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("login");
		//System.out.println(sheet.getPhysicalNumberOfRows());//it's include header also
		//System.out.println(sheet.getLastRowNum());//it's exclude header
		int noOfRows=sheet.getLastRowNum();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		String[][] data =new String[noOfRows-1][noOfColumns];
		for(int i=1;i<noOfRows;i++)
		{
			for(int j=0; j<noOfColumns;j++)
			{
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(sheet.getRow(i).getCell(j));
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();
		for(String[] dataArr:data)
		{
			System.out.println(Arrays.toString(dataArr));
		}
	}
	

}
