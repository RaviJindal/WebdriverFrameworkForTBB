
Feature: ClubRegistration

Background: SignUp
	Given I want to open the browser for free signup
	And I visit the https://tbbqabeta.productpartners.com url for free signup
    And I visit to the Signup Page for free signup
    When I click on the free signup
	
@run	
Scenario: DataEntryValid
	Then i do submit with valid form entry for free signup
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | coachReferral | COACHID | tnC | CASL | captchaText |
  	| 1-Dec | f1 | rj_0112_free21@mailinator.com | rj_0112_free21@mailinator.com | 11111| 11111 |	Dec1f11 | 1978 | 1111111111 | Canada | 1-Dec | f2 | montreal | Quebec | h3b5l1 | FALSE | | TRUE | TRUE | 1111 |
 		
	And i get free signup welcome page

@run	
Scenario: DataEntryInValid
	Then i do submit with Invalid form entry for free signup
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | coachReferral | COACHID | tnC | CASL | captchaText |
  	| | f1 | rj_0909_free2@mailinator.com | rj_0909_free2@mailinator.com | 11111| 11111 |	Sept9f1 | 1978 | 1111111111 | Canada | 8-Sep | f2 | montreal | Quebec | h3b5l1 | FALSE | | TRUE | TRUE | 1111 |
		
	And i get free signup error page