Feature:
  #background method will run first before executing any Scenario in that particular feature file
  Background:
    Given User is on Homepage

  Scenario: Account link
    Given user clicks on account link from homepage
    Then User is navigated to Create an account screen

  Scenario: Account link-1
    Given user clicks on account link from homepage-1
    Then User is navigated to Create an account screen-1