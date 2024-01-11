Feature: Holistic Assessment

  @vim-001 @Web
  Scenario: User is able to fill a new holistic assessment for a senior(Testing Reset button)
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
    And     [Web Senior Dashboard Page] User clicks on Assessments tab
    Then    [Web Holistic Assessment Page] User should see the Holistic Assessment heading

    When    [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    When    [Web Holistic Assessment Page] User clicks on never option in eating0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in eating1
    And     [Web Holistic Assessment Page] User clicks on always option in sleepingS0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in sleepingS1
    And     [Web Holistic Assessment Page] User clicks on never option in healthS0
    And     [Web Holistic Assessment Page] User clicks on always option in healthS1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey1
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey2
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey5
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey6
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey1
    And     [Web Holistic Assessment Page] User clicks on always option in intellectualSurvey2
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey3
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey4
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey5
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in physicalSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in spiritualSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey3
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey5
    And     [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert

  @vim-002 @Web
  Scenario: User is able to fill a new holistic assessment for a senior(Testing Save button)
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
    And     [Web Senior Dashboard Page] User clicks on Assessments tab
    Then    [Web Holistic Assessment Page] User should see the Holistic Assessment heading

    When     [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    When    [Web Holistic Assessment Page] User clicks on never option in eating0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in eating1
    And     [Web Holistic Assessment Page] User clicks on always option in sleepingS0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in sleepingS1
    And     [Web Holistic Assessment Page] User clicks on never option in healthS0
    And     [Web Holistic Assessment Page] User clicks on always option in healthS1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey1
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey2
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey5
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey6
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey1
    And     [Web Holistic Assessment Page] User clicks on always option in intellectualSurvey2
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey3
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey4
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey5
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in physicalSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in spiritualSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey3
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey5
    And     [Web Holistic Assessment Page] User clicks on Save button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been saved successfully' alert

  @vim-003 @Web
  Scenario: User is able to fill a new holistic assessment for a senior(Testing Save button)
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
    And     [Web Senior Dashboard Page] User clicks on Assessments tab
    Then    [Web Holistic Assessment Page] User should see the Holistic Assessment heading

    When     [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    When    [Web Holistic Assessment Page] User clicks on never option in eating0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in eating1
    And     [Web Holistic Assessment Page] User clicks on always option in sleepingS0
    And     [Web Holistic Assessment Page] User clicks on sometimes option in sleepingS1
    And     [Web Holistic Assessment Page] User clicks on never option in healthS0
    And     [Web Holistic Assessment Page] User clicks on always option in healthS1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey1
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey2
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey5
    And     [Web Holistic Assessment Page] User clicks on always option in emotionalSurvey6
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey1
    And     [Web Holistic Assessment Page] User clicks on always option in intellectualSurvey2
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey3
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey4
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey5
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in physicalSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey3
    And     [Web Holistic Assessment Page] User clicks on sometimes option in physicalSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey0
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in spiritualSurvey2
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey3
    And     [Web Holistic Assessment Page] User clicks on always option in spiritualSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey5
    And     [Web Holistic Assessment Page] User clicks on Submit button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been submitted successfully' alert

  @vim-004 @Web
  Scenario: User is able to see an Incomplete tag when submitting incomplete holistic assessment
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email zubair.alam+55@vimient.com
    And     [Web Login Page] User enters password Vista!@#135!@#
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation00 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Assessments tab
    Then    [Web Holistic Assessment Page] User should see the Holistic Assessment heading

    When    [Web Holistic Assessment Page] User clicks on Reset button
    And     [Web Holistic Assessment Page] User clicks on OK button
    Then    [Web Holistic Assessment Page] User should see the 'Holistic assessment has been reset successfully' alert
    When    [Web Holistic Assessment Page] User clicks on the close icon

    When    [Web Holistic Assessment Page] User clicks on sometimes option in eating1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in sleepingS1
    And     [Web Holistic Assessment Page] User clicks on sometimes option in emotionalSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in emotionalSurvey5
    And     [Web Holistic Assessment Page] User clicks on sometimes option in intellectualSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in intellectualSurvey4
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in physicalSurvey3
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey0
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey3
    And     [Web Holistic Assessment Page] User clicks on never option in spiritualSurvey5
    And     [Web Holistic Assessment Page] User clicks on Submit button
    Then    [Web Holistic Assessment Page] User should see the Incomplete tag at the right top corner of page