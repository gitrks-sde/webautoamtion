Feature: Web Automation uisng BDD

  Background: 
    Given Application Lets Shop URL is loaded
    When user enter the email wolverinek11@rahulshetty.com
    When user enter the password Pwdselenium@1
    When user clicks on login button    
        

  @HC
  Scenario: Login to Lets Shop App and Zara
    Then verify Homepage loaded
    When user select the product zara
    Then Close the browser

			
  @smoke
  Scenario: Login to Lets Shop App and Mobile
    Then verify Homepage loaded
    When user select the product mobile
    Then Close the browser
