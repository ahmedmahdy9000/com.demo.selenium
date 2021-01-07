package com.demo.Test;

import Base.BaseTest;
import Pages.ContextMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ContextMenuTest extends BaseTest {
    protected ContextMenuPage cmp;



    @Test
    public void handleContextMenu  (Method method) throws InterruptedException {
        cmp= homepage.clickOnContextMenu();
        cmp.clickOnBox();
        System.out.println(cmp.getText());
        Assert.assertTrue(cmp.getText()
                        .contains("You selected a context menu")
                ,"message is diffrent");
        cmp.handleAlert();




    }
}
