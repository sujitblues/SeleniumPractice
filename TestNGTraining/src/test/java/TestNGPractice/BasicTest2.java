package TestNGPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest2 {
	//String array example
	/*
	@Test(dataProvider="dp1")
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
	@DataProvider
	public String[] dp1()
	{
		String[] data =new String[]
				{
					"abcd",
					"xyx",
					"pqr"
				};
		return data;
	
	}
	*/
	//int array example
	/*
		@Test(dataProvider="dp1")
		public void TestLogin(Integer i)
		{
			System.out.println(i);
		}
		@DataProvider
		public Integer[] dp1()
		{
			Integer[] data =new Integer[]
					{
						1,
						2,
						3
					};
			return data;
		
		}
		*/
	//object array example
	/*
		@Test(dataProvider="dp1")
		public void TestLogin(Object obj)
		{
			System.out.println(obj);
		}
		@DataProvider
		public Object[] dp1()
		{
			Object[] data =new Object[]
					{
						1,
						"Hello",
						3
					};
			return data;
		
		}
		*/
		//String two-dimentional array example
		/*
		@Test(dataProvider="dp1")
		public void TestLogin(String username,String password)
		{
			System.out.println(username +":"+password);
		}
		@DataProvider
		public Object[] dp1()
		{
			String[][] data =new String[][]
					{
				{"hyr","123"},
				{"pqr","456"},
				{"xyz","789"}
				};
			return data;
		
		}
		*/
		//String jagged array example
		/*
		@Test(dataProvider="dp1")
		public void TestLogin(String s[])
		{
			for(int i=0;i<s.length;i++)
			{
				
			}
		}
		@DataProvider
		public String[][] dp1()
		{
			String[][] data =new String[][]
					{
				{"hyr","123","567","456"},
				{"pqr","456"},
				{"xyz","789","456"}
				};
			return data;
		
		}
		*/
	//String jagged object example
			/*
			@Test(dataProvider="dp1")
			public void TestLogin(Object s[])
			{
				for(int i=0;i<s.length;i++)
				{
					System.out.println(s[i]);
				}
			}
			@DataProvider
			public Object[][] dp1()
			{
				Object[][] data =new Object[][]
						{
					{"hyr",123,"567","456"},
					{"pqr",456},
					{"xyz",789,"456"}
					};
				return data;
			
			}
			*/
			
	//Iterator example
	/*
	@Test(dataProvider="dp1")
	public void TestLogin(String s)
	{
		System.out.println(s);
	}
	@DataProvider
	public Iterator<String> dp1()
	{
		List<String> data =new ArrayList();
		data.add("sujit");
		data.add("Amol");
		data.add("Manish");
			
		return data.iterator();
	
	}
	
	*/
	//Iterator example with set
	/*	
		@Test(dataProvider="dp1")
		public void TestLogin(String s)
		{
			System.out.println(s);
		}
		@DataProvider
		public Iterator<String> dp1()
		{
			Set<String> data =new HashSet();
			data.add("sujit");
			data.add("Amol");
			data.add("Manish");
				
			return data.iterator();
		
		}
		*/
	//Iterator example with set string array
	/*
			@Test(dataProvider="dp1")
			public void TestLogin(String s[])
			{
				System.out.println(s[0]+ ">>"+s[1]);
			}
			@DataProvider
			public Iterator<String[]> dp1()
			{
				Set<String[]> data =new HashSet<String[]>();
				data.add(new String[] {"sujit","Kumar"});
				data.add(new String[] {"Amol","Kaushik"});
				data.add(new String[] {"Neeraj","Rana"});
					
				return data.iterator();
			
			}
		
		*/
	//Iterator example with set object array
	
	@Test(dataProvider="dp1")
	public void TestLogin(Object s[])
	{
		System.out.println(s[0]+ ">>"+s[1]);
	}
	@DataProvider
	public Iterator<Object[]> dp1()
	{
		Set<Object[]> data =new HashSet<Object[]>();
		data.add(new Object[] {"sujit",123});
		data.add(new Object[] {987,"Kaushik"});
		data.add(new Object[] {"Neeraj",234});
			
		return data.iterator();
	
	}
		
		
		
}
