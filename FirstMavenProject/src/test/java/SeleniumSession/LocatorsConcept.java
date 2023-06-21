package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//1.id:unique attribute
		
//2.name:Not unique attribute
		/*
		 * driver.findElement(By.name("firstname")).sendKeys("sujit");
		 * driver.findElement(By.name("lastname")).sendKeys("Kumar");
		 * driver.findElement(By.name("agree")).click();
		 */


		/*
		 * By fn=By.name("firstname"); By check=By.name("agree");
		 * 
		 * ElementUtil eleUtil=new ElementUtil(driver); eleUtil.doSendKyes(fn, "sujit");
		 * eleUtil.doClick(check);
		 */
 
//3.class name :not unique attribute
	//	driver.findElement(By.className("form-control")).sendKeys("sujit");
		
	//4.xpath :it's not an attribute .it's address of the element in HTML DOM
		//can be unique/can be duplicate
	/*
	 * driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sujit"
	 * );
	 * driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("kumar")
	 * ; driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).
	 * click();
	 * 
	 * //5.CSS :It's not an attribute
	 * driver.findElement(By.cssSelector("#input-firstname")).sendKeys("sujit");
	 * driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Kumar");
	 * driver.findElement(By.
	 * cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
	 */
	
//6.linkText :only for links
		//can be duplicate
		//can be blank
		
		  driver.findElement(By.linkText("Login")).click();
		  //driver.findElement(By.linkText("Forgotten Password")).click();
		 
		
		//7.Partial linktext
		//driver.findElement(By.linkText("Forgotten")).click();
		
		//8.Tag Name: 
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		if(header.equals("New Customer"))
		{
			System.out.println("PASS");
		}
		
		
		/*
		 * public static String doGetElementText(By locator) { return
		 * getElement(locator) }
		 */
	}

}
