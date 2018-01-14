package com.report.seq.base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseExample {
	   public ExtentReports extent;
	   public ExtentTest test;
	    
	    final String filePath = "RM_report.html";

	    @AfterMethod
	    public void afterMethod(ITestResult result) {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            test.log(LogStatus.FAIL, result.getThrowable());
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	        } else {
	            test.log(LogStatus.PASS, "Test passed");
	        }
	        
	        extent.endTest(test);        
	        extent.flush();
	    }
	    
	    @BeforeTest
	    public void beforeSuite() {
	        extent = ExtentManager.getReporter(filePath);
	    }
	    
	    @AfterTest
	    protected void afterSuite() {
	        extent.close();
	    }
}
