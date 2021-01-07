package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoversPage {
    private WebDriver driver;
    private By figure = By.className("figure");
    private By text =By.tagName("h5");

    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    public void hoverOverFigure(int indexFig,int indexTxt){

        WebElement fig =driver.findElements(figure).get(indexFig -1);
        Actions action =new Actions(driver) ;
        action.moveToElement(fig).build().perform();
        WebElement userText =driver.findElements(text).get(indexTxt -1);
        System.out.println(userText.getText());


    }
}
