$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FaceBook.feature");
formatter.feature({
  "line": 2,
  "name": "facebook application smoke test automation scripts",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@facebook"
    }
  ]
});
formatter.before({
  "duration": 287300,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "user should be in facebook applications",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_should_be_in_facebook_applications()"
});
formatter.result({
  "duration": 7957458600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verify the login functinality of the application with invalid credentials",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts;verify-the-login-functinality-of-the-application-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user should see the facebook logo displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter the email address in the emailfield in login page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enter the password in the password field in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on the login button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user wait for 3 seconds for page load",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user should see the login into facebook title in the forgot password page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_see_the_facebook_logo_displayed_in_the_header()"
});
formatter.result({
  "duration": 206688900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_email_address_in_the_emailfield_in_login_page()"
});
formatter.result({
  "duration": 634124100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_enter_the_password_in_the_password_field_in_the_login_page()"
});
formatter.result({
  "duration": 374737600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_on_the_login_button_in_the_login_page()"
});
formatter.result({
  "duration": 1443919800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.user_wait_for_seconds_for_page_load(int)"
});
formatter.result({
  "duration": 3004066100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_should_see_the_login_into_facebook_title_in_the_forgot_password_page()"
});
formatter.result({
  "duration": 53088900,
  "status": "passed"
});
formatter.after({
  "duration": 101100,
  "status": "passed"
});
});