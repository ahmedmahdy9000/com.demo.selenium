package Base;

import Pages.Homepage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.EventReporter;
import utils.UtilTest;
import utils.WindowManager;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    public static WebDriver driver;
    private EventFiringWebDriver e_driver;
    public static UtilTest utilTest;
    public static ExtentReports extent;
    public static ExtentTest logger;
    protected Homepage homepage;




    @BeforeClass
    @Parameters({"browser","url"} )
    public void setUp(String browser , String url, Method method ) {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver.exe");
            driver =new ChromeDriver();
            System.out.println("chrome is selected to run");

        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "E:\\selenium\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("FireFox is selected to run");
        }
        //webApplication size
        //Dimension setSize = new Dimension(375, 812);

        e_driver =new EventFiringWebDriver(driver);
        e_driver.register(new EventReporter());
        driver=e_driver;
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(UtilTest.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

        homepage =new Homepage(driver);


    }
    @AfterClass
    public void tearDown()   {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }


    @BeforeMethod
    public void start(Method method) throws InterruptedException, Throwable {

        logger = extent.startTest(method.getName());


    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Throwable {

        if (result.getStatus() == ITestResult.FAILURE) {

            logger.log(LogStatus.FAIL, "Test Failed " + result.getThrowable());
            String picturePath = UtilTest.TakeSnapshot(driver, result.getName());
            logger.log(LogStatus.FAIL, logger.addScreenCapture(picturePath));


        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test case Skipped is " + result.getName());

        } else {
            logger.log(LogStatus.PASS, "Test passed");
            String picturePath = UtilTest.TakeSnapshot(driver, result.getName());
            logger.log(LogStatus.PASS, logger.addScreenCapture(picturePath));

        }

        extent.endTest(logger);


    }
}
