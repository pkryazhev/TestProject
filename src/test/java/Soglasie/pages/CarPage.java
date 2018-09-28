package Soglasie.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
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

    @FindBy(how = How.XPATH, using = "//input[@value = \"200000\" and @type=\"text\" and @data-mask = 'numberSeparate']")
    private SelenideElement carCost;

    @FindBy(how = How.XPATH, using = "//span[  contains(@class, 'ui-slider-handle')  ]")
    private SelenideElement carCostSlider;

    @FindBy(how = How.XPATH, using = "//a[contains(@class, 'b-car-info__next-link button-filled')]")
    private SelenideElement buttonAccept;





    public void inputCar(String year, String power, String cost){

        markInput.setValue("Kia Rio").pressEnter();
        yearInput(year, yearProduction);
        yearInput(year, yearExpl);
        powerCar(power);
        costInput(cost);

    }

    private void yearInput(String year, SelenideElement input) {
        input.waitUntil(Condition.visible, timeoutMsec);
        input.setValue(year).pressEnter();
    }



    public void powerCar(String power) {
        carPower.waitUntil(Condition.visible, timeoutMsec);
        carPower.setValue(power).pressTab();
    }

    public void costInput(String cost){
        carCost.waitUntil(Condition.visible, timeoutMsec);
        carCost.click();
        for(int i = 0; i < 15; i++){
            carCost.sendKeys(Keys.BACK_SPACE);
        }
        carCost.sendKeys(cost);
        carCostSlider.click();
        buttonAccept.click();
    }
}
