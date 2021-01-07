package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DynamicLoadingPage {
    private WebDriver driver;
    private By exampl1 = By.linkText("Example 1: Element on page that is hidden");
    private By exampl2 = By.linkText("Example 2: Element rendered after the fact");
    private By start =By.xpath("//*[@id='start']/button");

    private By loading =By.xpath("//*[@id='loading']/img");
    private By text =By.id("finish");
    public DynamicLoadingPage(WebDriver driver){
        this.driver =driver ;
    }


    public void clickOnExample1(){

        driver.findElement(exampl1).click();
    }


    public void clickStart(){
        driver.findElement(start).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);

         wait.until(ExpectedConditions.textToBe(
                 By.id("finish"), "Hello World!"));


    }

         public String getText(){

        return driver.findElement(text).getText();
    }
}
