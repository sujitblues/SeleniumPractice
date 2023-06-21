package seleniumday8;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshotfrompage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//Change screen size
		Dimension d =new Dimension(400,650);
		driver.manage().window().setSize(d);
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File f =screenshot.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(f, new File("C:\\Users\\sujit\\OneDrive\\Desktop\\takescreenshot\\image1.png"));
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			   js.executeScript("scroll(0,4500);");
			   driver.close();
	
	}
	

}
