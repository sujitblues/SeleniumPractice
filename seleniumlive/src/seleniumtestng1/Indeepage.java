package seleniumtestng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Indeepage {
	WebDriver driver;
	String Url="https://in.indeed.com/";
	String jobid="text-input-what";
	@Test
	void OpenUrl()
	{
		driver= new ChromeDriver();
		driver.get(Url);
		//driver.naviagate().to(Url)
		//What is difference between get and navigate method
		
	}
	void getjob()
	{
		driver.findElement(By.id(jobid)).sendKeys("selenium job");
	}
	void clickButton()
	{
		
	}
	void closepage()
	{
		
	}

}
