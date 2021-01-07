package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingContentMenuElementPage {
    WebDriver driver;
    private By elements=By.tagName("li");

    public ShiftingContentMenuElementPage(WebDriver driver) {
        this.driver =driver ;
    }

    public void getSizeOfElement(){
        List <WebElement> icons =driver.findElements(elements);
        System.out.println("number of displyed icon is : "+ icons.size());

    }
    public void back(){
        driver.navigate().back();
    }
}
