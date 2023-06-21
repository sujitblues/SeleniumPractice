package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.get("https://classic.crmpro.com");
		//String pageSource=driver.getPageSource();
		driver.get("https://www.google.com");
		//System.out.println(pageSource);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		
	}

}
