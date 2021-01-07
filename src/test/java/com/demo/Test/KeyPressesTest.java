package com.demo.Test;

import Base.BaseTest;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class KeyPressesTest extends BaseTest {

    protected KeyPressesPage kpp;


    @Test(priority = 1)
    public void testBackSpace(Method method){
        kpp=homepage.clickOnKeyPresses();
        kpp.EnterKeys("automation"+ Keys.BACK_SPACE);
        Assert.assertEquals(kpp.getResult(),"You entered: BACK_SPACE","notsame");
    }
    @Test(priority = 2)
    public void testShift(Method method) {

        kpp.EnterKeys(Keys.SHIFT + "g");
        Assert.assertEquals(kpp.getResult(), "You entered: G", "notsame");
    }
}
