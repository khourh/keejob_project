

Feature: Login features
Scenario: Connect with incorrect mail and password

Given connect to keejob website
When I click se connecter
And I enter a correct email
And I enter my passeword
Then I click se connecter1
