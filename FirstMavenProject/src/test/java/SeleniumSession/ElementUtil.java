package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
public void doSendKyes(By locator,String value)
{
	getElement(locator).sendKeys(value);
}
public void doClick(By locator)
{
	getElement(locator).click();
}
public WebElement getElement(By locator)
{
	return driver.findElement(locator);
}
	
	//****Drop Down utils
public void doSelectDropDownByIndex(By locator,int index)
{
	Select select=new Select(getElement(locator));
	select.selectByIndex(index);
}
public void doSelectDropDownByVisibleText(By locator,String text)
{
	Select select=new Select(getElement(locator));
	select.selectByVisibleText(text);
}
public void doSelectDropDownByValueAttribute(By locator,String value)
{
	Select select=new Select(getElement(locator));
	select.selectByValue(value);
}
public  int getDropDownValueCount(By locator)
{
	return getAllDropDownOptions(locator).size();
}
public  List<String> getAllDropDownOptions(By locator)
{
	Select select=new Select(getElement(locator));
	List<WebElement>optionsList=select.getOptions();
	List<String>optionsValueList=new ArrayList<String>();
	System.out.println("total values :" +optionsList.size());
	
	for(WebElement e:optionsList) {
		String text=e.getText();
		System.out.println(text);
		optionsValueList.add(text);
	}
	return optionsValueList;
}
public  boolean doSelectDropDownValue(By locator,String dropDownValue)
{
	boolean flag=false;
	Select select=new Select(getElement(locator));
	List<WebElement>optionsList=select.getOptions();
	System.out.println("total values :" +optionsList.size());
	
	for(WebElement e:optionsList) {
		String text=e.getText();
		
		if(text.equals(dropDownValue))
		{
			flag=true;
			e.click();
			break;
		}
		
	}
	if(flag==false)
	{
		System.out.println(dropDownValue+ "is not present in the drop down"+locator);
	
	}
	return flag;
	
}
public  boolean DoSelectValueFromDropDownWithoutSelect(By locator,String value)
{
	boolean flag=false;
	List<WebElement> optionsList=driver.findElements(locator);
			for(WebElement e:optionsList) {
				String text=e.getText();
				if(text.equals(value))
				{
					flag=true;
					e.click();
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(value+ "is not present in the drop down"+locator);
			
			}
			return flag;
}

}
