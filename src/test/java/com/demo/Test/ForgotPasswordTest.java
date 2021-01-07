package com.demo.Test;

import Base.BaseTest;
import Pages.ForgotPasswordPage;
import Pages.SentEmailpage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Random;

public class ForgotPasswordTest extends BaseTest {
    protected ForgotPasswordPage fpp;
    protected SentEmailpage sep;



    @Test
    public void ValidationEmailSentToResetPassword(Method method){
       fpp= homepage.clickOnForgotPassword();
       Random random =new Random();
       int randomInt =random.nextInt(1000);
       fpp.setEmailToResetPassword("abc"+randomInt+"@qa.test");
       fpp.GetText();
       sep=fpp.clickOnRetrieve();
       sep.verifyStatusAlertIsDisplayed();
    }
}
