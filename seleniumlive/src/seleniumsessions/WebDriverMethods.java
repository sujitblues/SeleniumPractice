package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.getPageSource();
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());

	}

}
