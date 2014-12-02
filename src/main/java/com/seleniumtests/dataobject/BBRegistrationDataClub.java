package com.seleniumtests.dataobject;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import com.seleniumtests.core.DriverFactory;
import com.seleniumtests.uiobject.UIClubSignup;
import com.seleniumtests.utility.GenerateData;

import au.com.bytecode.opencsv.CSVReader;

public class BBRegistrationDataClub extends UIClubSignup{
	static GenerateData genData=new GenerateData();
	private String firstName;
	private String lastName;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	private String screenName;
	private String dateOfBirth;
	private String phoneTextbox;
	private String shippingStreet1;
	private String shippingStreet2;
	private String shippingCity;
	private String shippingState;
	private String shippingZip;
	private String ccFirstName;
	private String ccLastName;
	private String ccType;
	private String ccNumber;
	private String ccExp;
	private String ccCvv;
	private Boolean billingCB;
	private String shippingCountry;
	private Boolean coachReferral;
	private String coachId;
	private Boolean tnC;
	private Boolean CASL;
	private String captchaText;
	
	public BBRegistrationDataClub() throws IOException {
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getPhoneTextbox() {
		return phoneTextbox;
	}

	public void setPhoneTextbox(String phoneTextbox) {
		this.phoneTextbox = phoneTextbox;
	}
	
	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public String getShippingStreet1() {
		return shippingStreet1;
	}

	public void setShippingStreet1(String shippingStreet1) {
		this.shippingStreet1 = shippingStreet1;
	}
	
	public String getShippingStreet2() {
		return shippingStreet2;
	}

	public void setShippingStreet2(String shippingStreet2) {
		this.shippingStreet2 = shippingStreet2;
	}
	
	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	
	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	
	public String getShippingZip() {
		return shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}
	
	
	public String getCcFirstName() {
		return ccFirstName;
	}

	public void setCcFirstName(String ccfname) {
		this.ccFirstName = ccfname;
	}
	
	public String getCcLastName() {
		return ccLastName;
	}

	public void setCcLastName(String cclname) {
		this.ccLastName = cclname;
	}
	
	public String getCcType() {
		return ccType;
	}

	public void setCcType(String cctype) {
		this.ccType = cctype;
	}
	
	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccnum) {
		this.ccNumber = ccnum;
	}
	
	public String getCcExp() {
		return ccExp;
	}

	public void setCcExp(String ccexp) {
		this.ccExp = ccexp;
	}
	
	public String getCcCvv() {
		return ccCvv;
	}

	public void setCcCvv(String cvv) {
		this.ccCvv = cvv;
	}
	
	public Boolean getBillingCB() {
		return billingCB;
	}

	public void setBillingCB(String billCB) {
		this.billingCB = Boolean.valueOf(billCB);
	}
	
	public Boolean getCoachReferral() {
		return coachReferral;
	}

