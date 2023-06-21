package SeleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;
	/**
	 * This method is initialize the driver on the basis of given browser
	 * Possible browser are chrome,firefox,safari,edge
	 * @param browserName
	 */
	public WebDriver initDriver(String browserName)
	{
		System.out.println("launching the browser:"+browserName);
		if(browserName==null)
		{
			System.out.println("URL can not be null");
			throw new MySeleniumException("URLBLANKEXCEPTION");
		}
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("Please pass the right browser name");
				throw new MySeleniumException("WRONGBROWSEREXCEPTION");
				
		}
		return driver;
	}
	/**
	 * This method is used to launch the application url
	 * @param url
	 */
public void launchURL(String url)
{
	if(url==null)
	{
		System.out.println("URL can not be null");
		throw new MySeleniumException("URLBLANKEXCEPTION");
	}
	if(url.contains("http"))
	{
		driver.get(url);
	}
	else
	{
		System.out.println("http(s) is missing");
	}
	
}
public void launchURL(URL url)
{
	if(url==null)
	{
		System.out.println("URL can not be null");
		throw new MySeleniumException("URLBLANKEXCEPTION");
	}
	String mainUrl=String.valueOf(url);
	if(mainUrl.contains("http"))
	{
		driver.navigate().to(url);
	}
	else
	{
		System.out.println("http(s) is missing");
	}
	
	
}
public String getPageTitle()
{
	return driver.getTitle();
}
public String getPageURL()
{
	return driver.getCurrentUrl();
}
public void quitBrowser()
{
	driver.quit();
}
public void closeBrowser()
{
	driver.close();
}
}
