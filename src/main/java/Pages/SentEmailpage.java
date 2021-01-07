package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SentEmailpage {
    private WebDriver driver;
    private By statusAlert=By.id("content");

    public SentEmailpage(WebDriver driver){this.driver=driver;}

public void verifyStatusAlertIsDisplayed(){
        WebElement message =driver.findElement(statusAlert);
        System.out.println(message.isDisplayed());
        Assert.assertTrue(message.getText().contains("Your e-mail's been sent!"));

}
}
