package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sliderRange {

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
		 // This  will scroll down the page by  1000 pixel vertical		
        //js.executeScript("window.scrollBy(0,900)");
        
        Thread.sleep(10000);
		WebElement max_Slider=driver.findElement(By.xpath("//div[@id='avg_selling_price_filter']//div[@role='slider'][2]"));
		js.executeScript("arguments[0].scrollIntoView(true);", max_Slider);
		//js.executeScript("arguments[0].setAttribute('style','left:30%;')", max_Slider);
		 Thread.sleep(10000);
		Actions moveSlider = new Actions(driver);
		 moveSlider.dragAndDropBy(max_Slider, -200, 0).build().perform();
		
		 //moveSlider.dragAndDropBy(max_Slider, -37, 0).perform();
		
		  
		 
	}

}
