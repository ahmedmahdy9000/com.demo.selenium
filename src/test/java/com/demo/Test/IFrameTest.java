package com.demo.Test;

import Base.BaseTest;
import Pages.FramesPage;
import Pages.IFramePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class IFrameTest extends BaseTest {
    protected FramesPage fp;
    protected IFramePage ifp;



    @Test
    public void TypeTextInsideFrame(Method method) throws InterruptedException {
        fp =homepage.clickOnFrames();
        ifp=fp.clickOnIFrame();
        ifp.switchToFrame();
        ifp.clearTextBox();
        ifp.setTextBox(Keys.SHIFT+"automation");
        System.out.println(ifp.getTextBox());
        ifp.switchToMainFrame();
        ifp.AlignCenter();
    }
}
