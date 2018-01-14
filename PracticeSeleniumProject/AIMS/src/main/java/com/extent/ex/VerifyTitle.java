package com.extent.ex;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;*/



public class VerifyTitle {
	
	/*ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;

	@Test
	public void testTitle() {
		report=new ExtentReports("C:\\AMPics\\LearnAutomation.html",true);
		System.setProperty("webdriver.chrome.driver", "C:\\goodly\\softwares\\chromedriver_win32\\chromedriver.exe");
		logger=report.startTest("VerifyBlogTitle");
		 
		driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		logger.log(LogStatus.INFO, "Browser started ");
		 
		driver.get("http://www.learn-automation.com");
		 
		logger.log(LogStatus.INFO, "Application is up and running");
		 
		String title=driver.getTitle();
		 
		Assert.assertTrue(title.contains("Google")); 
		 
		logger.log(LogStatus.PASS, "Title verified");
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	 
	//String screenshot_path=Utility.captureScreenshot(driver, result.getName());
	String image= logger.addScreenCapture("C:\\AMPics\\DebiScreen.jpg");
	logger.log(LogStatus.FAIL, "Title verification", image);
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
//driver.get("C:\\Report\\LearnAutomation.html");
	}*/
	 
}
