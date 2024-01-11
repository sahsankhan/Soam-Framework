package pages;

import core.utils.ConfigUtil;
import pages.android.*;
import pages.web.*;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");


//     Web
    private final PageMainWeb pageMainWeb = new PageMainWeb (this);
    protected PageMainWeb getPageMainWeb() { return pageMainWeb; }

    private final PageLoginWeb pageLoginWeb = new PageLoginWeb(this);
    protected PageLoginWeb getPageLoginWeb() {
        return pageLoginWeb;
   }

    private final PageAdminWeb getPageAdminWeb = new PageAdminWeb(this);
    protected PageAdminWeb getPageAdminWeb() { return getPageAdminWeb; }

    private final PageHomeWeb getPageHomeWeb = new PageHomeWeb(this);
    protected PageHomeWeb getPageHomeWeb() { return getPageHomeWeb; }

    private final PageAddSeniorWeb getPageAddSenior = new PageAddSeniorWeb(this);
    protected PageAddSeniorWeb getPageAddSenior() {
        return getPageAddSenior;
    }

    private final PageForgotPasswordWeb getPageForgotPassword = new PageForgotPasswordWeb(this);
    protected PageForgotPasswordWeb getPageForgotPassword() {return getPageForgotPassword;}

    private final PageSeniorDashboardWeb getPageSeniorDashboard = new PageSeniorDashboardWeb(this);
    protected PageSeniorDashboardWeb getPageSeniorDashboard() { return getPageSeniorDashboard; }

    private final PageSchedulerWeb getPageScheduler = new PageSchedulerWeb(this);
    protected PageSchedulerWeb getPageScheduler() {return getPageScheduler;}

    private final PageOnboardingInfoWeb getPageOnboardingInfo = new PageOnboardingInfoWeb(this);
    protected PageOnboardingInfoWeb getPageOnboardingInfo() {return getPageOnboardingInfo;}

    private final PageProviderInfoSubTabWeb getPageProviderInfoSubTab = new PageProviderInfoSubTabWeb(this);
    protected PageProviderInfoSubTabWeb getPageProviderInfoSubTab() { return getPageProviderInfoSubTab;}

    private final PageMedicalInfoSubTabWeb getPageMedicalInfoSubTab = new PageMedicalInfoSubTabWeb(this);
    protected PageMedicalInfoSubTabWeb getPageMedicalInfoSubTab() { return getPageMedicalInfoSubTab;}

    private final PageCareCircleSubTabWeb getPageCareCircleSubTab = new PageCareCircleSubTabWeb(this);
    protected PageCareCircleSubTabWeb getPageCareCircleSubTab() {return getPageCareCircleSubTab;}

    private final PageWellnessSurveyWeb getPageWellnessSurvey = new PageWellnessSurveyWeb(this);
    protected PageWellnessSurveyWeb getPageWellnessSurvey() {return getPageWellnessSurvey;}

    private final PageHolisticAssessmentsWeb getPageHolisticAssessments = new PageHolisticAssessmentsWeb(this);
    protected PageHolisticAssessmentsWeb getPageHolisticAssessments() {return getPageHolisticAssessments;}

    private final PageLawtonBrodyADLWeb getPageLawtonBrodyADL = new PageLawtonBrodyADLWeb(this);
    protected PageLawtonBrodyADLWeb getPageLawtonBrodyADL() {return getPageLawtonBrodyADL;}

    private final PageKatzADLWeb getPageKatzADL = new PageKatzADLWeb(this);
    protected PageKatzADLWeb getPageKatzADL() {return getPageKatzADL;}

    private final PageCaregiverStrainAssessmentWeb getPageCaregiverStrainAssessment = new PageCaregiverStrainAssessmentWeb(this);
    protected PageCaregiverStrainAssessmentWeb getPageCaregiverStrainAssessment() {return getPageCaregiverStrainAssessment;}


    //Android

    private final LoginPage pageLoginAndroid = new LoginPage(this);
    protected LoginPage getLoginPageAndroid() {return pageLoginAndroid;}

    private final WelcomePage pageWelcomeAndroid = new WelcomePage(this);
    protected WelcomePage getPageWelcomeAndroid() {return pageWelcomeAndroid;}

    private final HomePage pageHomeAndroid = new HomePage(this);
    protected HomePage getPageHomeAndroid() {return pageHomeAndroid;}

//    private final ForgotPasswordPageAndroid pageForgotPassword = new ForgotPasswordPageAndroid(this);
//    protected ForgotPasswordPageAndroid getAndroidPageForgotPassword() { return pageForgotPassword; }


}
