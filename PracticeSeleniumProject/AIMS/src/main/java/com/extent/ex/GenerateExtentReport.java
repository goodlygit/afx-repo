package com.extent.ex;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReport {

	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {
		extent = new ExtentReports("D:\\Goodly\\PracticeSeleniumProject\\AIMS\\RM_report.html", true);
		extent.addSystemInfo("HostName", "Debidutta Pal").addSystemInfo("Environment", "QA").addSystemInfo("User Name",
				"pallldeb");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
		
		
	}

	@Test
	public void manageDepartment() {
		test = extent.startTest("Manage Department");
		
		test.log(LogStatus.PASS, "Department Cteated");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Department Modified");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Department Deleted");
		Assert.assertTrue(true);
	}

	@Test
	public void manageWorkGroup() {
		test = extent.startTest("Manage Work Group");
	
		test.log(LogStatus.PASS, "Create Work group");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS, "Modify Work group");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS, "Delete Work group");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName());
			//String screenshot_path=Utility.captureScreenshot(driver, result.getName());
			String image= test.addScreenCapture("C:\\AMPics\\DebiScreen.jpg");
			test.log(LogStatus.FAIL, "Title verification", image);
			test.log(LogStatus.FAIL, "Title verification", result.getThrowable());
			//test.log(LogStatus.SKIP, "Title verification", result.getName());			
			
		}
		extent.endTest(test);
	
	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}
}
