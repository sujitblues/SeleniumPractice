package extentreportpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReport {
	static WebDriver driver;
	static ExtentReports reports;
	static ExtentTest test;
	@BeforeTest
public void startTest()
{
		String path="C:\\Users\\sujit\\SeleniumTraining\\seleniumlive\\src\\customreport\\";
		reports=new ExtentReports(path + "SecondReport.html" );
		test=reports.startTest("ExtentDemo");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
}
	@Test
	public void extentReportsDemo()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			test.log(LogStatus.PASS,"Test is working");
		}
		else
		{
			test.log(LogStatus.PASS,"Test is not working");
		}
	}
	@AfterTest
	public void testEnd()
	{
		reports.endTest(test);
		reports.flush();
		driver.close();
		
	}

}
