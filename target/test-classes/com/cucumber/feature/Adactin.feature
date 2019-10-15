@adactin
Feature: Adactin Project smoke test automation scripts

Scenario: To verify valid login details
Given User should be in Adactin application
Then User should see the Adactin logo displayed in the header
When User enter the name in the username field
And User enter the password in the password field
And User click on the login button
And user wait for 4 seconds for page load
Then User should see the Search Hotel title in the search page field

Scenario: To verify the checkout date field

Given  User should see the Search Hotel title in the search page field 
When User should set location in location field
When User should set Hotel in hotels field
And User should set room type in roomtype field
And User enter check-in-date later than check-out-date in respective fields
Then verify that check-in-date is not later than check-out-date
Then user should find the no of rooms in adactin search page
Then user should check whether the submit button is accessed

Scenario: To verify whether the system reports an error message

When User should set locations in  the location field
When User should set Hotels in  the hotels field
And  User should set rooms type in the roomtype field
And  user should find the no of rooms in the adactin search pages
Then User enter check-in-date later than check-out-date in the respective fields
Then verify that check-in-date is not later than the check-out-date


Scenario: To verify whether the location field is same as in search hotel field

When When User should set location in to location field
When User should set Hotel in to hotels field
And User should set room type in to roomtype field
And User should set no.of rooms in to rooms field
And User should enter check-in-date to field
When User should enter check-out-date to field
When User should select the no.of.adults to field
And User should select the no.of.children to field
And User click on the search button


#Scenario: To verify the checkin date and checkout date is displaying as per the entered form
# 
#When User should set location in location field
#When User should set Hotel in hotels field
#And  User should set room type in roomtype field
#And  user should find the no of rooms in adactin search page
#Then  verify that check-in-date is not later than check-out-date
#Then  user should select no of adults
#Then  user should select no of children 
#Then  user should click the submit button
#Then  verify the checkin date and checkout date same as per the form
#
#
#Scenario: To verify No.of.rooms in Select page is same as the No.of.rooms in search hotel page
#When When User should set location in location field
#When User should set Hotel in hotels field
#And User should set room type in roomtype field
#And User should set no.of rooms in rooms field
#And User should enter check-in-date field
#When User should enter check-out-date field
#When User should select the no.of.adults field
#And User should select the no.of.children field
#And User click on the search button
#
#  
#Scenario: To verify the room type as same as selected in search hotel page
#
#When User should set location in location field
#When User should set Hotel in hotels field
#And  User should set room type in roomtype field
#And  user should find the no of rooms in adactin search page
#Then verify that check-in-date is not later than check-out-date
#Then User should select no of adults
#Then  user should select no of children
#Then  user should click the search button
#Then verify that the room type is same as selected in search hotel page
#
#
#Scenario: To verify the total price details in Book Hotel Page(excl of GST)
#When When User should set location in location field
#When User should set Hotel in hotels field
#And User should set room type in roomtype field
#And User should set no.of rooms in rooms field
#And User should enter check-in-date field
#When User should enter check-out-date field
#When User should select the no.of.adults field
#When User should select the no.of.children field
#And User click on the search button
#And User should select the hotel and click on Continue
#
#
#Scenario: To verify whether the user logout from the adactinpage
#
#When User should set location in location field
#When User should set Hotel in hotels field
#And  User should set room type in roomtype field
#And  user should find the no of rooms in adactin search page
#Then verify that check-in-date is not later than check-out-date
#Then User should select no of adults
#Then user should select no of children
#Then user should click the search button
#Then user should select the hotel and click on continue button
#Then user should enter the booking details
#Then to verify the details corretcly and logout and check whether ot is logged out
#
#Scenario: To verify the total price details in Book Hotel Page(10% of GST)
#When When User should set location in location field
#When User should set Hotel in hotels field
#And User should set room type in roomtype field
#And User should set no.of rooms in rooms field
#And User should enter check-in-date field
#When User should enter check-out-date field
#When User should select the no.of.adults field
#When User should select the no.of.children field
#And User click on the search button
#And User should select the hotel and click on Continue

