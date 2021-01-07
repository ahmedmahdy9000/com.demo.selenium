package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    private WebDriver driver;
    private By picA =By.id("column-a");
    private By picB =By.id("column-b");
    private By header =By.tagName("header");


    public DragAndDropPage(WebDriver driver){this.driver=driver;}
    public void dragAndDrop(){
        Actions action =new Actions(driver);
        WebElement A =driver.findElement(picA);
        WebElement B =driver.findElement(picB);
        action.dragAndDrop(A ,B).build().perform();
        action.clickAndHold(B).moveToElement(A).release().build().perform();
        }
    public String getSourceHeader(){
        return driver.findElement(header).getText();
    }
}
