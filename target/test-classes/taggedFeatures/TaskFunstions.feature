Feature: Tasks Management
All CRUD operations like Create, View, Update and Delete

Scenario: Create a new Task
Given User is logged in
When User create a new Task

@SmokeTest
Scenario: View Task Details
Given User is logged in
When User view Task details

@RegressionTest
Scenario: Update a Task
Given User is logged in
When User update Task details

Scenario: Delete a Task
Given User is logged in
When User delete a Task