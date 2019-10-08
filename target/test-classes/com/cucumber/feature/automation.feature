@automation
Feature: to run automation websites for application





Scenario Outline: order placement for dress material

Given user should be in facebook application
Then user should see the facebook logo displayed in the header
When user enter the '<username>' in the emailfield in login page
And user enter the '<password>' in the password field in the login page
And user click on the login button in the login page
And user wait for 3 seconds for page load
Then user should see the login into facebook title in the forgot password page   


Examples:
|username  |password|
|testuser1 |ABC     |
|testuser2 |DEF     |