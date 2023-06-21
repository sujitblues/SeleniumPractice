package seleniumday7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclass {
	
	@DataProvider(name="Loginpage")
	@Test
	String[][] setdata()
	{
		String Loginpage[][]= {{"kapil","Kapil123!","This is my automation"},{"kapil","Kapil123!","This is my automation"},{"kapil","Kapil123!","This is my automation"}};
		return Loginpage;
		
	}
	@Test(dataProvider="Loginpage")
	void getdata(String username,String password,String message) throws InterruptedException
		{
		System.out.println(username);
		System.out.println(password);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("my-text-id")).sendKeys(username);
		driver.findElement(By.name("my-password")).sendKeys(password);
		driver.findElement(By.name("my-textarea")).sendKeys(message);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).clear();
		driver.close();
	}

}
