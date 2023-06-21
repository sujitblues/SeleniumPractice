package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocatorsCric {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/delhi-capitals-vs-kolkata-knight-riders-28th-match-1359502/full-scorecard");

		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Litton Das']"));
		String rigthOfele=driver.findElement(with(By.cssSelector("ds-flex.ds-cursor-pointer.ds-items-center")).toRightOf(ele)).getText();
		System.out.println(rigthOfele);
	}

}
