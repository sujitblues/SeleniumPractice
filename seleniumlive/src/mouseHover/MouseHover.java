package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.jiomart.com/");
		Thread.sleep(5000);
		//WebElement e=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement electronicsMenu=driver.findElement(By.xpath("//a[@id='nav_link_4']"));
		WebElement mobAndTablet=driver.findElement(By.xpath("//a[@id='nav_link_757']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronicsMenu).moveToElement(mobAndTablet).build().perform();
		Thread.sleep(5000);
		WebElement smartPhone=driver.findElement(By.xpath("//a[@id='nav_level3_777']"));
		smartPhone.click();
		//driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
		driver.close();
		driver.quit();
	}

}
