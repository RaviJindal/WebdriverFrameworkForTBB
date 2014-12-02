package com.seleniumtests.cucumbertest.java;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.seleniumtests.core.CustomVerification;
import com.seleniumtests.dataobject.BBRegistrationDataFree;
import com.seleniumtests.pageobject.FreeSignupPage;
import com.seleniumtests.pageobject.Home;
import com.seleniumtests.pageobject.SignUp;
import com.seleniumtests.pageobject.Welcome;
import com.seleniumtests.utility.HighLight;
import com.seleniumtests.utility.Log;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeRegSteps {

	RunCukeBase df= new RunCukeBase();
 	BBRegistrationDataFree registrationData;
 	
 	@Given("^I want to open the browser for free signup$")
 	public void i_want_to_open_the_browser_for_free_signup() throws Throwable {
 		df.createDriver();
 	}

 	@Given("^I visit the https://tbbqabeta\\.productpartners\\.com url for free signup$")
 	public void i_visit_the_https_tbbqabeta_productpartners_com_url_for_free_signup() throws Throwable {
 	    df.OpenURL("https://tbbqabeta.productpartners.com");
		if(df.driver.getTitle().contains("certificate") || df.driver.getTitle().contains("Certificate"))
		df.driver.navigate().to("javascript:document.getElementById('overridelink').click()") ;
		Log.info("URL accessed");
		Home newHome = PageFactory.initElements(df.driver,
				Home.class);
 	}

 	@Given("^I visit to the Signup Page for free signup$")
 	public void i_visit_to_the_Signup_Page_for_free_signup() throws Throwable {
		Home newHome = PageFactory.initElements(df.driver,
				Home.class);
		newHome.clickNotAMember();
		SignUp newSignUp = PageFactory.initElements(df.driver,
				SignUp.class);
 	}

 	@When("^I click on the free signup$")
 	public void i_click_on_the_free_signup() throws Throwable {
		SignUp newSignUp = PageFactory.initElements(df.driver,
				SignUp.class);
		newSignUp.clickFreeSignup();
		FreeSignupPage registration = PageFactory.initElements(df.driver,
				FreeSignupPage.class);
 	}

 	@Then("^i do submit with valid form entry for free signup$")
 	public void i_do_submit_with_valid_form_entry_for_free_signup(DataTable users) throws Throwable {
		FreeSignupPage registration = PageFactory.initElements(df.driver,
				FreeSignupPage.class);
		List<List<String>> cukedata = users.raw();
		int cukesize = cukedata.size();
		for (int i=1 ;i<cukesize; i++){
		registration.createNewUserCukes(users, i);
		//Log.info("");
		registration.clickSubmit();
		Welcome welcome = PageFactory.initElements(df.driver,	Welcome.class);}
 	}

 	@Then("^i get free signup welcome page$")
 	public void i_get_free_signup_welcome_page() throws Throwable {
 		Welcome welcome = PageFactory.initElements(df.driver,	Welcome.class);
		
		CustomVerification customVerification = new CustomVerification();
		customVerification.verifyTrue("Not Created Successfully", welcome.WelcomeFree());
		
		customVerification.checkForVerificationErrors();
 	}

 	@Then("^i do submit with Invalid form entry for free signup$")
 	public void i_do_submit_with_Invalid_form_entry_for_free_signup(DataTable users) throws Throwable {
		FreeSignupPage registration = PageFactory.initElements(df.driver,
				FreeSignupPage.class);
		List<List<String>> cukedata = users.raw();
		int cukesize = cukedata.size();
		for (int i=1 ;i<cukesize; i++){
		registration.createNewUserCukes(users, i);
		//Log.info("");
		registration.clickInvalid();}
 	}

 	@Then("^i get free signup error page$")
 	public void i_get_free_signup_error_page() throws Throwable {
 		CustomVerification customVerification = new CustomVerification();
		try{
		WebElement errors = df.driver.findElement(By.className("portlet-msg-error"));
		
		HighLight.highlightElement(errors, df.driver);
		String err = errors.getText();				
				
		customVerification.verifyTrue("Not Duplicate User", err.contains("You already have an account"));
		
		if (err.contains("Please enter a valid") || err.contains("Please select a valid"))
		customVerification.verifyFalse("Invalid Entry for New User",true);
		
		if (err.contains("Please enter your") || err.contains("Please confirm your") || err.contains("Please enter the cardholder's") || err.contains("Please enter a Screen Name") || err.contains("Please agree to the terms"))
		customVerification.verifyFalse("Blank Entry for New user", true);
		
		customVerification.verifyFalse("Invalid Captcha", err.contains("Text Verification failed"));
		}catch(Exception e){
			e.printStackTrace();
			};		
		//customVerification.verifyTrue("New User Not Created Successfully", welcome.WelcomeClub());
		Welcome welcome = PageFactory.initElements(df.driver,	Welcome.class);
		customVerification.verifyFalse("New User Created", welcome.WelcomeClub());
		
		customVerification.checkForVerificationErrors();
 	}
}
