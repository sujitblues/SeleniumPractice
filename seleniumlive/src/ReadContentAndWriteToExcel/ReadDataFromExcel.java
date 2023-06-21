package ReadContentAndWriteToExcel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel {

	@Test(dataProvider = "pinCodeData")
    public void testPinCode(String pinCode) {
        // Initialize the WebDriver
		//WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
        
        // Navigate to a website that requires a PIN code
        driver.get("https://www.jiomart.com/p/electronics/samsung-galaxy-m13-5g-64-gb-4-gb-ram-midnight-blue-mobile-phone/597540052");
        
        // Enter the PIN code
        driver.findElement(By.id("prod_rel_pincode")).sendKeys(pinCode);
        
        // Submit the form
        driver.findElement(By.xpath("//div[@class='product-delivery-pincode-cta']")).click();
        
        // Close the WebDriver
        driver.quit();
    }
    
    @DataProvider(name = "pinCodeData")
    public Object[][] getPinCodeData() throws BiffException, IOException {
        // Specify the Excel file path
        File file = new File("C:\\Users\\sujit\\SeleniumTraining\\seleniumlive\\resource\\pincode.xlsx");
        
        // Load the Excel file
        Workbook workbook = Workbook.getWorkbook(file);
        
        // Select the worksheet
        Sheet sheet = workbook.getSheet("Sheet1");
        
        // Get the number of rows and columns in the worksheet
        int rows = sheet.getRows();
        int cols = sheet.getColumns();
        
        // Create a 2D array to store the data
        Object[][] data = new Object[rows][cols];
        
        // Iterate over the rows and columns to get the data
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sheet.getCell(j, i).getContents();
            }
        }
        
        // Close the workbook
        workbook.close();
        
        // Return the data
        return data;
    }
}

