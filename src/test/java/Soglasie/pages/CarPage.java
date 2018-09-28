package Soglasie.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class CarPage extends Page {

    private final int timeoutMsec = 5000;

    @FindBy(how = How.CSS, using = "#s2id_autogen3")
    private SelenideElement markInput;

    @FindBy(how = How.XPATH, using = "//div[@ng-model='car.productionYear']//input[@type='search']")
    private SelenideElement yearProduction;

    @FindBy(how = How.XPATH, using = "//div[@ng-model='car.usageYear']//input[@type='search']")
    private SelenideElement yearExpl;

    @FindBy(how = How.XPATH, using = "//div[@ng-if]//input[@type='text']")
    private SelenideElement carPower;



    public void inputCar(String year){

        markInput.setValue("Kia Rio").pressEnter();
        yearInput(year, yearProduction);
        yearInput(year, yearExpl);
        powerCar();

    }

    private void yearInput(String year, SelenideElement input) {
        input.waitUntil(Condition.visible, timeoutMsec);
        input.setValue(year).pressEnter();
    }



    public void powerCar() {
        carPower.waitUntil(Condition.visible, timeoutMsec);
        carPower.setValue("145").pressTab();
    }
}
