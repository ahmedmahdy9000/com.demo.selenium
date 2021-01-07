package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

  private WebDriver driver ;
  private String frameTop ="frame-top";
  private String frameLeft="frame-left";
  private String frameBottom="frame-bottom";
  private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
            this.driver =driver ;
        }

    public void switchToFrameTop(){
        driver.switchTo().frame(frameTop);
}
    public void switchToFrameLeft(){
        driver.switchTo().frame(frameLeft);
    }
    public void switchToFrameBottom(){
        driver.switchTo().frame(frameBottom);
    }
    public void switchToParent(){
        driver.switchTo().parentFrame();
    }
    public String getFrameBody(){
        return driver.findElement(body).getText();
    }

}
