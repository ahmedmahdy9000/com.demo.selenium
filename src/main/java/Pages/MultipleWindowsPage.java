package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By newWindow= By.linkText("Click Here");
    private By text =By.tagName("h3");
    public MultipleWindowsPage(WebDriver driver){
        this.driver =driver;
    }
    public void openNewWindow(){
        driver.findElement(newWindow).click();
    }
    public void handleNewWindow(){
        Set<String> id =driver.getWindowHandles();
        Iterator<String> i =id.iterator();
        String parent = i.next();
        String child = i.next();
        driver.switchTo().window(child);

    }
    public String getTittlePage(){
        return driver.getTitle();
    }
    public String getTextPage(){
        return driver.findElement(text).getText();
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
