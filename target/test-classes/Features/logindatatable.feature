Feature: Login Feature

#Scenario: Valid Login3
Scenario Outline: Valid Login4
    Given User is on login Page
    When User enters login creds map
    		| username | password |
        | tomsmith | SuperSecretPassword! |
        
    Then Should display success page
    
  Scenario Outline: Valid Login5
    Given User is on login Page
    When User enters login creds
        | tomsmith | SuperSecretPassword! |
        
    Then Should display success page