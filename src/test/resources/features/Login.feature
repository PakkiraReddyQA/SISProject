@tag
Feature: Login - Check the flow of login with valid credentials

  @sanity
  Scenario: Verify successful login with valid credentials
    Given Launch the application
    When User enters credentials to login
      | Username   | Password     |
      | pakkirareddy.y | Pakkira@123 |
    Then Message displayed login successfully
