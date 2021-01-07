package com.demo.Test;

import Base.BaseTest;
import Pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DynamicLoadingTest extends BaseTest {

    protected DynamicLoadingPage dlp;



    @Test
    public void CheckDynamicLoading(Method method){
        dlp = homepage.clickOnDynamicLoading();
        dlp.clickOnExample1();
        dlp.clickStart();

        System.out.println(dlp.getText());
    }


}
