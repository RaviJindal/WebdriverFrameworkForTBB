package com.seleniumtests.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.seleniumtests.utility.HighLight;


public class Home {

	private WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	@CacheLookup
	@FindBy(linkText = "Not a Member?")
	WebElement notAMember;
	
	public SignUp clickNotAMember() {
		try {
			HighLight.highlightElement(notAMember, driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		notAMember.click();
		return PageFactory.initElements(driver, SignUp.class);
	}
}
