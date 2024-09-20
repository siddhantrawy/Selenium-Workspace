@Rediff
Feature: User login and logout on Rediff.com

  @Successful_LogIn_LogOut
  Scenario: Successful login and logout with valid credentials
    Given the user is on the Rediff login page
    When the user enters valid username and password
    And the user clicks on the "Sign In" button
    Then the user should be logged in successfully
    And the user should see the account dashboard
    When the user clicks on the "Logout" button
    Then the user should be logged out and redirected to the login page

  @Unsuccessful_Login
  Scenario: Unsuccessful login with invalid credentials
	Given the user is on the Rediff login page
	When the user enters an invalid username or password
	And the user clicks on the "Sign In" button
	Then the user should see an error message "Invalid login credentials"
	And the user should remain on the login page
