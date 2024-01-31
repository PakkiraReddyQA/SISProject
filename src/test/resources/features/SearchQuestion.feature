#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: App Questions
 

  @Smoke
  Scenario: Search Questions
    Given Login to the Application
    And Click on the AppQtn
    When Enter Question SearchBy Field <name>
    And Print the First Page Question in Console
    Then Check the Searched Questions displyed
    
  @tag2
  Scenario Outline: Search Question With diffrent Data
    Given Enter Question in SearcBy Field <name>
   

    Examples: 
      | name  |
      | what |   
      | are |    
