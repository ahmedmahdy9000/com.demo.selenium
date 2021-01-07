package com.demo.Test;

import Base.BaseTest;
import Pages.HoversPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class HoversTest extends BaseTest {
    protected HoversPage hp;



    @Test
    public void HoverOverFigure(Method method){
        hp=homepage.clickOnHovers();
        //must same int for both
        hp.hoverOverFigure(3,3);
    }
}
