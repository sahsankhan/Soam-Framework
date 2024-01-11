Feature: WellnessPlan

  @vim-001 @Web
  Scenario: User is able to submit wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button
    And     [Web Wellness Survey Page] User clicks on Wellness Survey Submit button
    Then    [Web Wellness Survey Page] User should see the Wellness survey submitted successfully alert

  @vim-002 @Web
  Scenario: User is able to reset wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button
    And     [Web Wellness Survey Page] User clicks on Wellness Survey Reset button
    Then    [Web Wellness Survey Page] User should see the Saved Wellness Survey heading
#
  @vim-003 @Web
  Scenario: User is able to save wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Relaxed/Calm radio button
    And     [Web Wellness Survey Page] User Select Happy/Cheerful radio button
    And     [Web Wellness Survey Page] User Select Rested/Energized radio button
    And     [Web Wellness Survey Page] User Select Sense of Purpose radio button
    And     [Web Wellness Survey Page] User Select Busy/Engaged radio button
    And     [Web Wellness Survey Page] User Select Socially Active/Fulfilled radio button
    And     [Web Wellness Survey Page] User Select Feeling Good/Content radio button
    And     [Web Wellness Survey Page] User clicks on Wellness Survey Save button
    Then    [Web Wellness Survey Page] User should see limit reached alert popup
    When    [Web Wellness Survey Page] User clicks on alert popup okay button
    Then    [Web Wellness Survey Page] User should see the Saved Wellness Survey heading

  @vim-004 @Web
  Scenario: User is able to submit wellness survey for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Wellness Survey tab
    Then    [Web Wellness Survey Page] User should see the Wellness Check-in Survey heading
    When    [Web Wellness Survey Page] User Select Stressed/Anxiety radio button
    And     [Web Wellness Survey Page] User Select high answer/option for relax
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for relax
    And     [Web Wellness Survey Page] User Select Sad/Depressed radio button
    And     [Web Wellness Survey Page] User Select medium answer/option for happiness
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for happiness
    And     [Web Wellness Survey Page] User Select Tired/Fatigued radio button
    And     [Web Wellness Survey Page] User Select low answer/option for energy
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for energy
    And     [Web Wellness Survey Page] User Select Aimless/Insignificant radio button
    And     [Web Wellness Survey Page] User Select high answer/option for purpose
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for purpose
    And     [Web Wellness Survey Page] User Select Bored/Uneventful radio button
    And     [Web Wellness Survey Page] User Select medium answer/option for engagement
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for engagement
    And     [Web Wellness Survey Page] User Select Lonely/Isolated radio button
    And     [Web Wellness Survey Page] User Select low answer/option for social
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for social
    And     [Web Wellness Survey Page] User Select Pain/Aching/Discomfort radio button
    And     [Web Wellness Survey Page] User Select high answer/option for comfort
    And     [Web Wellness Survey Page] User inputs Automation Test in the comment for comfort
    And     [Web Wellness Survey Page] User clicks on Wellness Survey Submit button
    Then    [Web Wellness Survey Page] User should see the Wellness survey submitted successfully alert