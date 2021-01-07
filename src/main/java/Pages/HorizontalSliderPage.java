package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver ;
    private  By slider = By.xpath("//*[@id='content']/div/div/input");
    private  By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver =driver ;
    }
    public void moveSlider(Keys key){
        driver.findElement(slider).sendKeys(key);
    }
    public String getRange(){
     return    driver.findElement(range).getText();
    }
}
