package Soglasie.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sample page
 */
public class DriversPage extends Page {

    private final int timeoutMsec = 5000;

    @FindBy(css = "div.b-driver-info__drivers-title")
    private SelenideElement header;

    @FindBy(xpath = "//div[@class='b-calc-header__scale-text' and text()='Водители']")
    private SelenideElement circleOPen;

    @FindBy(xpath = "//span[contains(@class, 'b-switcher__switcher')]")
    private SelenideElement driverSwitcher;

    @FindBy(xpath = "//div[contains(@class, 'b-driver-info__form-remark')]")
    private SelenideElement driverInfoLabel;


    @FindBy(xpath = "//input[@ng-model=\"drivers.data.minAge\"]")
    private SelenideElement driversMinAge;

    @FindBy(xpath = "//input[@ng-model=\"drivers.data.minExp\"]")
    private SelenideElement driversMinExp;

    @FindBy(xpath = "(//div[@class='b-radio-group__text' and text()='Нет'])[1]")
    private SelenideElement setCreditNo;


    public void setDriversList(){
        driverSwitcher.click();
        driverInfoLabel.waitUntil(Condition.visible, timeoutMsec);
    }

    public void setDriversConditions(String age, String exp){
        driversMinAge.setValue(age).pressEnter();
        driversMinExp.setValue(exp);
    }

    public void setCredit(){
        setCreditNo.click();
    }

    public void open(){

        circleOPen.click();
        header.waitUntil(Condition.visible, timeoutMsec);
    }


}
