package com.testgmail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGmail {

	@BeforeClass
	public void logIn() {
		System.out.println("Login successful");
	}
    @Test(priority=1)
	public void addVendor() {
		System.out.println("add vendor successful");
	}
    @Test(priority=2)
	public void addProduct() {
		System.out.println("add product successful");
	}
    @Test(priority=3)
	public void addCurrency() {
		System.out.println("add currency successful");
	}
	
}
