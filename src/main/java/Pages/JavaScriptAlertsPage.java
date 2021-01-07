package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsPage {
    private WebDriver driver ;
    private By jsAlert = By.xpath("//*[@id='content']/div/ul/li[1]/button");
    private By jsConfirm = By.xpath("//*[@id='content']/div/ul/li[2]/button");
    private By jsPrompt = By.xpath("//*[@id='content']/div/ul/li[3]/button");
    private By result = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){this.driver=driver;}

    public void clickOnJsAlert(){
        driver.findElement(jsAlert).click();
        driver.switchTo().alert().accept();
    }
    public void clickOnJsConfirm(){
        driver.findElement(jsConfirm).click();
        driver.switchTo().alert().dismiss();
    }
    public void clickOnJsPrompt(String message){
        driver.findElement(jsPrompt).click();
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }
    public String getStatus(){
        return driver.findElement(result).getText();
    }

}
