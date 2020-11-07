$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature_file/signUp.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Applicatin feature",
  "description": "",
  "id": "signup-applicatin-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User SignUp scenario",
  "description": "",
  "id": "signup-applicatin-feature;user-signup-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Application Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the My_Account Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters the First Name, Last Name, Mobile Number, Email, Password and Confirm Password and click SignUp button",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Mobile Number",
        "Email",
        "Password",
        "Conform Password"
      ],
      "line": 10
    },
    {
      "cells": [
        "XYZ",
        "LMN",
        "9876543212",
        "xyz@gmail.com",
        "xyz123",
        "xyz123"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User navigate to UserProfile Page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "duration": 25491729400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.user_clicks_on_the_My_Account_Button()"
});
formatter.result({
  "duration": 8833431600,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.user_enters_the_First_Name_Last_Name_Mobile_Number_Email_Password_and_Confirm_Password_and_click_SignUp_button(DataTable)"
});
formatter.result({
  "duration": 4644995600,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.user_navigate_to_UserProfile_Page()"
});
formatter.result({
  "duration": 13049132100,
  "status": "passed"
});
});