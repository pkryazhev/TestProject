package Soglasie.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

/**
 * Sample page
 */
public class CalcPage extends Page {

    @FindBy(how = How.CSS, using = "#s2id_autogen3")
    private SelenideElement markInput;

    @FindBy(how = How.XPATH, using = "//div[@ng-model='car.productionYear']//input[@type='search']")
    private SelenideElement yearProduction;


    public void inputCar(String year){

        markInput.setValue("Kia Rio").pressEnter();
        int timeout = 5000;
        productionYear(year, timeout);

    }

    private void productionYear(String year, int timeout) {
        yearProduction.waitUntil(Condition.visible, timeout);
        yearProduction.setValue(year).pressEnter();
        SelenideElement yearSpan = $(By.xpath("//div[@ng-model='car.productionYear']//span[text()='"+year+"']"));
        yearSpan.waitUntil(Condition.visible, timeout);
    }
}
