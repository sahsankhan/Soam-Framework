Feature: Login

  @vim-001 @Web
  Scenario: Verify that Admin can successfully signin/login
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Admin Page] User should see Admin tab in the header
    And     [Web Admin Page] User should see To Do heading

  @vim-002 @Web
  Scenario: Verify that QA can successfully signin/login
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-qa@srijan.net
    And     [Web Login Page] User enters password nk?8[.=+da2UKV%
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    And     [Web Home Page] User should see the Welcome heading

  @vim-003 @Web
  Scenario: Verify that Admin can successfully logout
    Given [Main Page] User go the web portal and navigate to the login page
    When  [Web Login Page] User enters email srijan-admin@srijan.net
    And   [Web Login Page] User enters password Srijan@12345
    And   [Web Login Page] User clicks on Log In button
    And   [Web Admin Page] User clicks on Profile dropdown from Admin page
    And   [Web Admin Page] User clicks on Logout button from Admin page
    Then  [Main Page] User sees User logged out successfully message at bottom

  @vim-004 @Web
  Scenario: Admin is able to log out of portal from home page
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    And     [Web Admin Page] User clicks on Home button from admin tab
    And     [Web Home Page] User clicks on profile dropdown from home page
    And     [Web Home Page] User clicks on Logout button from home page
    Then    [Main Page] User sees User logged out successfully message at bottom

  @vim-005 @Web
  Scenario: User is able to Reset Password using the Forgot your password
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User clicks on Forgot your password link
    Then    [Web Forgot Password Page] User should see the Forgot Password heading
    When    [Web Forgot Password Page] User enters recovery email address zubair.alam+1@vimient.com
    And     [Web Forgot Password Page] User clicks on Reset Password button
    Then    [Web Forgot Password Page] User should see the Success alert
    When    [Web Forgot Password Page] User clicks on cross button to close the alert
    Then    [Web Forgot Password Page] User should see the One Time Password inputbox
    And     [Web Forgot Password Page] User should see the Enter One Time Password heading