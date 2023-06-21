package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationMethod {

	public static void main(String[] args) {
		//back and forward button simulation:
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.getTitle();
		driver.navigate().to("https://www.amazon.in/");
		driver.getTitle();
		driver.navigate().back();
		driver.getTitle();
		driver.navigate().forward();
		driver.getTitle();
		driver.navigate().back();
		driver.getTitle();
	}

}
