package XpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathAxesDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.jiomart.com/");
		Thread.sleep(3000);
		////a[@id='nav_link_2']/ancestor::ul
		List<WebElement>menulist=driver.findElements(By.xpath("//li[@id='nav_cat_2']/parent::ul/child::*"));
		System.out.println("Number of descendant "+menulist.size());
		//int categoryCount=menulist.size();
		for(WebElement cat:menulist)
		{
			System.out.println("menuItem :"+cat);
			
		}

		driver.close();
	}

}
