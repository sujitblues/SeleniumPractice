package InterviewPreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SarchProduct {
	
	static WebDriver driver;
		public void TypeInField(String xpath, String value) throws InterruptedException{
		    String val = value; 
		    WebElement element = driver.findElement(By.xpath(xpath));
		    element.clear();

		    for (int i = 0; i < val.length(); i++){
		        char c = val.charAt(i);
		        String s = new StringBuilder().append(c).toString();
		        
		        element.sendKeys(s);
		        Thread.sleep(2000);
		        System.out.println(s);
		    }     
		    
		}
	

	public static void main(String[] args) throws InterruptedException {
		 //WebDriver driver =new ChromeDriver();
		  driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				driver.get("https://demowebshop.tricentis.com/");
				//driver.findElement(By.id("small-searchterms")).sendKeys("14.1 inch Laptop");
						driver.manage().window().maximize();
						Thread.sleep(3000);
				String xpath="//input[@id='small-searchterms']";
				String value="14.1";
				SarchProduct sproduct=new SarchProduct();
				sproduct.TypeInField(xpath, value);
				driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]/a")).click();
				Thread.sleep(3000);
				/*
				List<WebElement>list=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[1]"));
				System.out.println(list.size());
				for(WebElement listitem:list)
				{
					if(listitem.getText().equals("14.1 inch Laptop"))
					{
						listitem.click();
						break;
						
					}
				}
				*/

	}

}
