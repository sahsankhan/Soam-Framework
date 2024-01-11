Feature: Welcome Page Continue Button


  @vimient-002 @SmokeAndroidTest @Login @LoginAndroid @android
  Scenario: User should be able to click on Continue button on Welcome Page
    Given [Login Page] App should open successfully
    When  [Login Page] User enters androidEmail tannu.ahuja7@gmail.com
    And   [Login Page] User enters androidPasswords Tannuahuja@2212
    And   [Login Page] User click on signIn button
    And   [Welcome Page] Welcome page should open successfully
    And   [Welcome Page] User clicks on continue button
