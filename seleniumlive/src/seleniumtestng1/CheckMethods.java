package seleniumtestng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckMethods {
	
	@BeforeTest
	void openurl()
	{
		System.out.println("open page");
	}
@Test
	void register()
	{
		System.out.println("Open Register");
	}
@Test(dependsOnMethods="register")
	void login()
	{
		System.out.println("login page");
	}

@AfterTest
	void close()
	{
		System.out.println("close page");
	}
	
	
}
