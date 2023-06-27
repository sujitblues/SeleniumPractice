package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
//selenium 4 new feature
		String parentWindowID=driver.getWindowHandle();
//driver.switchTo().newWindow(WindowType.TAB);//open a blank tab
driver.switchTo().newWindow(WindowType.WINDOW);//Open a blank new window
driver.get("https://www.google.com");
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(parentWindowID);
System.out.println(driver.getTitle());
	}

}
