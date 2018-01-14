package com.email;


import org.testng.annotations.Test;

import com.base.webdriver.BaseDriver;
import com.factory.GmailLogin;
import com.relevantcodes.extentreports.LogStatus;
import com.report.base.ExtentTestManager;

public class TestGmailAcccount extends BaseDriver{
	
	@Test
	public void testGmailLogin() {
	
		GmailLogin obj = new GmailLogin(driver);
		obj.openGmailPage();
		obj.setUsername("debidutta4@gmail.com");
		obj.clickUserNameNext();
		//obj.setPassword("goodboy2011");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Department Created");

	}
}
