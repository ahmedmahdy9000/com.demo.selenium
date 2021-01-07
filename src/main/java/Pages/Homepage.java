package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
     WebDriver driver;
    private By shiftingContent=By.linkText("Shifting Content");
    private By formAuthentication =By.linkText("Form Authentication");
    private By dropdown =By.linkText("Dropdown");
    private By forgotPassword=By.linkText("Forgot Password");
    private By hover=By.linkText("Hovers");
    private By keyPresses=By.linkText("Key Presses");
    private By horizontalSlider =By.linkText("Horizontal Slider");
    private By dragAndDrop =By.linkText("Drag and Drop");
    private By javaScriptAlerts =By.linkText("JavaScript Alerts");
    private By fileUpload =By.linkText("File Upload");
    private By contextMenu =By.linkText("Context Menu");
    private By entryAd =By.linkText("Entry Ad");
    private By frames=By.linkText("Frames");
    private By multipleWindows=By.linkText("Multiple Windows");
    private By dynamicLoading=By.linkText("Dynamic Loading");
    private By brokenImages=By.linkText("Broken Images");


    public Homepage(WebDriver driver){
    this.driver =driver;
}

    public ShiftingContentPage clickOnShifting(){
        driver.findElement(shiftingContent).click();
        return new ShiftingContentPage(driver);
    }
    public LoginPage clickOnFormAuthentication(){
    driver.findElement(formAuthentication).click();
    return new LoginPage(driver);
    }
    public DropdownListPage clickOnDropdown(){
    driver.findElement(dropdown).click();
    return new DropdownListPage(driver);
    }
    public DropdownPage clickDropdown(){
        driver.findElement(dropdown).click();
        return new DropdownPage(driver);
    }
    public ForgotPasswordPage clickOnForgotPassword(){
        driver.findElement(forgotPassword).click();
        return new ForgotPasswordPage(driver);
    }
    public HoversPage clickOnHovers(){
        driver.findElement(hover).click();
        return new HoversPage(driver);
    }
    public KeyPressesPage clickOnKeyPresses(){
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickOnHorizontalSlider (){
        driver.findElement(horizontalSlider).click();
        return new HorizontalSliderPage(driver);
    }
    public DragAndDropPage clickOnDragAndDrop(){
        driver.findElement(dragAndDrop).click();
        return new DragAndDropPage(driver);
    }
    public JavaScriptAlertsPage clickOnJavaScriptAlerts(){
        driver.findElement(javaScriptAlerts).click();
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickOnFileUpload(){
        driver.findElement(fileUpload).click();
        return new FileUploadPage(driver);
    }
    public ContextMenuPage clickOnContextMenu (){
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }
    public EntryAdPage clickOnEntryAd(){
        driver.findElement(entryAd).click();
        return new EntryAdPage(driver);
    }
    public FramesPage clickOnFrames(){
        driver.findElement(frames).click();
        return new FramesPage(driver);
    }
    public MultipleWindowsPage clickOnMultipleWindows(){
        driver.findElement(multipleWindows).click();
        return new MultipleWindowsPage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoading(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }
    public BrokenImagesPage clickONBrokenImages(){
        driver.findElement(brokenImages).click();
        return new BrokenImagesPage(driver);
    }
}
