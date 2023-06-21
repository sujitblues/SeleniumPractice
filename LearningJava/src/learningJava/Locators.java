package learningJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking browser
		//chrome -chromeDriver->methods
		//Firfox -firefoxDriver->methods
		//webDriver methods+class methods
		//ChromeDriver driver=new ChromeDriver();
		
		//chromedriver.exe->chrome browser
				System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\sujit\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe\"");
		//webdriver.chrome.driver->value of path
				WebDriver driver=new ChromeDriver();
	}

}
