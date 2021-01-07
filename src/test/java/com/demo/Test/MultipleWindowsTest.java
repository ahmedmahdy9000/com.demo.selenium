package com.demo.Test;

import Base.BaseTest;
import Pages.MultipleWindowsPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MultipleWindowsTest extends BaseTest {
    protected MultipleWindowsPage mwp;


    @Test
    public void HandleMultipleWindows(Method method){
        mwp= homepage.clickOnMultipleWindows();
        System.out.println(mwp.getTittlePage());
        System.out.println(mwp.getCurrentUrl());
        mwp.openNewWindow();
        mwp.handleNewWindow();
        System.out.println(mwp.getTextPage());
        System.out.println(mwp.getTittlePage());
        System.out.println(mwp.getCurrentUrl());

    }

}
