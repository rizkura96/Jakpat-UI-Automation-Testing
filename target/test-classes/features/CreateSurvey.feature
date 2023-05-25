Feature: Create Survey
  @jakpat @createsurvey

  @positive
    Scenario: User create a survey with random responden (up to the payment stage only)
    Given User already on login page
    When User input "rizkura96" as username and "justfortesting" as password
    And User clik Sign In button
    Then The page will be directed to main page of Jakpat
    And User click New Survey button
    And User input "testing only" as survey title, "testing2" as client title, "testing3" as survey description, and "Once (The survey will be published once)" as frequency
    And User input set target responden "100"
    And User input the questions "testing?", first option "yes", second option "no"
    And User click Save button
    And User click Next Billing button
    Then The page will be directed to payment page
