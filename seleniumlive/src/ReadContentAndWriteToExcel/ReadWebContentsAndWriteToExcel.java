package ReadContentAndWriteToExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ReadWebContentsAndWriteToExcel {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.jiomart.com/");
		Thread.sleep(5000);
		WebElement electronicsMenu=driver.findElement(By.xpath("//a[@id='nav_link_4']"));
		WebElement mobAndTablet=driver.findElement(By.xpath("//a[@id='nav_link_757']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronicsMenu).moveToElement(mobAndTablet).build().perform();
		Thread.sleep(5000);
		WebElement smartPhone=driver.findElement(By.xpath("//a[@id='nav_level3_777']"));
		smartPhone.click();       
        Thread.sleep(10000);
        List<WebElement>list=driver.findElements(By.xpath("//div[@class='plp-card-details-name line-clamp jm-body-xs jm-fc-primary-grey-80']"));
        
		WebElement max_Slider=driver.findElement(By.xpath("//div[@id='avg_selling_price_filter']//div[@role='slider'][2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", max_Slider);

	}

}
