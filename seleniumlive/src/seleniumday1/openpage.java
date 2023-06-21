package seleniumday1;

import org.openqa.selenium.chrome.ChromeDriver;

public class openpage {
	static String url="https://www.selenium.dev/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(5000);
		//open the url
		//driver.get("url");
		//another option to open the url
		driver.navigate().to(url);
		Thread.sleep(5000);
		//go back
		driver.navigate().back();
		//page refresh
		driver.navigate().refresh();
		//page forward
		//.driver.navigate().forward();
		//maximise the page
		driver.manage().window().maximize();
		
		driver.close();
		

	}

}
