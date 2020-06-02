package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject  {

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchInput;

    @FindBy(xpath = "//button[@class='Tg7LZd']")
    WebElement searchBtn;

    @FindBy(css = "#rso > div")
    WebElement searchResults;

    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);

    }


}
