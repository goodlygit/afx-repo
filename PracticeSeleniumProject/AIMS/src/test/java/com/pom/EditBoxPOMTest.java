package com.pom;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditBoxPOMTest {
	
	final static Logger logger = Logger.getLogger(EditBoxPOMTest.class);
	
    @Test
	public void testGmail() throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\geckodriver-v0.18.0-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   // driver.get("http://www.gmail.com");
		   if(logger.isInfoEnabled()){
				logger.info("Hello");
			}
	    //LogInGmail lg=new LogInGmail(driver);POM
	    LogInGmailFact lg=new LogInGmailFact(driver);
	    
	    //By using id locater
	    //lg.clickOnUserNameNextButton();
	    driver.get("http://www.gmail.com");
	    lg.setGmailUserName("debidutta4@gmail.com");
	    //Thread.sleep(3000);	   
	    if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + "debidutta4@gmail.com");
		}
	    //By using name locater
	    lg.clickOnUserNameNextButton();
	    
	    //Thread.sleep(5000);
	    WebDriverWait wait=new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
	    lg.setGmailPassword("goodboy2011");
	    lg.clickOnPasswordNextButton();

	}

	

}
