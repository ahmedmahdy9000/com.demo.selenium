package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShiftingContentImagePage {
    private WebDriver driver;
    private By image=By.xpath("//*[@id=\"content\"]/div/img");

    public ShiftingContentImagePage(WebDriver driver) {
        this.driver =driver ;
    }
    public void imageIsDisplayed(){
        System.out.println(driver.findElement(image).isDisplayed());

    }

}
