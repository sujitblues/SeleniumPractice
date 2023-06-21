package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//Testing is happening behind the scene
		//Faster
		//can be helpful in linux machine
		//can be used with CI CD pipeline-jnekins,GithubActions,Aws
		//might not work for complex app-html,menu items
		//might not work for internal navigations,mouse hover,mouse movement
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.quit();

		//firfox
		FirefoxOptions co2=new FirefoxOptions();
		//co.addArguments("--headless");
		co2.addArguments("--incognito");
		WebDriver driver1 =new FirefoxDriver(co2);
		driver.get("https://www.google.com");
		
	}

}
