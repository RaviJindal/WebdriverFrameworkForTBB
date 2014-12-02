$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FreeRegNew.feature");
formatter.feature({
  "id": "clubregistration",
  "description": "",
  "name": "ClubRegistration",
  "keyword": "Feature",
  "line": 2
});
formatter.background({
  "description": "",
  "name": "SignUp",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "I want to open the browser for free signup",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I visit the https://tbbqabeta.productpartners.com url for free signup",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I visit to the Signup Page for free signup",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I click on the free signup",
  "keyword": "When ",
  "line": 8
});
formatter.match({
  "location": "FreeRegSteps.i_want_to_open_the_browser_for_free_signup()"
});
formatter.result({
  "duration": 8415791412,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url_for_free_signup()"
});
formatter.result({
  "duration": 17051755429,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_visit_to_the_Signup_Page_for_free_signup()"
});
formatter.result({
  "duration": 610289509,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_click_on_the_free_signup()"
});
formatter.result({
  "duration": 12358471845,
  "status": "passed"
});
formatter.scenario({
  "id": "clubregistration;dataentryvalid",
  "tags": [
    {
      "name": "@run",
      "line": 10
    }
  ],
  "description": "",
  "name": "DataEntryValid",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "i do submit with valid form entry for free signup",
  "keyword": "Then ",
  "line": 12,
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "confirmEmail",
        "password",
        "confirmPassword",
        "screenName",
        "dateOfBirth",
        "phoneTextbox",
        "shippingCountry",
        "shippingStreet1",
        "shippingStreet2",
        "shippingCity",
        "shippingState",
        "shippingZip",
        "coachReferral",
        "COACHID",
        "tnC",
        "CASL",
        "captchaText"
      ],
      "line": 13
    },
    {
      "cells": [
        "1-Dec",
        "f1",
        "rj_0112_free21@mailinator.com",
        "rj_0112_free21@mailinator.com",
        "11111",
        "11111",
        "Dec1f11",
        "1978",
        "1111111111",
        "Canada",
        "1-Dec",
        "f2",
        "montreal",
        "Quebec",
        "h3b5l1",
        "FALSE",
        "",
        "TRUE",
        "TRUE",
        "1111"
      ],
      "line": 14
    }
  ]
});
formatter.step({
  "name": "i get free signup welcome page",
  "keyword": "And ",
  "line": 16
});
formatter.match({
  "location": "FreeRegSteps.i_do_submit_with_valid_form_entry_for_free_signup(DataTable)"
});
formatter.result({
  "duration": 6430299878,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_get_free_signup_welcome_page()"
});
formatter.result({
  "duration": 8366587751,
  "status": "failed",
  "error_message": "java.lang.AssertionError: java.lang.AssertionError: expected [true] but found [false]\r\n\tat com.thoughtworks.selenium.SeleneseTestBase.fail(SeleneseTestBase.java:391)\r\n\tat com.seleniumtests.core.CustomVerification.checkForVerificationErrors(CustomVerification.java:102)\r\n\tat com.seleniumtests.cucumbertest.java.FreeRegSteps.i_get_free_signup_welcome_page(FreeRegSteps.java:83)\r\n\tat ✽.And i get free signup welcome page(FreeRegNew.feature:16)\r\n"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1252165781,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "SignUp",
  "keyword": "Background",
  "line": 4,
  "type": "background"
});
formatter.step({
  "name": "I want to open the browser for free signup",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I visit the https://tbbqabeta.productpartners.com url for free signup",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "I visit to the Signup Page for free signup",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I click on the free signup",
  "keyword": "When ",
  "line": 8
});
formatter.match({
  "location": "FreeRegSteps.i_want_to_open_the_browser_for_free_signup()"
});
formatter.result({
  "duration": 6877465817,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_visit_the_https_tbbqabeta_productpartners_com_url_for_free_signup()"
});
formatter.result({
  "duration": 21916083494,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_visit_to_the_Signup_Page_for_free_signup()"
});
formatter.result({
  "duration": 478421417,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_click_on_the_free_signup()"
});
formatter.result({
  "duration": 12333563360,
  "status": "passed"
});
formatter.scenario({
  "id": "clubregistration;dataentryinvalid",
  "tags": [
    {
      "name": "@run",
      "line": 18
    }
  ],
  "description": "",
  "name": "DataEntryInValid",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario"
});
formatter.step({
  "name": "i do submit with Invalid form entry for free signup",
  "keyword": "Then ",
  "line": 20,
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "confirmEmail",
        "password",
        "confirmPassword",
        "screenName",
        "dateOfBirth",
        "phoneTextbox",
        "shippingCountry",
        "shippingStreet1",
        "shippingStreet2",
        "shippingCity",
        "shippingState",
        "shippingZip",
        "coachReferral",
        "COACHID",
        "tnC",
        "CASL",
        "captchaText"
      ],
      "line": 21
    },
    {
      "cells": [
        "",
        "f1",
        "rj_0909_free2@mailinator.com",
        "rj_0909_free2@mailinator.com",
        "11111",
        "11111",
        "Sept9f1",
        "1978",
        "1111111111",
        "Canada",
        "8-Sep",
        "f2",
        "montreal",
        "Quebec",
        "h3b5l1",
        "FALSE",
        "",
        "TRUE",
        "TRUE",
        "1111"
      ],
      "line": 22
    }
  ]
});
formatter.step({
  "name": "i get free signup error page",
  "keyword": "And ",
  "line": 24
});
formatter.match({
  "location": "FreeRegSteps.i_do_submit_with_Invalid_form_entry_for_free_signup(DataTable)"
});
formatter.result({
  "duration": 6001789441,
  "status": "passed"
});
formatter.match({
  "location": "FreeRegSteps.i_get_free_signup_error_page()"
});
formatter.result({
  "duration": 3408588903,
  "status": "failed",
  "error_message": "java.lang.AssertionError: java.lang.AssertionError: expected [false] but found [true]\r\n\tat com.thoughtworks.selenium.SeleneseTestBase.fail(SeleneseTestBase.java:391)\r\n\tat com.seleniumtests.core.CustomVerification.checkForVerificationErrors(CustomVerification.java:102)\r\n\tat com.seleniumtests.cucumbertest.java.FreeRegSteps.i_get_free_signup_error_page(FreeRegSteps.java:123)\r\n\tat ✽.And i get free signup error page(FreeRegNew.feature:24)\r\n"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 2388902186,
  "status": "passed"
});
});