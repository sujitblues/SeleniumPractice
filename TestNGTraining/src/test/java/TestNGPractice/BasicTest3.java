package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {
	//@DataProvider(indices= {0,2})
	
	@Test(dataProvider="dp1" ,dataProviderClass =DataSupplier.class)
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
		
}
