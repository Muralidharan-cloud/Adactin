@facebook
Feature: facebook application smoke test automation scripts






Background: Launch the application
Given  user should be in facebook applications
 
Scenario: verify the login functinality of the application with invalid credentials


Then user should see the facebook logo displayed in the header
When user enter the email address in the emailfield in login page
And user enter the password in the password field in the login page
And user click on the login button in the login page
And user wait for 3 seconds for page load
Then user should see the login into facebook title in the forgot password page 

