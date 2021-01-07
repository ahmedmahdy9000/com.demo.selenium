package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage {
    private WebDriver driver;
    private By logoutBtn= By.xpath("//*[@id=\"content\"]/div/a");
    private  By loginStatusAlert=By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver =driver;
    }

    public void getLoginStatusAlert() {
       String actualresult= driver.findElement(loginStatusAlert).getText();
        Assert.assertTrue( actualresult.contains("You logged into a secure area!"),"message not same");
    }
    public void clickOnLogout(){
        driver.findElement(logoutBtn).click();
    }
}
