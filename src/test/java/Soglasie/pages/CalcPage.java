package Soglasie.pages;

import Soglasie.SuiteConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

/**
 * Sample page
 */
public class CalcPage extends Page {

  @FindBy(how = How.CSS, using = "#s2id_autogen3")
  private WebElement markInput;

  public CalcPage(WebDriver webDriver) {
    super(webDriver);
  }

  public void open() throws IOException {
      SuiteConfiguration config = new SuiteConfiguration();
      String baseUrl = config.getProperty("site.url");
      driver.get(baseUrl + "avto/kalkulyator-kasko/#/car");

      //markInput дождаться

  }
}
