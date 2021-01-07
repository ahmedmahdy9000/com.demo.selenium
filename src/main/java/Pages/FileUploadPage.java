package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {

    private WebDriver driver ;
    private By fileUpload= By.id("file-upload");
    private By fileSubmit= By.id("file-submit");

    public FileUploadPage(WebDriver driver){this.driver=driver;}

    public void setFileUpload(String path){
        driver.findElement(fileUpload).sendKeys(path);
    }
    public FileUploadedPage clickOnSubmitBtn(){
        driver.findElement(fileSubmit).click();
        return new FileUploadedPage(driver);
    }

}
