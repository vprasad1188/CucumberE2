Feature: Login Feature

Scenario: Valid Login
    Given User is on login Page
    When User enters login credentials
    Then Should display success page
    
#Scenario: Valid Login2
#    Given User is on login Page
#    When User enters "tomsmith" and "SuperSecretPassword!"
#    Then Should display success page
    
#Scenario: Valid Login3
Scenario Outline: Valid Login3
    Given User is on login Page
    When User enters "<username>" and "<password>"
    Then Should display success page
    
    Examples:
    | username | password |
    | testuser1 | welcome1 |
    | testuser2 | welcome2 |
    | tomsmith | SuperSecretPassword! |