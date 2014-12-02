@notImplemented	
Feature: ClubRegistration
Background: SignUp
	Given I want to open the browser
	And I visit the https://tbbqabeta.productpartners.com url
    And I visit to the Signup Page
    When I click on the club signup
	
@notImplemented	
Scenario: DataEntryValid
	Then i do submit with valid form entry
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | ccFirstName | ccLastName | ccType | ccNumber | ccExp | ccCvv | billingCB | coachReferral | COACHID | tnC | CASL | captchaText |
  	| DecC01 | club12 | rj_011214_c6@mailinator.com | rj_011214_c6@mailinator.com | 11111 | 11111 | DecC0112club6 | 1978 | 1111111111 | Canada | DecC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |
 		
	And i get welcome page

@notImplemented	
Scenario: DataEntryInValid
	Then i do submit with Invalid form entry
	| firstName  | lastName   | email | confirmEmail | password | confirmPassword | screenName | dateOfBirth | phoneTextbox | shippingCountry | shippingStreet1 | shippingStreet2 | shippingCity | shippingState | shippingZip | ccFirstName | ccLastName | ccType | ccNumber | ccExp | ccCvv | billingCB | coachReferral | COACHID | tnC | CASL | captchaText |
  	| OctC | club8 | rj_011014_c7@mailinator.com | rj_011014_c7@mailinator.com | 11111 | 11111 | OctCclub8 | 1978 | 1111111111 | Canada | OctC | club7 | montreal | Quebec | h3b5l1 | abc | xyz | Visa | 4222222222222 | 2021 | 123 | TRUE | TRUE | 994 | TRUE | TRUE | 1111 |
		
	And i get error page