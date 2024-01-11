Feature: Caregiver Strain Assessment

  @vim-001 @Web
  Scenario: User is able to fill a new Caregiver Strain Assessment for a senior(Testing Reset button)
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
    When    [Web Holistic Assessment Page] User clicks on Caregiver Strain Assessment side-tab
    Then    [Web Caregiver Strain Assessment Page] User should see the Caregiver Strain Assessment heading
    When    [Web Caregiver Strain Assessment Page] User clicks on Select a Caregiver dropdown
    And     [Web Caregiver Strain Assessment Page] User clicks on 'Zubair Jira (Primary)' option
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 1
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 2
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 3
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 4
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 5
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 6
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 7
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 8
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 9
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 10
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 11
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 12
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 13
    And     [Web Caregiver Strain Assessment Page] User clicks on Reset button
    And     [Web Caregiver Strain Assessment Page] User clicks on OK button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been reset successfully' alert

  @vim-002 @Web
  Scenario: User is able to fill a new Caregiver Strain Assessment for a senior(Testing Save button)
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
    When    [Web Holistic Assessment Page] User clicks on Caregiver Strain Assessment side-tab
    Then    [Web Caregiver Strain Assessment Page] User should see the Caregiver Strain Assessment heading
    When    [Web Caregiver Strain Assessment Page] User clicks on Select a Caregiver dropdown
    And     [Web Caregiver Strain Assessment Page] User clicks on 'Zubair Jira (Primary)' option

    And     [Web Caregiver Strain Assessment Page] User clicks on Reset button
    And     [Web Caregiver Strain Assessment Page] User clicks on OK button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 1
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 2
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 3
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 4
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 5
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 6
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 7
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 8
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 9
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 10
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 11
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 12
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 13
    And     [Web Caregiver Strain Assessment Page] User clicks on Save button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been saved successfully' alert

  @vim-003 @Web
  Scenario: User is able to fill a new Caregiver Strain Assessment for a senior(Testing Submit button)
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
    When    [Web Holistic Assessment Page] User clicks on Caregiver Strain Assessment side-tab
    Then    [Web Caregiver Strain Assessment Page] User should see the Caregiver Strain Assessment heading
    When    [Web Caregiver Strain Assessment Page] User clicks on Select a Caregiver dropdown
    And     [Web Caregiver Strain Assessment Page] User clicks on 'Zubair Jira (Primary)' option

    And     [Web Caregiver Strain Assessment Page] User clicks on Reset button
    And     [Web Caregiver Strain Assessment Page] User clicks on OK button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 1
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 2
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 3
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 4
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 5
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 6
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 7
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 8
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 9
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 10
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 11
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 12
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 13
    And     [Web Caregiver Strain Assessment Page] User clicks on Submit button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been submitted successfully' alert

  @vim-004 @Web
  Scenario: User is able to see an incomplete tag when submitting imcomplete Caregiver Strain Assessment
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
    When    [Web Holistic Assessment Page] User clicks on Caregiver Strain Assessment side-tab
    Then    [Web Caregiver Strain Assessment Page] User should see the Caregiver Strain Assessment heading
    When    [Web Caregiver Strain Assessment Page] User clicks on Select a Caregiver dropdown
    And     [Web Caregiver Strain Assessment Page] User clicks on 'Zubair Jira (Primary)' option

    And     [Web Caregiver Strain Assessment Page] User clicks on Reset button
    And     [Web Caregiver Strain Assessment Page] User clicks on OK button
    Then    [Web Caregiver Strain Assessment Page] User should see the 'Caregiver Strain assessment has been reset successfully' alert
    When    [Web Caregiver Strain Assessment Page] User clicks on the close icon

    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 2
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 3
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 5
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 6
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 8
    And     [Web Caregiver Strain Assessment Page] User clicks on regular option for question 9
    And     [Web Caregiver Strain Assessment Page] User clicks on no option for question 11
    And     [Web Caregiver Strain Assessment Page] User clicks on sometimes option for question 12

    And     [Web Caregiver Strain Assessment Page] User clicks on Submit button
    Then    [Web Caregiver Strain Assessment Page] User should see an Incomplete Tag on top right corner of page