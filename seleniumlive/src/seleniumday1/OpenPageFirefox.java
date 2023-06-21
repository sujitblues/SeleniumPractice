package seleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPageFirefox {

	static String url="https://in.linkedin.com/";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}

}
