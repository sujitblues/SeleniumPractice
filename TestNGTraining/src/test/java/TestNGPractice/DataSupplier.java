package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplier {
	
	@DataProvider
	public String[] dp1()
	{
		String[] data =new String[]
				{
					"Sujit",
					"Amol",
					"Neeraj",
					"Aashish"
				};
		return data;
	
	}
	@DataProvider
	public String[] dp2()
	{
		String[] data =new String[]
				{
					"Mohit",
					"Rohan",
					"Sohan",
					"Raghav"
				};
		return data;
	
	}
	
}
