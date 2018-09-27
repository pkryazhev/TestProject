package Soglasie;

import Soglasie.pages.CalcPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNgTest extends TestNgTestBase {

    private CalcPage calcPage;


    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"2016"},
/*                    {"2017"},
                    {"2018"}*/
        };
    }

    @BeforeMethod
    public void initPageObjects() {
        calcPage = Selenide.open("avto/kalkulyator-kasko/#/car", CalcPage.class);
    }

    @Test(dataProvider = "getData")
    public void calcTest(String year) throws Exception {
        calcPage.inputCar(year);
    }
}
