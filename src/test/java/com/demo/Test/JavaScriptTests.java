package com.demo.Test;

import Base.BaseTest;
import Pages.DropdownPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest {
    protected DropdownPage ddp;


    @Test
    public void testAddMultipleAttributeToDropdown(Method method){
        ddp =homepage.clickDropdown();
        ddp.addMultipleAttribute();
        var optionsToSelect = List.of("Option 1", "Option 2");

        optionsToSelect.forEach(ddp::selectFromDropDown);

        var selectedOptions = ddp.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");

    }
}
