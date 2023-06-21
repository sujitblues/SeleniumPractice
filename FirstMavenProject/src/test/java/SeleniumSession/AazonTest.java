package SeleniumSession;

public class AazonTest {
	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("Chrome");
		brUtil.launchURL("https://www.amazon.com");
		String actualTile=brUtil.getPageTitle();
		System.out.println("Page title: "+actualTile);
		Verify.equalValue(actualTile, "Amazon.com");
		/*
		 * if(actualTile.contains("Amazon.com")) { System.out.println("Pass---title"); }
		 * else { System.out.println("FAIL ---title"); }
		 */
		String actUrl=brUtil.getPageURL();
		System.out.println("page Url: "+actUrl);
		/*
		 * if(actUrl.contains("Amazon")) { System.out.println("Pass---title"); } else {
		 * System.out.println("FAIL ---title"); }
		 */
		Verify.containValue(actUrl, "amazon");
		brUtil.quitBrowser();
	}
	

}
