package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("opera");
		brUtil.launchURL("http://www.amazon.com");
		

	}

}
