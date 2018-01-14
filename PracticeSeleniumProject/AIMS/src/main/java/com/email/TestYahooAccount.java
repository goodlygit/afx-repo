package com.email;

import org.testng.annotations.Test;

import com.base.webdriver.BaseDriver;
import com.factory.YahooLogin;
import com.relevantcodes.extentreports.LogStatus;
import com.report.base.ExtentTestManager;

public class TestYahooAccount extends BaseDriver {
	
	@Test
	public void testYahooLogin() throws InterruptedException {
	
		YahooLogin obj = new YahooLogin(driver);
		obj.openYahooPage();
		obj.ClickSigninButton();
		obj.ClickSignUp();
		obj.setFirstname("Sadhana");
		obj.setLastname("Acharya");
		obj.setEmailAdrs("acharya.sadhana06");
		obj.setPassword("Goodlypal@yahoo15");
		//obj.setPhoneNumber(702802050);
		/*obj.setUsername("");
		obj.clickUserNameNext();
		obj.setPassword("");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Yahoo Reg Created");*/
}

}