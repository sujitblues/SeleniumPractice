package InterviewPreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String year="2023";
		String month="Mar";
		String date="10";
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arr[]=monthyear.split("");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
		driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		}
		//Date selection
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for(WebElement ele:alldates)
		{
			String dt=ele.getText();
			if(dt.equals(date))
			{
				ele.click();
			}
		}
		}
		

	}


