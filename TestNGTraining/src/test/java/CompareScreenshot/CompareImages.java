package CompareScreenshot;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.jiomart.com/");
		BufferedImage expectedImage=ImageIO.read(new File("D://selenium logo/logo.png"));
WebElement LogoImageElement=driver.findElement(By.xpath("//div[@class='header-main-logo jm-mr-m'][1]"));
Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,LogoImageElement);
BufferedImage actualImage=logoImageScreenshot.getImage();
ImageDiffer imgDiff=new ImageDiffer();
ImageDiff diff=imgDiff.makeDiff(expectedImage, actualImage);
 
if(diff.hasDiff()==true)
{
	System.out.println("Images are Not same");
}
else
{
	System.out.println("Images are same");
}
driver.quit();
	}

}
