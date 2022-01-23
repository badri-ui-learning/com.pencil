Feature: PickYourTrial Login

Scenario: login with no credentials
Given I open a chrome browser and navigate to website
When I login without entering username and password
Then Username Error and Password Error should appear
