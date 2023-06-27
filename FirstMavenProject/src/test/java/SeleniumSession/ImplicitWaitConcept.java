package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// sel 4.x
		
	//implicit wait:global wait
		//applicable for all the web elements
		//not applied to the specific element
		//can not be used to non web elements:titile ,url,alerts
		
		//home page:10 secs
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mackbook");
		String label=driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");
		System.out.println(label);
		//e3--10 sec 
		//e4---search page--10 sec
		//e5---10 sec
		//e6--10 sec
		
		//Product page :20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e7 e8 e9--->20 secs
		
		//Home page :20 secs-->10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register page :10 secs-->5 sec
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		//Product page :20 secs
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	
				//We never use imp wait in framework
				
				//page-->no wait ==0sec:--nullify of implicit wiat
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}

}
