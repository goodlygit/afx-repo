package com.base.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.report.base.BaseClass;

public class BaseDriver extends BaseClass{

	public WebDriver driver;

	boolean fireFoxBrower = false;
	boolean chromeBrowser = true;
	boolean ieBrowser = false;

	@BeforeTest
	public void loadBrowserDriver() {
		if (fireFoxBrower) {
			loadFirefoxDriver();
		} else if (chromeBrowser) {
			loadChromeDriver();
		} else if (ieBrowser) {
			loadInternetExplorerDriver();
		}

	}

	public void loadFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public void loadChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\geckodriver-v0.18.0-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void loadInternetExplorerDriver() {
		driver = new InternetExplorerDriver();
	}

}
