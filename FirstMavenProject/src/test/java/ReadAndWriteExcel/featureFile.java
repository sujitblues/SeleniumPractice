package ReadAndWriteExcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class featureFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/p/electronics/samsung-galaxy-m13-5g-64-gb-4-gb-ram-midnight-blue-mobile-phone/597540052");
		
	String path="C:\\Users\\sujit\\SeleniumTraining\\FirstMavenProject\\datafiles\\features.xlsx";
	XLUtility xlutil=new XLUtility(path);
	//write head in excel sheet
	xlutil.setCellData("sheet", 0, 0, "feature");
	
	WebElement table=driver.findElement(By.xpath("//div[@class='product-key-features-list-wrapper jm-body-s jm-mb-base']//ul[@class='product-key-features-list']"));
	int rows=table.findElements(By.xpath("li")).size();
	System.out.println(rows);
	for(int r=1;r<rows;r++)
	{
		//read data from web table
		String features=table.findElement(By.xpath("li["+r+"]")).getText();
		System.out.println(features);
	//write the data in excel sheet
	xlutil.setCellData("sheet1", r, 0, features);
	
	}
	System.out.println("File written successfully");
	driver.close();
	}
	
	
	
	}


