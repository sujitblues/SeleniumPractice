package mouseHover;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class readMenuItem {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.jiomart.com/");
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='header-nav-l1 custom-scrollbar']//li[@class='header-nav-l1-item']//a[@class='header-nav-l1-item-link']"));
		
		System.out.println(list.size());
		for(WebElement li:list)
		{
			System.out.println(li);
		}
driver.close();
	}

}
