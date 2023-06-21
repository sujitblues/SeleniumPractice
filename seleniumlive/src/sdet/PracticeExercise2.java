package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise2 {

	public static void main(String[] args) {
		/*Exercise 2
		 * Launch a new browser
		 * Open website http://demowebshop.tricentis.com
		 * click on the Register link
		 * Come back to the Home page (use the 'Back' command)
		 * Again go back to the Registration page(This time use the 'Forward command)
		 * Again come back to the Home page(This time use the 'To' command
		 * Close the Browser
		 * 
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText(null));

	}

}
