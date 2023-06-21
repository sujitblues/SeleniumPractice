package extentreportpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReportWork {
	static WebDriver driver;
	static ExtentReports reports;
	static ExtentTest test;

	public static void main(String[] args) {
		String path="C:\\Users\\sujit\\SeleniumTraining\\seleniumlive\\src\\customreport\\";
		reports=new ExtentReports(path + "FirstReport.html" );
		test=reports.startTest("Demo");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
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
reports.endTest(test);
reports.flush();
	}

}
