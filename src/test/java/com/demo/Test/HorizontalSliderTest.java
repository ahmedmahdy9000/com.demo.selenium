package com.demo.Test;

import Base.BaseTest;
import Pages.HorizontalSliderPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class HorizontalSliderTest extends BaseTest {

    protected HorizontalSliderPage hsp;



    @Test
    public void testHorizontalSlider(Method method){
        hsp=homepage.clickOnHorizontalSlider();
        for (int i =0 ;i<8;i++) {
            hsp.moveSlider(Keys.ARROW_RIGHT);
        }
        hsp.moveSlider(Keys.ARROW_LEFT);
        System.out.println(hsp.getRange());
    }
}
