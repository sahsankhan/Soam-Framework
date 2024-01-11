Feature: Add Senior

  @vim-001 @Web
  Scenario: User is able to add senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    And     [Web Admin Page] User clicks on Add User button from admin tab
    And     [Web Add Senior Page] User enters in First Name inputbox Zubair
    And     [Web Add Senior Page] User enters in Last Name inputbox Automation
    And     [Web Add Senior Page] User enters in Mobile Phone inputbox 14785
    And     [Web Add Senior Page] User clicks on gender dropdown
    And     [Web Add Senior Page] User clicks on Male dropdown option
    And     [Web Add Senior Page] User enters in Date of Birth inputbox 05/16/1945
    And     [Web Add Senior Page] User enters in Email inputbox ahsan.kahn+automation
    And     [Web Add Senior Page] User enters in Street Address inputbox Street 1
    And     [Web Add Senior Page] User clicks on state dropdown
    And     [Web Add Senior Page] User clicks on CO dropdown option
    And     [Web Add Senior Page] User enters in City inputbox Denver
    And     [Web Add Senior Page] User enters in Zip code inputbox 80014
    And     [Web Add Senior Page] User clicks on Create Account button
    Then    [Web Add Senior Page] User should see the Account created successfully! alert message in green below