package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {
		//above
		//left----element--->right
		//bellow
		//near ---100px
		///sel 4.0
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele=driver.findElement(By.linkText("Hamilton, Canada"));

		String rightScore=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightScore);
		
		String leftRannk=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRannk);
		
		//below of ele
		String belowCity=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		//above the element
		String aboveCity=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//near by element
		String nearCity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
	
	}

}
