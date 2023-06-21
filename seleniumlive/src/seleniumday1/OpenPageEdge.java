package seleniumday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenPageEdge {
	static String url ="https://www.facebook.com/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		driver.close();

	}

}
