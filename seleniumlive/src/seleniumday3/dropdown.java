package seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown implements util{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to(sel_dev);
		WebElement sel=driver.findElement(By.id(my_select));
		Select objSelect = new Select(sel);
		
		objSelect.selectByIndex(0);
		objSelect.selectByValue(one);
		objSelect.selectByVisibleText("one");

	}

}
