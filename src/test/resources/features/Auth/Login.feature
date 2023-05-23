 Feature: Login

    @jakpat @login1 @positive
    Scenario:User login with valid email and password
      Given User already on login page
      When User input "rizkura96" as username and "justfortesting" as password
      And User clik Sign In button
      Then The page will be directed to main page of Jakpat
