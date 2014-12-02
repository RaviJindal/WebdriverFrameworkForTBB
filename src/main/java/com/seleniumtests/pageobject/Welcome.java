package com.seleniumtests.pageobject;

//import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Welcome {
	private WebDriver driver;
	
	public Welcome(WebDriver driver) {
		this.driver = driver;
	}
	
	@CacheLookup
	@FindBy(className = "title")
	WebElement Title;
	
	@CacheLookup
	@FindBy(className = "portlet-msg-error")
	WebElement errors;


	public boolean WelcomeFree() {
		boolean b1 = Title.getText().contains("Welcome Free Member!");
		return b1;
	}
	
	public boolean WelcomeClub() {
		boolean b2 = Title.getText().contains("You are a Club Member!");
		return b2;	
	}
}
