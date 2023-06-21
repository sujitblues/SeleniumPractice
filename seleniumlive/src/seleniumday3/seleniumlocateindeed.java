package seleniumday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumlocateindeed implements util{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(indeed_url);
		driver.findElement(By.id(what)).sendKeys(skill);
		driver.findElement(By.id(area_name)).sendKeys(location);
		driver.findElement(By.xpath(find_job)).click();
		

	}

}
