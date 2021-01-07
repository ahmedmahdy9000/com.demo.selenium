package com.demo.Test;

import Base.BaseTest;
import Pages.DropdownListPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DropdownListTest extends BaseTest {
    protected DropdownListPage ddlp;



    @Test
    public void SelectOptionFromDropDown(Method method){
        ddlp=homepage.clickOnDropdown();
        ddlp.SelectOption();
        ddlp.getSelectedOption();
      System.out.println();


    }
}
