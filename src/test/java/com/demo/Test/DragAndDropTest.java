package com.demo.Test;

import Base.BaseTest;
import Pages.DragAndDropPage;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DragAndDropTest extends BaseTest {
    protected DragAndDropPage dadp;



    @Test
    public void verifyDragAndDrop(Method method){
        dadp=homepage.clickOnDragAndDrop();
        dadp.dragAndDrop();
        System.out.println(dadp.getSourceHeader());
        Assert.assertTrue(dadp.getSourceHeader().contains("A"));
    }
}
