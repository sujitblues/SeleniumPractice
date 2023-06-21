package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	@Test 
	public void TestGoogle() throws InterruptedException
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.co.in/");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("q")).sendKeys("API Automation Jobs",Keys.ENTER);
		System.out.println(Driver.getTitle());
		Thread.sleep(5000);
		Driver.quit();
		
	}
	@Test
	public void Testfacebook() throws InterruptedException
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("email")).sendKeys("API Automation Jobs",Keys.ENTER);
		System.out.println(Driver.getTitle());
		Thread.sleep(5000);
		Driver.quit();
		 
	}
}

