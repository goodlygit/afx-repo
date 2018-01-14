package com.goodly.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGmail {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\geckodriver-v0.18.0-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		GmailLoginObjRepo obj=new GmailLoginObjRepo(driver);
		
	}
}
