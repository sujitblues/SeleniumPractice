package extentReportPractice;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterPractice1 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();
		File file =new File("target/report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.createTest("MyFirstTest")
		  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extentReports.createTest("SeconTest")
		  .log(Status.FAIL, "This is a logging event for SeconTest, and it Fail!");
		extentReports.createTest("Third")
		  .log(Status.SKIP, "This is a logging event for Third, and it skip!");
		extentReports.flush();
		Desktop.getDesktop().browse(new File("target/report.html").toURI());

	}

}
