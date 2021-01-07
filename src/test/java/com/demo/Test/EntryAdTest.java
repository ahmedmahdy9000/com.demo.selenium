package com.demo.Test;

import Base.BaseTest;
import Pages.EntryAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class EntryAdTest extends BaseTest {

    protected EntryAdPage eap;



    @Test
    public void handleModalAd(Method method) throws InterruptedException {
        eap= homepage.clickOnEntryAd();
        Thread.sleep(3000);
        System.out.println(eap.getTittle());
        Assert.assertTrue(eap.getTittle()
               .contains("THIS IS A MODAL WINDOW"),"tittle is wrong");
        eap.closeAd();
        System.out.println(eap.getTittlePage());
        Assert.assertTrue(eap.getTittlePage()
                .contains("Entry Ad"),"page tittle not showen");
    }

}
