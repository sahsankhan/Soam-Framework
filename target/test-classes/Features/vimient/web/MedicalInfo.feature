Feature: Medical Info

  @vim-001 @Web
    Scenario: User is able to add Medical Info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation83 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Onboarding Info tab
    Then    [Web Onboarding Info Page] User should see the Profile Info heading
    When    [Web Onboarding Info Page] User clicks on Medical Info subtab
    Then    [Web Medical Info SubTab Page] User should see the medical history heading
    When    [Web Medical Info SubTab Page] User clicks on pacemaker dropdown
    And     [Web Medical Info SubTab Page] User clicks on Yes option
    And     [Web Medical Info SubTab Page] User enters today's date in Date Implemented
    And     [Web Medical Info SubTab Page] User enters Automation Test in Allergies/Dietary Concern input box
    And     [Web Medical Info SubTab Page] User enters today's date in Last Physical Exam
    And     [Web Medical Info SubTab Page] User clicks on addictions dropdown
    And     [Web Medical Info SubTab Page] User clicks on Alcohol option
    And     [Web Medical Info SubTab Page] User enters Automation Test in How Long? input box
    And     [Web Medical Info SubTab Page] User enters Automation Test in Other Exams input box
    And     [Web Medical Info SubTab Page] User enters today's date in Exam date
    And     [Web Medical Info SubTab Page] User enters Automation Test in Injuries input box
    And     [Web Medical Info SubTab Page] User enters today's date in Injury date
    And     [Web Medical Info SubTab Page] User enters Automation Test in Vaccines input box
    And     [Web Medical Info SubTab Page] User enters today's date in Vaccines date
    And     [Web Medical Info SubTab Page] User enters Automation Test in Medical Limitations/Disabilities input box
    And     [Web Medical Info SubTab Page] User enters today's date in Date Diagnosed
    And     [Web Medical Info SubTab Page] User enters Automation Test in Home Medical Devices input box
    And     [Web Medical Info SubTab Page] User enters Automation Test in Reason for usage input box
    And     [Web Medical Info SubTab Page] User enters today's date in Usage Date
    And     [Web Medical Info SubTab Page] User enters Automation Test in Medication Name input box
    And     [Web Medical Info SubTab Page] User enters Automation Test in Medications Type input box
    And     [Web Medical Info SubTab Page] User clicks on With or without food dropdown
    And     [Web Medical Info SubTab Page] User clicks on With food option
    And     [Web Medical Info SubTab Page] User enters Automation Test in Strength/Strength Unit input box
    And     [Web Medical Info SubTab Page] User enters 3 in Dose (per day) input box
    And     [Web Medical Info SubTab Page] User enters 5 in Frequency input box
    And     [Web Medical Info SubTab Page] User clicks on dose_form dropdown
    And     [Web Medical Info SubTab Page] User clicks on Gummy option
    And     [Web Medical Info SubTab Page] User enters Automation Test in Duration of Medication Cycle input box
    And     [Web Medical Info SubTab Page] User enters Automation Test in Reason for taking the medication input box
    And     [Web Medical Info SubTab Page] User enters today's date in Date Prescribed
    And     [Web Medical Info SubTab Page] User enters 20 in Pills per bottle/container input box
    And     [Web Medical Info SubTab Page] User enters 8 in Remaining Refils input box
    And     [Web Medical Info SubTab Page] User enters today's date in Refill Date
    And     [Web Medical Info SubTab Page] User enters Automation Test in Drug allergies input box
    And     [Web Medical Info SubTab Page] User enters Automation Test in Comments input box
    And     [Web Medical Info SubTab Page] User clicks on medication_schedule dropdown
    And     [Web Medical Info SubTab Page] User clicks on Friday option
    And     [Web Medical Info SubTab Page] User clicks on Add Prescription button
    And     [Web Medical Info SubTab Page] User clicks on Save button
    Then    [Web Medical Info SubTab Page] User should see a Saved Successfully alert