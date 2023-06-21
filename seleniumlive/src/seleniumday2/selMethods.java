package seleniumday2;

import org.openqa.selenium.chrome.ChromeDriver;

public class selMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver chromeDriver=new ChromeDriver();
		//open url
		chromeDriver.get("https://www.selenium.dev/selenium/web/web-form.html");
		Thread.sleep(3000);
		//get current page url
		String geturl=chromeDriver.getCurrentUrl();
		System.out.println(geturl);
		//get html code 
		String getsource=chromeDriver.getPageSource();
		System.out.println(getsource);
		
		//get current page title name
		String gettitlename=chromeDriver.getTitle();
		System.out.println(gettitlename);
		System.out.println();
		
		

	}

}
