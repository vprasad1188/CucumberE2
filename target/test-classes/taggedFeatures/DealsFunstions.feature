# tags can be given at feature level as well
@PhaseOne
Feature: Deals Management
All CRUD operations like Create, View, Update and Delete

@SmokeTest @RegressionTest
Scenario: Create a new Deal
Given User is logged in
When User create a new deal

@SmokeTest
Scenario: View Deal Details
Given User is logged in
When User view deal details

Scenario: Update a Deal
Given User is logged in
When User update deal details

@RegressionTest
Scenario: Delete a Deal
Given User is logged in
When User delete a deal