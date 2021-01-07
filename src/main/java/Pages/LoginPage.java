package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName=By.id("username");
    private By passWord=By.id("password");
    private By loginBtn=By.xpath("//*[@id=\"login\"]/button");

    public LoginPage(WebDriver driver){
        this.driver =driver ;
    }
    public void setUserName(String username){
        driver.findElement(userName).sendKeys(username);

    }
    public void setPassWord(String password){
        driver.findElement(passWord).sendKeys(password);

    }
    public SecureAreaPage clickOnLoginBtn(){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }


}
