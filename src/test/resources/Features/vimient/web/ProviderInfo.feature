Feature: Provider Info

  @vim-001 @Web
    Scenario: User is able to add Provider Info for a senior
    Given   [Main Page] User go the web portal and navigate to the login page
    When    [Web Login Page] User enters email srijan-admin@srijan.net
    And     [Web Login Page] User enters password Srijan@12345
    And     [Web Login Page] User clicks on Log In button
    Then    [Web Home Page] User should see Home tab in heading
    When    [Web Admin Page] User clicks on Home button from admin tab
    Then    [Web Home Page] User should see the Welcome heading
    When    [Web Home Page] User enters in the senior list search textbox Zubair
    And     [Web Home Page] User clicks on the top senior Zubair Automation84 after search
    Then    [Web Senior Dashboard Page] User should see the Dashboard heading
    And     [Web Senior Dashboard Page] User clicks on Onboarding Info tab
    Then    [Web Onboarding Info Page] User should see the Profile Info heading
    When    [Web Onboarding Info Page] User clicks on Provider Info subtab
    Then    [Web Provider Info SubTab Page] User should see the doctor1 heading
    And     [Web Provider Info SubTab Page] User should see the dentist1 heading
    When    [Web Provider Info SubTab Page] User enters Doctor 1 practice name Doctor
    And     [Web Provider Info SubTab Page] User enters Doctor 1 first name Zubair
    And     [Web Provider Info SubTab Page] User enters Doctor 1 last name Dogar
    And     [Web Provider Info SubTab Page] User clicks on Doctor 1 specialty dropdown
    And     [Web Provider Info SubTab Page] User clicks on Doctor 1 speciality Chiropractor
    And     [Web Provider Info SubTab Page] User enters Doctor 1 contact phone 15936
    And     [Web Provider Info SubTab Page] User enters Doctor 1 email address zubair.alam+doctor
#    And     [Web Provider Info SubTab Page] User clicks on Add Doctor button
#    Then    [Web Provider Info SubTab Page] User should see doctor2 heading
    When    [Web Provider Info SubTab Page] User enters Dentist 1 practice name Dr
    And     [Web Provider Info SubTab Page] User enters Dentist 1 first name Ahsan
    And     [Web Provider Info SubTab Page] User enters Dentist 1 last name Chohan
    And     [Web Provider Info SubTab Page] User clicks on Dentist 1 specialty dropdown
    And     [Web Provider Info SubTab Page] User clicks on Dentist 1 speciality Endodontist
    And     [Web Provider Info SubTab Page] User enters Dentist 1 contact phone 2593693571
    And     [Web Provider Info SubTab Page] User enters Dentist 1 email address zubair.alam+dentist1@vimient.com
#    And     [Web Provider Info SubTab Page] User clicks on add dentist button
#    Then    [Web Provider Info SubTab Page] User should see dentist2 heading
    When    [Web Provider Info SubTab Page] User clicks on Save button
    Then    [Web Provider Info SubTab Page] User should see a Saved Successfully alert