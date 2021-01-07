package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage {

    private WebDriver driver;
    private By img =By.cssSelector("img");
    public BrokenImagesPage(WebDriver driver){
        this.driver =driver;

    }

    public void  images(){
    for (WebElement image : driver.findElements(img))
        isImageBroken(image);
    }


    //The function to test for broken images
    public void isImageBroken(WebElement image) {
      if (image.getAttribute("naturalWidth").equals("0"))
         System.out.println(image.getAttribute("outerHTML") + " is broken.");
    }
}
