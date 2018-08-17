package com.gucci.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gucci.qa.base.TestBase;
import com.gucci.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		hp = new HomePage();
	}
	
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gucci Official Site – Redefining modern luxury fashion.");
	}
	
	@Test(priority=2)
	public void logoTest() {
		String logo = hp.validateLogo();
		Assert.assertEquals(logo, "Gucci");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