	public void setCoachReferral(String coachReferral) {
		this.coachReferral = Boolean.valueOf(coachReferral);
	}
	
	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}
	
	public Boolean getTnC() {
		return tnC;
	}

	public void setTnC(String tnC) {
		this.tnC = Boolean.valueOf(tnC);
	}
	
	public Boolean getCASL() {
		return CASL;
	}

	public void setCASL(String casl) {
		this.CASL = Boolean.valueOf(casl);
	}
	
	
	public String getCaptchaText() {
		return captchaText;
	}

	public void setCaptchaText(String captchaText) {
		this.captchaText = captchaText;
	}


	/**
	 * Test data provider reading data from csv file
	 * 
	 * @return
	 * @throws IOException
	 */

	@DataProvider(name = "regCSVDataBB_club")
	public static Object[][] getCSVData_club() throws IOException {
		CSVReader csvReader = new CSVReader(new FileReader(
				BBRegistrationDataClub.class.getResource("/regdataBB_club.csv").getPath()));
		List<String[]>dataList = csvReader.readAll();
		Object[][] data = new Object[dataList.size()][1];
		List<BBRegistrationDataClub> regList = new ArrayList<BBRegistrationDataClub>();
		for (String[] strArray:dataList) {
			BBRegistrationDataClub registrationData1 = new BBRegistrationDataClub();
            Reporter.log("readind data from list"); 
            System.out.println(strArray[0]+strArray[1]+strArray[2]+strArray[3]+strArray[4]+strArray[5]+strArray[6]+strArray[7]+strArray[8]+strArray[9]+strArray[10]+strArray[11]+strArray[12]+strArray[13]+strArray[14]+strArray[15]+strArray[16]+strArray[17]+strArray[18]+strArray[19]);
            		
			registrationData1.setFirstName(strArray[0].trim());
			registrationData1.setLastName(strArray[1].trim());
			registrationData1.setEmail(strArray[2].trim());
			registrationData1.setConfirmEmail(strArray[3].trim());
			registrationData1.setPassword(strArray[4].trim());
			registrationData1.setConfirmPassword(strArray[5].trim());
			registrationData1.setScreenName(strArray[6].trim());
			registrationData1.setDateOfBirth(strArray[7].trim());
			registrationData1.setPhoneTextbox(strArray[8].trim());
			registrationData1.setShippingCountry(strArray[9].trim());
			registrationData1.setShippingStreet1(strArray[10].trim());
			registrationData1.setShippingStreet2(strArray[11].trim());
			registrationData1.setShippingCity(strArray[12].trim());
			registrationData1.setShippingState(strArray[13].trim());
			registrationData1.setShippingZip(strArray[14].trim());
			registrationData1.setCcFirstName(strArray[15].trim());
			registrationData1.setCcLastName(strArray[16].trim());
			registrationData1.setCcType(strArray[17].trim());
			registrationData1.setCcNumber(strArray[18].trim());
			registrationData1.setCcExp(strArray[19].trim());
			registrationData1.setCcCvv(strArray[20].trim());
			registrationData1.setBillingCB(strArray[21].trim());
			registrationData1.setCoachReferral(strArray[22].trim());
			registrationData1.setCoachId(strArray[23].trim());
			registrationData1.setTnC(strArray[24].trim());
			registrationData1.setCASL(strArray[25].trim());
			registrationData1.setCaptchaText(strArray[26].trim());
			regList.add(registrationData1);
		}
		for(int i=0; i<(data.length); i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j]=regList.get(i);
				//System.out.println(data[i][j]);
			}
		}
		csvReader.close();
		return data;
	}

	@DataProvider(name = "regCSVDataBBDuplicate_club")
	public static Object[][] getCSVData_clubDuplicate() throws IOException {
		CSVReader csvReader = new CSVReader(new FileReader(
				BBRegistrationDataClub.class.getResource("/regdataBB_clubDuplicate.csv").getPath()));
		List<String[]>dataList = csvReader.readAll();
		Object[][] data = new Object[dataList.size()][1];
		List<BBRegistrationDataClub> regList = new ArrayList<BBRegistrationDataClub>();
		for (String[] strArray:dataList) {
			BBRegistrationDataClub registrationData1 = new BBRegistrationDataClub();
            Reporter.log("readind data from list"); 
            System.out.println(strArray[0]+strArray[1]+strArray[2]+strArray[3]+strArray[4]+strArray[5]+strArray[6]+strArray[7]+strArray[8]+strArray[9]+strArray[10]+strArray[11]+strArray[12]+strArray[13]+strArray[14]+strArray[15]+strArray[16]+strArray[17]+strArray[18]+strArray[19]);
            		
			registrationData1.setFirstName(strArray[0].trim());
			registrationData1.setLastName(strArray[1].trim());
			registrationData1.setEmail(strArray[2].trim());
			registrationData1.setConfirmEmail(strArray[3].trim());
			registrationData1.setPassword(strArray[4].trim());
			registrationData1.setConfirmPassword(strArray[5].trim());
			registrationData1.setScreenName(strArray[6].trim());
			registrationData1.setDateOfBirth(strArray[7].trim());
			registrationData1.setPhoneTextbox(strArray[8].trim());
			registrationData1.setShippingCountry(strArray[9].trim());
			registrationData1.setShippingStreet1(strArray[10].trim());
			registrationData1.setShippingStreet2(strArray[11].trim());
			registrationData1.setShippingCity(strArray[12].trim());
			registrationData1.setShippingState(strArray[13].trim());
			registrationData1.setShippingZip(strArray[14].trim());
			registrationData1.setCcFirstName(strArray[15].trim());
			registrationData1.setCcLastName(strArray[16].trim());
			registrationData1.setCcType(strArray[17].trim());
			registrationData1.setCcNumber(strArray[18].trim());
			registrationData1.setCcExp(strArray[19].trim());
			registrationData1.setCcCvv(strArray[20].trim());
			registrationData1.setBillingCB(strArray[21].trim());
			registrationData1.setCoachReferral(strArray[22].trim());
			registrationData1.setCoachId(strArray[23].trim());
			registrationData1.setTnC(strArray[24].trim());
			registrationData1.setCASL(strArray[25].trim());
			registrationData1.setCaptchaText(strArray[26].trim());
			regList.add(registrationData1);
		}
		for(int i=0; i<(data.length); i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j]=regList.get(i);
				//System.out.println(data[i][j]);
			}
		}
		csvReader.close();
		return data;
	}
	
	/**
	 * Test data provider for data hard coded with in test
	 * 
	 * @return
	 * @throws IOException
	 */
	@DataProvider(name = "regRANDOMDataBB_club")
	public static Object[][] getRegistrationData() throws IOException {
		String email=genData.generateEmail(30);
		String password = genData.generateRandomNumber(5);
		
		BBRegistrationDataClub registrationData1 = new BBRegistrationDataClub();
		registrationData1.setFirstName(genData.generateRandomAlphaNumeric(30));
		registrationData1.setLastName(genData.generateRandomAlphaNumeric(25));
		registrationData1.setEmail(email);
		registrationData1.setConfirmEmail(email);
		registrationData1.setPassword(password);
		registrationData1.setConfirmPassword(password);
		registrationData1.setScreenName(genData.generateRandomString(25));
		registrationData1.setDateOfBirth("1978");
		registrationData1.setPhoneTextbox(genData.generateRandomNumber(10));
		registrationData1.setShippingCountry("United States");
		registrationData1.setShippingStreet1(genData.generateRandomString(7));
		registrationData1.setShippingStreet2(genData.generateRandomString(8));
		registrationData1.setShippingCity("seattle");
		registrationData1.setShippingState("Washington");
		registrationData1.setShippingZip("98106");
		registrationData1.setCcFirstName("abc");
		registrationData1.setCcLastName("xyz");
		registrationData1.setCcType("Visa");
		registrationData1.setCcNumber("4111111111111111");
		registrationData1.setCcExp("2021");
		registrationData1.setCcCvv(genData.generateRandomNumber(3));
		registrationData1.setBillingCB("true");
		registrationData1.setCoachReferral("false");
		registrationData1.setCoachId("226176");
		registrationData1.setTnC("true");
		registrationData1.setCASL("false");
		registrationData1.setCaptchaText("1111");
		return new BBRegistrationDataClub[][] { { registrationData1 } };
	}

	
}
