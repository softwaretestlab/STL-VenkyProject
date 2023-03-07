Feature: GG HomePage
  Scenario: Navigate to GG website
  Given open browser and enter url and navigate to GG website
  Then get title and assert


  Scenario: Login to webpage
    Given Enter username
    Then Enter password
    And Click on login button
    Then should be on login screen











    #one feature file can have multiple Scenarios under it
#Featrue = user story
  #Scenario = test case
      #    #Steps
      #    Given
      #    When
      #    Then
      #    But
      #    AND
      #    *