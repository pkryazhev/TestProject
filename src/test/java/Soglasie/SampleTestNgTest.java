package Soglasie;

import Soglasie.pages.CarPage;
import Soglasie.pages.DriversPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNgTest extends TestNgTestBase {

    private CarPage calcPage;
    private DriversPage driversPage;


    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"2016", "145", "550000"},
/*                    {"2017"},
                    {"2018"}*/
        };
    }

    @BeforeMethod
    public void initPageObjects() {
        calcPage = Selenide.open("avto/kalkulyator-kasko/#/car", CarPage.class);
        driversPage = Selenide.page(DriversPage.class);
    }

    @Test(dataProvider = "getData")
    public void calcTest(String year, String power, String cost) throws Exception {

        calcPage.inputCar(year, power, cost);
        //driversPage.open();
       // driversPage.drivers();
    }
}
