package seleniumday2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeDriver chromeDriver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//open url
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(3000);
		WebElement value=driver.findElement(By.xpath("//h1[@class='display-6']"));
		String disp=value.getText();
		System.out.println(disp);
		
		driver.findElement(By.id("my-text-id")).sendKeys("Sujit");
		driver.findElement(By.name("my-password")).sendKeys("Hello@123");
		driver.findElement(By.name("my-textarea")).sendKeys("Automation Testing learning inprogress");
		boolean disenabledinput=driver.findElement(By.xpath("//input[@name='my-disabled']")).isEnabled();
		System.out.println(disenabledinput);
		boolean readonlycontent=driver.findElement(By.xpath("//input[@name='my-readonly']")).isDisplayed();
		System.out.println(readonlycontent);
		Select dropdownitem=new Select(driver.findElement(By.xpath("//select[@name='my-select']")));
		
		//select item from drop-down by index
		dropdownitem.selectByIndex(0);
		//select item from drop-down by visible text
		dropdownitem.selectByVisibleText("One");
		//select item from drop-down by value
		dropdownitem.selectByValue("1");
		Thread.sleep(5000);
		
		//select item from drop-down list box
		Select dropdown = new Select(driver.findElement(By.xpath("//input[@name='my-datalist']")));

	    //Get all options
		/*
	    List<WebElement> dd = dropdown.getOptions();
	    for(WebElement option : dd){
	        if(option.getText().equals("New York")) {
	            option.click();
	            break;
	        }
	    }*/
	    
	    //color pic from color picker
	    /*
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("driver.getElementByid('EditorColorPicker1').value='#FFEEXX'");
	    */
	    driver.findElement(By.xpath("//input[@name='my-colors']")).sendKeys("#FFEEXX");
	    Thread.sleep(5000);
	    
		driver.close();
		/*
		WebElement link=chromeDriver.findElement(By.linkText("Return to index"));
		link.click();
		
		WebElement textbox=chromeDriver.findElement(By.xpath("text_input"));
		textbox.sendKeys("Hello");
		WebElement rich_text_box=chromeDriver.findElement(By.xpath("rich_text_box"));
		Thread.sleep(3000);
		rich_text_box.sendKeys("I am good boy");
		*/
		
	}

}
