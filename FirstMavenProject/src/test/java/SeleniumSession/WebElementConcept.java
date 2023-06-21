package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1st approch
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("sujit@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("password");
		 */
		
		
		//2nd Approch:
		/*
		 * WebElement emailId=driver.findElement(By.id("input-email")); WebElement
		 * password=driver.findElement(By.id("input-password"));
		 * emailId.sendKeys("naveen@gmail.com"); password.sendKeys("password");
		 */
		
		//3rd By locator
		/*
		 * By email=By.id("input-email"); By pwd=By.id("input-password"); WebElement
		 * emailId=driver.findElement(email); WebElement
		 * password=driver.findElement(pwd); emailId.sendKeys("sujit@gmail.com");
		 * password.sendKeys("password");
		 */
		/*
		 * //4th By locator and create a generic function to create a web element By
		 * email=By.id("input-email"); By pwd=By.id("input-password"); WebElement
		 * emailId=getElement(email); WebElement password=getElement(pwd);
		 * emailId.sendKeys("sujit@gmail.com"); password.sendKeys("password");
		 */
		
		/*
		 * //5th Approch By email=By.id("input-email"); By pwd=By.id("input-password");
		 * doSendKeys(email,"sujit@gmail.com"); doSendKeys(pwd,"password");
		 */
		
		//6th approch by locator and create generic functions for webelement and action  in util class
		
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKyes(email, "sujit@gmail.com");
		eleUtil.doSendKyes(pwd, "password");
		
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
		
	}

}
