package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		brUtil.launchURL("");
		String title=brUtil.getPageTitle();
		By email=By.id("");
		By pwd=By.id("");
		

	}

}
