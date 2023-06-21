package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//testing is happening behind the scene
		//faster
		//can be helpful in linux machine
		//can be used with CI CD pipeline -jenkins,GithubActions,AWS
		//might not work for complex app-html ,menu items
		//might not work for navigations,mouse hover,mouse movement
		
		/* Chrome
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		//op.addArguments("--headless");
		op.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(op);
		*/
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}
