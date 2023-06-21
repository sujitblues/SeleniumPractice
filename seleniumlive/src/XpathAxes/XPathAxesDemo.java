package XpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathAxesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.webdriver", "C:\\Users\\sujit\\OneDrive\\Desktop\\seleniumsetup\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://money.rediff.com/gainers/bse/daily/grupa");
		Thread.sleep(3000);
		//self
		String Text=driver.findElement(By.xpath("//a[contains(text(),'Nivaka Fashion')]/self::a")).getText();
		System.out.println(Text);
		
		//parent
		Text=driver.findElement(By.xpath("//a[contains(text(),'Nivaka Fashion')]/parent::td")).getText();
		
		//Child
		//List<WebElement>list=(List<WebElement>) driver.findElement(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/child::td"));

		//System.out.println("length of list"+list.size());
		//Ancestor-Selects all ancestors(parent,grandparent,etc)
		Text=driver.findElement(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr")).getText();
	System.out.println(Text);
	
	//Decendant-Selects all descendants(Children,grandchildren,etc) of the current node
	List<WebElement>descendants=driver.findElements(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/descendant::*"));
	System.out.println("Number of descendant "+descendants.size());
	
	//Following-select everything in the doucment after the closing tag of the current node
	List<WebElement>followinNodes=driver.findElements(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/Following::*"));
	System.out.println("Number of follwing :"+followinNodes.size());
	
	//Following-sibiling:selects all siblings after the current node
	List<WebElement>followingSiblingNode=driver.findElements(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/Following-sibling::*"));
	System.out.println("Number of following sibling:"+followingSiblingNode.size());
	
	//preceding
	driver.findElements(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/preceding::*"));
	
	//preceding-sibling
	driver.findElements(By.xpath("//a[contains(text(),'Nivaka Fashion')]/ancestor::tr/preceding-sibling::*"));
	
	//preceding: Selects all nodes that apear before the current node in the document
	
	
	driver.close();
	driver.quit();
	}

}
