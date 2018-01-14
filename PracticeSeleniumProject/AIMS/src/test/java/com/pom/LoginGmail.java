package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginGmail {

	WebDriver driver;
	
	private WebElement userName=driver.findElement(By.id("identifierId"));
	private WebElement password=driver.findElement(By.name("password"));
	private WebElement unNext=driver.findElement(By.id("identifierNext"));
	private WebElement pwNext=driver.findElement(By.id("passwordNext"));

	public LoginGmail(WebDriver driver) {
		this.driver = driver;
	}

	public void setGmailUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void setGmailPassword(String password) {
		this.password.sendKeys(password);	
	}
	
	public void clickOnUserNameNextButton() {
		unNext.click();
	}
	
	public void clickOnPasswordNextButton() {
		pwNext.click();
	}
}
