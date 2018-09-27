package Soglasie;

import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {


    @BeforeSuite
    public void setUp(){
        ScreenShooter.captureSuccessfulTests = false;
    }

    @BeforeMethod
    public void initWebDriver() {

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

    }
}
