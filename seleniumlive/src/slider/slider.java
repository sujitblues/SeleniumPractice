package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("location of the min slider :"+min_slider.getLocation());
		System.out.println("Height and width of element :"+min_slider.getSize());
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100,0).perform();
		System.out.println("location of the min slider :"+min_slider.getLocation());
		System.out.println("Height and width of element :"+min_slider.getSize());
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -100,0).perform();
		driver.close();
		
	}

}
