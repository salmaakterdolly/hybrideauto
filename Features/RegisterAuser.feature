@SampleFeature 
 Feature: as a facebook user 
 i want to log in to my account 
 so that i can connected  from any device

Scenario: login to my facebook account successfully

Given i am on facebook home page
When I enter user name, password, confirm password
And I click on sign in
Then I see successful registration message