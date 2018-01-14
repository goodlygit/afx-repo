package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInGmailFact {
WebDriver driver;
	@FindBy(id="identifierId")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="identifierNext")
	WebElement unNext;
	
	@FindBy(id="passwordNext")
	WebElement pwNext;

	public LogInGmailFact(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
