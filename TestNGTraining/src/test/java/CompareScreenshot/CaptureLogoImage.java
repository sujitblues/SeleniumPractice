package CompareScreenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.jiomart.com/");
		Thread.sleep(3000);
		WebElement logoImageElement=driver.findElement(By.xpath("//div[@class='header-main-logo jm-mr-m'][1]"));
		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,logoImageElement);
		
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("D://selenium logo/logo.png"));
	File f=new File("D://selenium logo/logo.png");
	if(f.exists())
	{
		System.out.println("Image file Captured");
		driver.close();
	}
	else
	{
		System.out.println("Image File not Captured");
		driver.close();
	}
	
	}
	

}
