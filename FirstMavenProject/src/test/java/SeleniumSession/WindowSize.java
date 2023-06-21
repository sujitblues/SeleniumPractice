package SeleniumSession;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Dimension dim=new Dimension(800,500);
		driver.manage().window().setSize(dim);
		driver.get("https://www.amazon.com");

	}

}
