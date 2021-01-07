package com.demo.Test;

import Base.BaseTest;
import Pages.JavaScriptAlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class JavaScriptAlertsTest extends BaseTest {

    protected JavaScriptAlertsPage jsap;



    @Test(priority = 1)
    public void checkJsAlert (Method method){
        jsap=homepage.clickOnJavaScriptAlerts();
        jsap.clickOnJsAlert();
        System.out.println(jsap.getStatus());
        Assert.assertTrue(jsap.getStatus()
                .contains("You successfuly clicked an alert")
                ,"alert not active" );
    }
    @Test(priority = 2)
    public void checkJsConfirm(Method method){
        jsap.clickOnJsConfirm();
        System.out.println(jsap.getStatus());
        Assert.assertTrue(jsap.getStatus().contains("You clicked: Cancel")
                ,"alert confirme not active");
    }
    @Test(priority = 3)
    public void checkJsPrompt(Method method){
        jsap.clickOnJsPrompt("automation");
        System.out.println(jsap.getStatus());
        Assert.assertTrue(jsap.getStatus().contains("You entered: automation")
                ,"alert prompt not active");
    }
}
