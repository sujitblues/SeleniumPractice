package searchProduct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class searchItem {
	public static void VerifyProduct(String title)
	{
		String expected="Samsung Galaxy 64 GB";
		if(title.contains(expected))
		{
			System.out.println("Product verified :Pass");
		}
		else
		{
			System.out.println("Not a valid product:Fail");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.jiomart.com/");
	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@id='autocomplete-0-input']")).sendKeys("Samsung Galaxy 64 GB",Keys.ENTER);
			Thread.sleep(5000);
			WebElement title=driver.findElement(By.xpath("//div[@class='jm-col-4 jm-mt-base'][1]//a[contains(@title, 'Samsung Galaxy')]"));
			String AcutalTitle=title.getText();
			VerifyProduct(AcutalTitle);
			driver.close();
			//driver.quit();
	}

}
