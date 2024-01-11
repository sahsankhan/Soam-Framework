Feature: Home Page


  @vimient-003 @SmokeAndroidTest @Login @LoginAndroid @android
    Scenario: User should be able to click on Profile icon on Home Page
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail tannu.ahuja7@gmail.com
    And   [Login Page] User enters androidPasswords Tannuahuja@2212
    And   [Login Page] User clicks on signIn button
    And   [Welcome Page] Welcome page should open successfully
    And   [Welcome Page] User clicks on continue button
    And   [Home Page] Home page should open successfully
    And   [Home Page] User clicks on profile icon

  @vimient-004 @SmokeAndroidTest @Login @LoginAndroid @android
    Scenario: User should be able to click on Care Insight tab on Home Page
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail tannu.ahuja7@gmail.com
    And   [Login Page] User enters androidPasswords Tannuahuja@2212
    And   [Login Page] User clicks on signIn button
    And   [Welcome Page] Welcome page should open successfully
    And   [Welcome Page] User clicks on continue button
    And   [Home Page] Home page should open successfully
    And   [Home Page] User clicks on care insight tab

  @vimient-005 @SmokeAndroidTest @Login @LoginAndroid @android
    Scenario: User should be able to click on Info button on Home Page
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail tannu.ahuja7@gmail.com
    And   [Login Page] User enters androidPasswords Tannuahuja@2212
    And   [Login Page] User clicks on signIn button
    And   [Welcome Page] Welcome page should open successfully
    And   [Welcome Page] User clicks on continue button
    And   [Home Page] Home page should open successfully
    And   [Home Page] User clicks on info button

  @vimient-006 @SmokeAndroidTest @Login @LoginAndroid @android
    Scenario: User should be able to click on Welln