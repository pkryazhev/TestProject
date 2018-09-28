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


    public void drivers(){

    }

    public void open(){

        circleOPen.click();
        header.waitUntil(Condition.visible, timeoutMsec);

    }


}
