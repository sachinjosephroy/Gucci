package com.gucci.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gucci.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//a[@class = 'tab-logo']")
	WebElement logo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLogo() {
		String logoTxt = logo.getText();
		return logoTxt;
	}
	
}
