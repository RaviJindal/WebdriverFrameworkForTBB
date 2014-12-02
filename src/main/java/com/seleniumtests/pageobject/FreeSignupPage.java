package com.seleniumtests.pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.seleniumtests.dataobject.BBRegistrationDataFree;
import com.seleniumtests.utility.HighLight;
import com.seleniumtests.utility.Log;
//import com.seleniumtests.dataobject.RegistrationData;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class FreeSignupPage {
	private WebDriver driver;

	public FreeSignupPage(WebDriver driver) {
		this.driver = driver;
	}

	@CacheLookup
	@FindBy(name = "loginForm.firstName")
	WebElement firstName;

	@CacheLookup
	@FindBy(name = "loginForm.lastName")
	WebElement lastName;

	@CacheLookup
	@FindBy(name = "emailForm.email")
	WebElement email;

	@CacheLookup
	@FindBy(name = "emailForm.confirmEmail")
	WebElement confirmEmail;

	@CacheLookup
	@FindBy(name = "passwordScreennameForm.password")
	WebElement password;

	@CacheLookup
	@FindBy(name = "passwordScreennameForm.confirmPassword")
	WebElement confirmPassword;

	@CacheLookup
	@FindBy(name = "passwordScreennameForm.screenName")
	WebElement screenName;

	@CacheLookup
	@FindBy(name = "_TBBSIGNUP_WAR_signuprefactorportlet_birthdayYear")
	WebElement dateOfBirth;
	
	@CacheLookup
	@FindBy(name = "profile.phone")
	WebElement phoneTextbox;	
	
	@CacheLookup
	@FindBy(name = "shippingAddressForm.street1")
	WebElement shippingStreet1;
	
	@CacheLookup
	@FindBy(name = "shippingAddressForm.street2")
	WebElement shippingStreet2;
	
	@CacheLookup
	@FindBy(name = "shippingAddressForm.city")
	WebElement shippingCity;	
	
	@CacheLookup
	@FindBy(name = "addressRegionId")
	WebElement shippingState;	
	
	@CacheLookup
	@FindBy(name = "shippingAddressForm.postalCode")
	WebElement shippingZip;
	
	@CacheLookup
	@FindBy(name = "addressCountryId")
	WebElement shippingCountry;	

	@CacheLookup
	//@FindBy(id = "_TBBSIGNUP_WAR_signuprefactorportlet_coachExistingMessage")//_TBBSIGNUP_WAR_signuprefactorportlet_selectMyCoachMessage
	@FindBy(name = "profile.coachSelectedInput")
	public List<WebElement>  coachReferral;
	
	@CacheLookup
	@FindBy(id = "coachLookupType")
	WebElement  pleaseSelect;
	
	@CacheLookup
	@FindBy(id = "coachSearchField")
	WebElement  searchCriteria;
	
	@CacheLookup
	@FindBy(id = "_TBBSIGNUP_WAR_signuprefactorportlet_lookupCoachBtn")
	WebElement  confirmCoach;
	
	@CacheLookup
	@FindBy(name = "termsAndConditionsForm.termsAndConditionsAgree")
	WebElement TnC;		
	
	@CacheLookup
	@FindBy(name = "termsAndConditionsForm.canadaOptIn")
	WebElement CASL;	
	
	@CacheLookup
	@FindBy(name = "_TBBSIGNUP_WAR_signuprefactorportlet_captchaText")
	WebElement captchaText;	
	
	@CacheLookup
	@FindBy(id = "free_submit")
	WebElement submitFreeSignup;
	
	@CacheLookup
	@FindBy(id = "*.errors")
	WebElement errors;

	private TimeUnit SECONDS;	
	
	
	public FreeSignupPage enterFirstName(String fName) {
		try{
		firstName.sendKeys(fName);
		Log.info("First Name picked from Excel is "+ fName );}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterLastName(String lName) {
		try{
		lastName.sendKeys(lName);
		Log.info("Last Name picked from Excel is "+ lName );
		}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterEmail(String mail) {
		try{
		email.sendKeys(mail);
		Log.info("Last Name picked from Excel is "+ mail );
		}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterConfirmEmail(String confirmmail) {
		try{
		confirmEmail.sendKeys(confirmmail);
		Log.info("Last Name picked from Excel is "+ confirmmail );
		}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterPassword(String pw) {
		try{
		password.sendKeys(pw);
		Log.info("Last Name picked from Excel is "+ pw );
		}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterConfirmPassword(String email) {
		try{
		confirmPassword.sendKeys(email);
		Log.info("Last Name picked from Excel is "+ email );
		}
		catch(NullPointerException  e){}
		return this;
	}

	public FreeSignupPage enterScreenName(String screenname) {
		try{
		screenName.sendKeys(screenname);
		Log.info("Last Name picked from Excel is "+ screenname );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterDateOfBirth(String dob) {
		try{
		new Select(dateOfBirth).selectByVisibleText(dob);
		Log.info("Last Name picked from Excel is "+ dob );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterPhoneTextbox(String phone) {
		try{
		phoneTextbox.sendKeys(phone);
		Log.info("Last Name picked from Excel is "+ phone );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingCountry(String country) {
		try{
		new Select(shippingCountry).selectByVisibleText(country);
		Log.info("Last Name picked from Excel is "+ country );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingStreet1(String street1) {
		try{
		shippingStreet1.sendKeys(street1);
		Log.info("Last Name picked from Excel is "+ street1 );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingStreet2(String street2) {
		try{
		shippingStreet2.sendKeys(street2);
		Log.info("Last Name picked from Excel is "+ street2 );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingCity(String city) {
		try{
		if (shippingCountry.isDisplayed())
			shippingCity.sendKeys(city);
		Log.info("Last Name picked from Excel is "+ city );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingState(String state) {
		try{
		new Select(shippingState).selectByVisibleText(state);
		Log.info("Last Name picked from Excel is "+ state );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterShippingZip(String zip) {
		try{
		shippingZip.sendKeys(zip);
		Log.info("Last Name picked from Excel is "+ zip );
		}
		catch(NullPointerException  e){}
		return this;
	}
	

	
	public FreeSignupPage enterCoachReferral(Boolean value, String coachId) {
		try{
		 if(value == true){
			 coachReferral.get(0).click();
				new Select(pleaseSelect).selectByVisibleText("Coach I.D.");
				searchCriteria.sendKeys(coachId);
				//while (1==1){
				confirmCoach.click();
				if(driver.findElement(By.tagName("body")).getText().contains("Corporate Test"))
					//break;
					{}
				else if (driver.findElement(By.tagName("body")).getText().contains("not found"))
					{
					    WebDriverWait wait = new WebDriverWait(driver, 15);
					    WebElement element= driver.findElement(By.id("_TBBSIGNUP_WAR_signuprefactorportlet_coachErrorMessageDiv"));
					    wait.until(ExpectedConditions.visibilityOf(element));   
					coachReferral.get(1).click();
					//break;
					}
				//}
						 
		 }if (value == false)
			 coachReferral.get(1).click();}
		 catch(NullPointerException  e){}

		return this;
	}

	
	public FreeSignupPage enterTnC(Boolean value) {
		try{
		if (value==true)
		TnC.click();
		Log.info("Last Name picked from Excel is "+ value );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterCASL(Boolean value) {
		try{
		if (value==true)
		CASL.click();	
		Log.info("Last Name picked from Excel is "+ value );
		}
		catch(NullPointerException  e){}
		return this;
	}
	
	public FreeSignupPage enterCaptcha(String captcha) {
		try{
		captchaText.sendKeys(captcha);
		Log.info("Last Name picked from Excel is "+ captcha );
		}
		catch(NullPointerException  e){}
		return this;
	}
	

	public Welcome clickSubmit() {
		try{HighLight.highlightElement(submitFreeSignup, driver);
		submitFreeSignup.click();}
		catch(NullPointerException  e){} catch (Exception e) {
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, Welcome.class);
	}
	
	public FreeSignupPage clickInvalid() {
		try{HighLight.highlightElement(submitFreeSignup, driver);
		submitFreeSignup.click();}
		catch(NullPointerException  e){} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public FreeSignupPage createNewUser(BBRegistrationDataFree registrationData) {
		Reporter.log("firstName: " +registrationData.getFirstName()+"<br>");
		Reporter.log("lastName: " +registrationData.getLastName()+"<br>");
		Reporter.log("email: " +registrationData.getEmail()+"<br>");
		Reporter.log("confirmEmail: " +registrationData.getConfirmEmail()+"<br>");
		Reporter.log("password: " +registrationData.getPassword()+"<br>");
		Reporter.log("confirmPassword: " +registrationData.getConfirmPassword()+"<br>");
		Reporter.log("screenName: " +registrationData.getScreenName()+"<br>");
		Reporter.log("dateOfBirth: " +registrationData.getDateOfBirth()+"<br>");
		Reporter.log("phoneTextbox: " +registrationData.getPhoneTextbox()+"<br>");
		Reporter.log("shippingStreet1: " +registrationData.getShippingStreet1()+"<br>");
		Reporter.log("shippingStreet2: " +registrationData.getShippingStreet2()+"<br>");
		Reporter.log("shippingCity: " +registrationData.getShippingCity()+"<br>");
		Reporter.log("shippingState: " +registrationData.getShippingState()+"<br>");
		Reporter.log("shippingZip: " +registrationData.getShippingZip()+"<br>");
		Reporter.log("shippingCountry: " +registrationData.getShippingCountry()+"<br>");
		Reporter.log("coachReferral: " +registrationData.getCoachReferral()+"<br>");
		Reporter.log("coachReferral: " +registrationData.getCoachId()+"<br>");
		Reporter.log("TnC: " +registrationData.getTnC()+"<br>");
		Reporter.log("CASL: " +registrationData.getCASL()+"<br>");
		Reporter.log("captchaText: " +registrationData.getCaptchaText()+"<br>");
		return 	enterFirstName(registrationData.getFirstName())
		.enterLastName(registrationData.getLastName())
		.enterEmail(registrationData.getEmail())
		.enterConfirmEmail(registrationData.getConfirmEmail())
		.enterPassword(registrationData.getPassword())
		.enterConfirmPassword(registrationData.getConfirmPassword())
		.enterScreenName(registrationData.getScreenName())
		.enterDateOfBirth(registrationData.getDateOfBirth())
		.enterPhoneTextbox(registrationData.getPhoneTextbox())
		.enterShippingCountry(registrationData.getShippingCountry())
		.enterShippingStreet1(registrationData.getShippingStreet1())
		.enterShippingStreet2(registrationData.getShippingStreet2())
		.enterShippingCity(registrationData.getShippingCity())
		.enterShippingState(registrationData.getShippingState())
		.enterShippingZip(registrationData.getShippingZip())
		.enterCoachReferral(registrationData.getCoachReferral(),registrationData.getCoachId())
		.enterTnC(registrationData.getTnC())
		.enterCASL(registrationData.getCASL())
		.enterCaptcha(registrationData.getCaptchaText());
		//.clickSubmit();
	}
	
	public FreeSignupPage createNewUserCukes(cucumber.api.DataTable cukedata, int i) {
		
		List<List<String>> cukeuser = cukedata.raw();
		Reporter.log("firstName: " +cukeuser.get(i).get(0)+"<br>");
		Reporter.log("lastName: " +cukeuser.get(i).get(1)+"<br>");
		Reporter.log("email: " +cukeuser.get(i).get(2)+"<br>");
		Reporter.log("confirmEmail: " +cukeuser.get(i).get(3)+"<br>");
		Reporter.log("password: " +cukeuser.get(i).get(4)+"<br>");
		Reporter.log("confirmPassword: " +cukeuser.get(i).get(5)+"<br>");
		Reporter.log("screenName: " +cukeuser.get(i).get(6)+"<br>");
		Reporter.log("dateOfBirth: " +cukeuser.get(i).get(7)+"<br>");
		Reporter.log("phoneTextbox: " +cukeuser.get(i).get(8)+"<br>");
		Reporter.log("shippingCountry: " +cukeuser.get(i).get(9)+"<br>");
		Reporter.log("shippingStreet1: " +cukeuser.get(i).get(10)+"<br>");
		Reporter.log("shippingStreet2: " +cukeuser.get(i).get(11)+"<br>");
		Reporter.log("shippingCity: " +cukeuser.get(i).get(12)+"<br>");
		Reporter.log("shippingState: " +cukeuser.get(i).get(13)+"<br>");
		Reporter.log("shippingZip: " +cukeuser.get(i).get(14)+"<br>");
		Reporter.log("coachReferral: " +cukeuser.get(i).get(15)+"<br>");
		Reporter.log("coachReferral: " +cukeuser.get(i).get(16)+"<br>");
		Reporter.log("TnC: " +cukeuser.get(i).get(17)+"<br>");
		Reporter.log("CASL: " +cukeuser.get(i).get(18)+"<br>");
		Reporter.log("captchaText: " +cukeuser.get(i).get(19)+"<br>");
		
		return 	enterFirstName(cukeuser.get(i).get(0))
		.enterLastName(cukeuser.get(i).get(1))
		.enterEmail(cukeuser.get(i).get(2))
		.enterConfirmEmail(cukeuser.get(i).get(3))
		.enterPassword(cukeuser.get(i).get(4))
		.enterConfirmPassword(cukeuser.get(i).get(5))
		.enterScreenName(cukeuser.get(i).get(6))
		.enterDateOfBirth(cukeuser.get(i).get(7))
		.enterPhoneTextbox(cukeuser.get(i).get(8))
		.enterShippingCountry(cukeuser.get(i).get(9))
		.enterShippingStreet1(cukeuser.get(i).get(10))
		.enterShippingStreet2(cukeuser.get(i).get(11))
		.enterShippingCity(cukeuser.get(i).get(12))
		.enterShippingState(cukeuser.get(i).get(13))
		.enterShippingZip(cukeuser.get(i).get(14))
		.enterCoachReferral(Boolean.valueOf(cukeuser.get(i).get(15)),cukeuser.get(i).get(16))
		.enterTnC(Boolean.valueOf(cukeuser.get(i).get(17)))
		.enterCASL(Boolean.valueOf(cukeuser.get(i).get(18)))
		.enterCaptcha(cukeuser.get(i).get(19));
		//.clickSubmit();
	}
}

