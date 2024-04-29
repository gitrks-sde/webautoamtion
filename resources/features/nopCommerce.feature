Feature: Web Automation uisng BDD
	
	@smoke
  Scenario: Login to nop Commerce
    Given Application nop Commerce URL is loaded
    When user enter the email
    When user enter the password
    When user clicks on login button
    Then Close the browser

	@sanity @smoke
  Scenario: Login to nop Commerce
    Given Application Lets Shop URL is loaded
    Then Close the browser
