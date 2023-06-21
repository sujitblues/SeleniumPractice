package seleniumtestng1;

import org.testng.annotations.Test;

public class openpage {
	//@Test(priority=1 ,enabled=false)
	//@Test(priority=1 ,enabled=true)
	//@Test(priority=1, alwaysRun=false)
	@Test(priority=1, description="open my web page")
	void openurl()
	{
		System.out.println("openpage");
	}
	@Test(priority=2)
	void registration()
	{
		System.out.println("Registration");
	}
	@Test(priority=4)
	void closepage()
	{
		System.out.println("closepage");
	}
	@Test(priority=3, alwaysRun=true)
	void loginpage()
	{
		System.out.println("loginpage");
	}
	

}
