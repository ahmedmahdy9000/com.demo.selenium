package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {

    WebDriver driver;
    private By menuElementlink=By.linkText("Example 1: Menu Element");
    private By anImageLink=By.linkText("Example 2: An image");
    private By listLink=By.linkText("Example 3: List");

    public ShiftingContentPage(WebDriver driver) {
        this.driver=driver;
    }

    public ShiftingContentMenuElementPage ClickOnMenuElement(){
        driver.findElement(menuElementlink).click();
        return new ShiftingContentMenuElementPage(driver);

    }
    public ShiftingContentImagePage ClickOnAnImage(){
        driver.findElement(anImageLink).click();
        return new ShiftingContentImagePage(driver);

    }
    public ShiftingContentListPage ClickOnList(){
        driver.findElement(listLink).click();
        return new ShiftingContentListPage(driver);
    }
}
