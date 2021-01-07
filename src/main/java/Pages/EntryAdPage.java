package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
    private WebDriver driver;
    private By closeAd =By.xpath("//*[@id='modal']/div[2]/div[3]/p");
    private By tittleAd =By.xpath("//*[@id='modal']/div[2]/div[1]/h3");
    private By tittlePage =By.xpath("//*[@id='content']/div[1]/h3");

    public EntryAdPage(WebDriver driver){
        this.driver =driver ;
    }
    public void closeAd(){

        driver.findElement(closeAd).click();
    }
    public String getTittle(){
        return driver.findElement(tittleAd).getText();
    }
    public String getTittlePage(){
        return driver.findElement(tittlePage).getText();

    }
}
