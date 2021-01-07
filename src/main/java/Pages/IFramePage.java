package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {
    private WebDriver driver ;
    private String iframe ="mce_0_ifr";
    private By textBox= By.id("tinymce");
    private By alignCenter =By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]");

    public IFramePage(WebDriver driver){this.driver =driver ;}

    public void switchToFrame(){
        driver.switchTo().frame(iframe);

    }
    public  void clearTextBox(){
        driver.findElement(textBox).clear();
    }
    public  void setTextBox(String text){
        driver.findElement(textBox).sendKeys(text);
    }
    public String getTextBox(){
        return driver.findElement(textBox).getText();
    }

    public void AlignCenter(){
        driver.findElement(alignCenter).click();
    }
    public void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }



}
