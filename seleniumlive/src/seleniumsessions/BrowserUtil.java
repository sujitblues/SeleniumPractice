package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;
	public void initDriver(String browserName)
	{
		System.out.println("launching the browser:"+browserName);
		if(browserName==null)
		{
			System.out.println("URL can not be null");
		throw new myseleniumExeption("URLBLANK");
		}
		
		switch(browserName.toLowerCase().trim())//switchcase can not accetp boolean value
	{
	case "chrome":
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
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
			System.out.println("Please pass the right browser name"+browserName);
			throw new myseleniumExeption("WRONGBROWSEREXCEPTION");
			//break;
	
	
	}
	
	
		}
	//wrapper method
	public void launchURL(String url)
	{
		if(url==null)
		{
			System.out.println("URL can not be null");
		throw new myseleniumExeption("URLBLANK");
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
