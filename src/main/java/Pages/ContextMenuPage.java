package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By table = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){this.driver=driver;}

    public void clickOnBox(){
        Actions action =new Actions(driver);
        WebElement box =driver.findElement(table);
        action.contextClick(box).perform();
    }
    public void handleAlert(){

        driver.switchTo().alert().accept();
    }
    public String getText(){
       return driver.switchTo().alert().getText();
    }


}
