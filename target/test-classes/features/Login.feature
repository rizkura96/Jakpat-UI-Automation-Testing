 Feature: Login
   @jakpat @login

   @positive @1
   Scenario:User login with valid/registered account
      Given User already on login page
      When User input "rizkura96" as username and "justfortesting" as password
      And User clik Sign In button
      Then The page will be directed to main page of Jakpat

   @negative @2
   Scenario:User login with unregistered account
     Given User already on login page
     When User input "rizkura100" as username and "unregistered" as password
     And User clik Sign In button
     Then User failed login and a login failure pop up "Login failed." will appear

   @negative @2new
   Scenario:User login with unregistered account
     Given User already on login page
     When User input "rizkura100" as username and "unregistered" as password
     And User clik Sign In button
     Then User failed login and a login failure pop up will appear


#   @negative @3
#   Scenario Outline:User login with invalid data
#     Given User already on login page
#     When User input "<username>" as username and "<password>" as password
#     And User clik Sign In button
#     Then User failed login and a login failure pop up "Login failed." will appear
#     Examples:
#       | username | password |
#       | xX12345  |          |
#       |          | 12345xX  |
#       |          |          |

   @negative @3new
   Scenario Outline:User login with invalid data
     Given User already on login page
     When User input "<username>" as username and "<password>" as password
     And User clik Sign In button
     Then User failed login and a login failure pop up will appear
     Examples:
       | username | password |
       | xX12345  |          |
       |          | 12345xX  |
       |          |          |
