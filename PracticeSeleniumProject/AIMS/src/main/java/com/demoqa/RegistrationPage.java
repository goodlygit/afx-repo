package com.demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver1) {
		driver = driver1;
	}

	public void openDemoQApage() {
		driver.get("http://demoqa.com/");
	}

	public void clickRegistrationButton() {
		driver.findElement(By.id("menu-item-374")).click();
	}

	public void setFirstName(String firstName) {
		driver.findElement(By.name("first_name")).sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		driver.findElement(By.name("last_name")).sendKeys(lastName);
	}

	public void clickMaritalStatus() {
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[2]")).click();
	}

	public void clickHobby() {
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[1]")).click();
	}

	public void selectCountry() {
		WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"dropdown_7\"]"));
		Select dropDownSelect1 = new Select(webElement1);
		List<WebElement> webElementList1 = dropDownSelect1.getAllSelectedOptions();
		dropDownSelect1.selectByValue("India");
	}

	public void selectDOBmonth() {
		WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"mm_date_8\"]"));
		Select dropDownSelect2 = new Select(webElement2);
		List<WebElement> webElementList2 = dropDownSelect2.getAllSelectedOptions();
		dropDownSelect2.selectByValue("11");
	}

	public void selectDOBday() {
		WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"dd_date_8\"]"));
		Select dropDownSelect3 = new Select(webElement3);
		List<WebElement> webElementList3 = dropDownSelect3.getAllSelectedOptions();
		dropDownSelect3.selectByValue("6");
	}

	public void selectDOByear() {
		WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"yy_date_8\"]"));
		Select dropDownSelect4 = new Select(webElement4);
		List<WebElement> webElementList4 = dropDownSelect4.getAllSelectedOptions();
		dropDownSelect4.selectByValue("1993");
	}

	public void setPhoneNum(String PhnNum) {
		driver.findElement(By.xpath("//*[@id=\"phone_9\"]")).sendKeys(PhnNum);
	}

	public void setUsername(String userName) {
		driver.findElement(By.name("username")).sendKeys(userName);
	}

	public void setEmail(String emailId) {
		driver.findElement(By.name("e_mail")).sendKeys(emailId);
	}

	public void setAboutYourself(String abtyourself) {
		driver.findElement(By.name("description")).sendKeys(abtyourself);
	}

	public void setPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	public void setConfirmPassword(String confirmPwd) {
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(confirmPwd);
	}

	public void clickSubmitButton() {
		driver.findElement(By.name("pie_submit")).click();
	}

	public void verifyRegn() {
		try {
			String regnVal = driver.findElement(By.className("piereg_message")).getText();
			Assert.assertEquals(regnVal, "Thank you for your registration", "Registration Successful");
		} catch (NoSuchElementException e) {
			throw new AssertionError(driver.findElement(By.className("piereg_login_error")).getText());

		}

	}
}