package com.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLogin {
	WebDriver driver;

	public YahooLogin(WebDriver driver1) {
		driver = driver1;
		
	}

	public void openYahooPage() {
		driver.get("https://in.yahoo.com/");
		
	}
	
	public void ClickSigninButton() {
		driver.findElement(By.id("uh-signin")).click();
	}
	
	public void ClickSignUp() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"createacc\"]")).click();
	}

	public void setFirstname(String firstName) {
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
	}

	public void setLastname(String lastName) {
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
	}

	public void setEmailAdrs(String emailAd) {
		driver.findElement(By.name("yid")).sendKeys(emailAd);
		driver.findElement(By.className("yid-domain")).click();
	}
	
	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	/*public void setPhoneNumber(int phnNum) {
		driver.findElement(By.name("phone")).sendKeys(phnNum);
	}*/
}


