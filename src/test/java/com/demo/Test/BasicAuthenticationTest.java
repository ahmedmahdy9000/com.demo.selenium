package com.demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BasicAuthenticationTest {

private WebDriver driver ;
    @Test
    public void handleBasicAndDigestAuth() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\selenium\\drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        String appUrl = "http://admin:admin@the-internet.herokuapp.com/basic_auth/";

        driver.manage().window().maximize();
        driver.get(appUrl);

        System.out.println(driver.findElement(By.className("example")).getText());
    }
    @AfterMethod
    private void tearDown(){
        driver.quit();
    }
}
