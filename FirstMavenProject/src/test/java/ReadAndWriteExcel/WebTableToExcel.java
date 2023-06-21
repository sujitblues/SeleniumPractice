package ReadAndWriteExcel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableToExcel {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		
	String path="C:\\Users\\sujit\\SeleniumTraining\\FirstMavenProject\\datafiles\\population.xlsx";
	XLUtility xlutil=new XLUtility(path);
	//write head in excel sheet
	xlutil.setCellData("sheet", 0, 0, "country");
	xlutil.setCellData("sheet", 0, 1, "population");
	xlutil.setCellData("sheet", 0, 2, "% of world");
	xlutil.setCellData("sheet", 0, 3, "Date");
	xlutil.setCellData("sheet", 0, 4, "Source");
	WebElement table=driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']"));
	int rows=table.findElements(By.xpath("tr")).size();
	for(int r=1;r<rows;r++)
	{
		//read data from web table
		String country=table.findElement(By.xpath("tr["+r+"]/td[1]")).getText();
		String population=table.findElement(By.xpath("tr["+r+"]/td[2]")).getText();
		String perOfData=table.findElement(By.xpath("tr["+r+"]/td[3]")).getText();
		String Date=table.findElement(By.xpath("tr["+r+"]/td[4]")).getText();
		String Source=table.findElement(By.xpath("tr["+r+"]/td[5]")).getText();
		System.out.println(country+population+perOfData+Date+Source);
	//write the data in excel sheet
	xlutil.setCellData("sheet1", r, 0, country);
	xlutil.setCellData("sheet1", r, 1, population);
	xlutil.setCellData("sheet1", r, 2, perOfData);
	xlutil.setCellData("sheet1", r, 3, Date);
	xlutil.setCellData("sheet1", r, 4, Source);
	
	}
	System.out.println("File written successfully");
	driver.close();
	}
	
	
	}


