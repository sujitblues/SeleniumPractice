package seleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Implicit wait- 2seconds time out

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.id("inputUsername")).sendKeys("sujit");
			driver.findElement(By.name("inputPassword")).sendKeys("Hello@123");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sujit");
			driver.findElement(By.cssSelector("Input[placeholder='Email']")).sendKeys("sujit.blues@gmail.com");
			driver.findElement(By.xpath("//Input[@type='text'][2]")).clear();
			driver.findElement(By.cssSelector("Input[type='text']:nth-child(3)")).sendKeys("sujit.blues@hotmail.com");
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer')/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')")).click();
			
	}

}
