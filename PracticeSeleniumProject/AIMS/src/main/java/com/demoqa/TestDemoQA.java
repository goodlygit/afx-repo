package com.demoqa;

import org.testng.annotations.Test;

import com.base.webdriver.BaseDriver;
import com.relevantcodes.extentreports.LogStatus;
import com.report.base.ExtentTestManager;

public class TestDemoQA extends BaseDriver{
	
	@Test
	public void testDemoQARegn() throws InterruptedException {
		RegistrationPage obj = new RegistrationPage(driver);
		obj.openDemoQApage();
		obj.clickRegistrationButton();
		obj.setFirstName("Sadhana2");
		obj.setLastName("Acharya2");
		obj.clickMaritalStatus();
		obj.clickHobby();
		obj.selectCountry();
		obj.selectDOBmonth();
		//Thread.sleep(2000);
		obj.selectDOBday();
		//Thread.sleep(2000);
		obj.selectDOByear();
		obj.setPhoneNum("7028020606");
		obj.setUsername("acharya2.sadhana");
		obj.setEmail("acharya.sadhana102@gmail.com");
		obj.setAboutYourself("I am a perfect version of myself.");
		obj.setPassword("Goodly@DemoQa15");
		obj.setConfirmPassword("Goodly@DemoQa15");
		obj.clickSubmitButton();
		Thread.sleep(5000);
		obj.verifyRegn();
	}
}
