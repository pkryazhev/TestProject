package Soglasie;

import Soglasie.pages.CalcPage;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleTestNgTest extends TestNgTestBase {

    private CalcPage calcPage;

    @BeforeMethod
    public void initPageObjects() {
        calcPage = PageFactory.initElements(driver, CalcPage.class);    //создает экземпляр класса CalcPage  через фабрику selenium и инициалзация @FindBy
    }

    @Test
    public void calcTest() throws Exception {

        driver.get(baseUrl);  //переход на сайт
        calcPage.open();      //переход на страницу   avto/kalkulyator-kasko/#/car
    }
}
