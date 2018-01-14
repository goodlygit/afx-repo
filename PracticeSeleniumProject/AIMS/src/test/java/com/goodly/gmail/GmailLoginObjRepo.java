package com.goodly.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginObjRepo {
		
    WebDriver driver;

	public GmailLoginObjRepo(WebDriver driver1) {
		driver=driver1;
	}

	public void openGmailPage() {
		driver.get("http://www.gmail.com");
	}
	
	public void setUsername(String userName) {
		driver.findElement(By.id("identifierId")).sendKeys(userName);
	}
	
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public void clickUserNameNext() {
		driver.findElement(By.name("identifierNext")).click();
	}
	
}
