package com.demo.Test;

import Base.BaseTest;
import Pages.BrokenImagesPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class BrokenImagesTest extends BaseTest {

    protected BrokenImagesPage bip;


    @Test
    public void getBrokenImage(Method method){
        bip =homepage.clickONBrokenImages();
        bip.images();
    }
}
