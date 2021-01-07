package com.demo.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class FormAuthenticationTest extends BaseTest {
    protected LoginPage lp;
    protected SecureAreaPage sap;



    @Test
    public void VerifyLogin(Method method){
        lp=homepage.clickOnFormAuthentication();
        lp.setUserName("tomsmith");
        lp.setPassWord("SuperSecretPassword!");
        sap=lp.clickOnLoginBtn();
        sap.getLoginStatusAlert();
        sap.clickOnLogout();
    }
}
