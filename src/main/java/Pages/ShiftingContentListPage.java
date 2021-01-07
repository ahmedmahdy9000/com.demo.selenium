package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentListPage {
    private WebDriver driver;
   private By gettext=By.xpath("//*[@id=\"content\"]/div/div/div");
    public ShiftingContentListPage(WebDriver driver){
        this.driver =driver ;
    }
    public void GetText(){
        System.out.println(driver.findElement(gettext).getText());
    }
}
