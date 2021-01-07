package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){this.driver=driver;}
    private By enterEmail =By.id("email");
    private By reBtn =By.id("form_submit");

    public void setEmailToResetPassword(String emailo){
        driver.findElement(enterEmail).sendKeys(emailo);

    }
    public void GetText(){
        System.out.println(driver.findElement(enterEmail).getText());
    }
    public SentEmailpage clickOnRetrieve(){
        driver.findElement(reBtn).click();
     return new  SentEmailpage(driver);
    }
}
