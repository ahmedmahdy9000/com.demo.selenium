package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListPage {
    private WebDriver driver;
    private By dropdown =By.id("dropdown");
    private By option2 =By.xpath("//*[@id=\"dropdown\"]/option[3]");


    public DropdownListPage(WebDriver driver){ this.driver=driver;}

    public void SelectOption(){
        Select select =new Select(driver.findElement(dropdown));
        select.selectByValue("2");
    }
    public void getSelectedOption(){
        Select select =new Select(driver.findElement(dropdown));
        System.out.println(driver.findElement(option2).isSelected());
    }
}
