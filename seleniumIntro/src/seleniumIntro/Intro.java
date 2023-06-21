package seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//invoking browser
				//chrome -chromeDriver->methods
				//Firfox -firefoxDriver->methods
				//webDriver methods+class methods
				//ChromeDriver driver=new ChromeDriver();
				
				//chromedriver.exe->chrome browser
						//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujit\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//webdriver.chrome.driver->value of path
						
						//seleniumManager
				/*
						WebDriver driver=new ChromeDriver();
						driver.get("https://rahulshettyacademy.com/");
						System.out.println(driver.getTitle());
						System.out.println(driver.getCurrentUrl());
						//Close the current window, quitting the browser if it's the last window currently open. 
						driver.close();
						*/
						//Quits this driver, closing every associated window.
						//driver.quit();
						
						//Firefox launch
						//geckodriver
						WebDriver driver=new FirefoxDriver();
						System.setProperty("webdriver.gecko.driver", "C:\\Users\\sujit\\Downloads\\chromedriver_win32\\geckodriver.exe");
						driver.get("https://rahulshettyacademy.com/");
						System.out.println(driver.getTitle());
						System.out.println(driver.getCurrentUrl());
						driver.close();
						
						//Edge launch
						WebDriver driver3=new EdgeDriver();
						System.setProperty("webdriver.edge.driver", "C:\\Users\\sujit\\Downloads\\chromedriver_win32\\msedgedriver.exe");
						driver3.get("https://rahulshettyacademy.com/");
						System.out.println(driver.getTitle());
						System.out.println(driver.getCurrentUrl());
						driver3.close();
						
			}

		


	}


