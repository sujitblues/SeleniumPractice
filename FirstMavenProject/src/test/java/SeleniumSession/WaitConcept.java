package SeleniumSession;

public class WaitConcept {

	public static void main(String[] args) {
		//wait types:
		//1.static wait :Thread.sleep(10000)-wait for 10 sec
		//if element not found even after 10 sec then -No such exception occurred
//2.Dynamic wait:total time out =10 sec-->found 2 secod
		//rest of 8 sec will be ignored/cancelled
	
		//2.a:Implicitly wait
		//2.b:explicit wait
				//i.WebDriverWait
				//ii.FluentWait
		//WebDriverWait(c)-extends-->FluentWait---Implements-->Wait(I)
		//no public methods
		//+inherit fluentwait class methods
	
	}

}
