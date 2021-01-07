package com.demo.Test;

import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ShiftingContentTest extends BaseTest {
    protected ShiftingContentPage scp ;
    protected ShiftingContentMenuElementPage scep;
    protected ShiftingContentImagePage scip;
    protected ShiftingContentListPage sclp;


    @Test(priority = 1)
    public void verifyShiftingContentElement(Method method){

         scp  = homepage.clickOnShifting();
         scep = scp.ClickOnMenuElement();
         scep.getSizeOfElement();
         scep.back();

    }
    @Test(priority = 2)
    public void verifyImageIsDisplayed(Method method){
        scip = scp.ClickOnAnImage();
        scip.imageIsDisplayed();
        scep.back();
    }
    @Test(priority = 3)
    public void verifyList(Method method){
        sclp = scp.ClickOnList();
        sclp.GetText();

    }
}
