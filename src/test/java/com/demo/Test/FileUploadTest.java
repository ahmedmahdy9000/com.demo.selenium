package com.demo.Test;

import Base.BaseTest;
import Pages.FileUploadPage;
import Pages.FileUploadedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class FileUploadTest extends BaseTest {
    protected FileUploadPage fup;
    protected FileUploadedPage fudp;



    @Test
    public void VerifyUploadFile(Method method){
        fup = homepage.clickOnFileUpload();
        fup.setFileUpload("E:\\selenium\\uploadfile\\powerful.jpg");
        fudp = fup.clickOnSubmitBtn();
        System.out.println(fudp.getUploadedStatus());
        Assert.assertTrue(fudp.getUploadedStatus()
                .contains("powerful"),"wrong file uploded");
    }
}
