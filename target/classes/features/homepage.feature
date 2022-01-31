@test
Feature: Home Page

  Scenario: Validate that the APP has loaded correctly
	When I open the app
	Then I should see the home page with the cars list
	And  The details of each one of the cars should be visible
