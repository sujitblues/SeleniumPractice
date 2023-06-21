 package sdet;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticeExercise1 {

	public static void main(String[] args) {
		/*Exercise 1
		 * Launch a new chrome browser
		 * open website "http://demowebshop.tricentis.com/"
		 * get page title name and title length
		 * Print page title and title length on the eclipse console.
		 * get page URL and verify if the it is a correct page opend
		 * get page source(HTML source code) and page source length
		 * print page source length on eclipse console
		 * close the browser
		*/
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		String title=driver.getTitle();
		System.out.println("Title of Web"+" :"+title);
		System.out.println("Length of title"+": "+title.length());
		String Expectedurl="https://demowebshop.tricentis.com";
		String Expecttilte="Web Shop Demo";
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase(Expectedurl) && title.equalsIgnoreCase(Expecttilte))
		{
			System.out.println("PASSED : Verified Expected and Current Url Matched");
		}
		else
		{
			System.out.println("Failed : Expected and Current Url not Matched");
		}
			
	//String pagesource=driver.getPageSource();
	//System.out.println(pagesource);
	//System.out.println("Length of source page"+pagesource.length());
	driver.close();
	
		
		

	}

}
