package com.demo.Test;

import Base.BaseTest;
import Pages.FramesPage;
import Pages.NestedFramesPage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class NestedFramesTest extends BaseTest {
    protected FramesPage fp;
    protected NestedFramesPage nfp;


    @Test
    public void SwitchBetweenNestedFrames(Method method){
        fp= homepage.clickOnFrames();
        nfp=fp.clickOnNestedFrame();
        nfp.switchToFrameTop();
        nfp.switchToFrameLeft();
        System.out.println(nfp.getFrameBody());
        nfp.switchToParent();
        nfp.switchToParent();
        nfp.switchToFrameBottom();
        System.out.println(nfp.getFrameBody());
    }
}
