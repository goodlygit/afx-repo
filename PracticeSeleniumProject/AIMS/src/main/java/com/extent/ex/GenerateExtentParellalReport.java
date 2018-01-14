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
import com.report.base.BaseClass;
import com.report.base.ExtentTestManager;

public class GenerateExtentParellalReport extends BaseClass{

	@Test
	public void manageDepartment() {
		//ExtentTestManager.startTest("manageDepartment");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Department Cteated");
		Assert.assertTrue(true);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Department Modified");
		Assert.assertTrue(true);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Department Deleted");
		Assert.assertTrue(true);
	}

	@Test
	public void manageWorkGroup() {
		//ExtentTestManager.startTest("manageWorkGroup");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Create Work group");
		Assert.assertTrue(false);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Modify Work group");
		Assert.assertTrue(false);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Delete Work group");
		Assert.assertTrue(false);
	}
	
}
