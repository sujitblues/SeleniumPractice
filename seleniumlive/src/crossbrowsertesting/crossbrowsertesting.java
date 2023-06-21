package crossbrowsertesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class crossbrowsertesting {
	WebDriver	driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
	    driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("edge")){
				 driver = new EdgeDriver();
				}
		else{
			System.out.println("Not found the browser");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		}
	
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Find user name
		//WebElement userName = driver.findElement(By.name("username"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//Fill user name
		//userName.sendKeys("Admin");
		//Find password
		//WebElement password = driver.findElement(By.name("password"));
		//Fill password
		//password.sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}

	

