package Soglasie.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.Generator;
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

    @FindBy(xpath = "//span[@class='b-switcher__unchecked-val']")
    private SelenideElement driverSwitcher;

    @FindBy(xpath = "//div[contains(@class, 'b-driver-info__form-remark')]")
    private SelenideElement driverInfoLabel;

    @FindBy(xpath = "//input[@ng-model=\"drivers.data.minAge\"]")
    private SelenideElement driversMinAge;

    @FindBy(xpath = "//input[@ng-model=\"drivers.data.minExp\"]")
    private SelenideElement driversMinExp;

    @FindBy(xpath = "(//div[@class='b-radio-group__text' and text()='Нет'])[1]")
    private SelenideElement setCreditNo;

    @FindBy(xpath = "(//div[@class='b-radio-group__text' and text()='Да'])[2]")
    private SelenideElement setSateliteSystem;

    @FindBy(xpath = "//div[@ng-model='drivers.data.rps']//input[@type = 'search']")
    private SelenideElement inputSateliteSystem;

    @FindBy(xpath = "//input[@data-mask='rusNameMask' and @placeholder='Имя']")
    private SelenideElement inputDriverName;

    @FindBy(xpath = "//input[@placeholder='Контактный телефон']")
    private SelenideElement inputDriverPhoneNumber;

    @FindBy(xpath = "//div[@class='b-driver-info ng-isolate-scope']//a[@data-val='Москва']")
    private SelenideElement inputDriverCity;

    @FindBy(xpath = "//div[@class='u-mask-scope b-driver-info__confirm car'] //div[@class='b-checkbox__icon']")
    private SelenideElement confirmCheckBox;

    @FindBy(xpath = "//a[@class='c-calc__next button-filled submit_drivers']")
    private SelenideElement acceptButton;


    public void setDriversList(){
        //Без него работает только в debug-режиме
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        driverSwitcher.click();
        driverInfoLabel.waitUntil(Condition.visible, timeoutMsec);
    }

    public void setDriversConditions(String age, String exp){
        driversMinAge.setValue(age).pressTab();
        driversMinExp.setValue(exp).pressTab();
    }

    public void setCredit(){
        setCreditNo.click();
    }

    public void setSateliteSystem(String sateliteSystem){
        setSateliteSystem.waitUntil(Condition.visible, timeoutMsec);
        setSateliteSystem.click();
        inputSateliteSystem.setValue(sateliteSystem);
        inputSateliteSystem.pressTab();
    }

    public void setContactData(){
        inputDriverName.click();
        inputDriverName.setValue(Generator.getRandomString());
        inputDriverName.pressTab();
        inputDriverPhoneNumber.setValue(Generator.getRandomPhoneNumber());
        inputDriverPhoneNumber.pressTab();
        inputDriverCity.click();
    }

    public void confirmDriversData(){
        confirmCheckBox.waitUntil(Condition.visible, timeoutMsec);
        confirmCheckBox.click();
        acceptButton.click();

    }

    public void open(){

        circleOPen.click();
        header.waitUntil(Condition.visible, timeoutMsec);
    }


}
