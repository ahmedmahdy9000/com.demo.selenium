package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By textBox =By.id("target");
    private By result =By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver =driver ;
    }
    public void EnterKeys(String text){
        driver.findElement(textBox).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
