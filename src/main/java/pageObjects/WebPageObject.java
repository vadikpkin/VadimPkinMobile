package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject  {

    @FindBy(css = "#tsf > div:nth-child(2) > div.A7Yvie.emca > div.zGVn2e > div > div.a4bIc > input")
    WebElement chromeSearchBox;


    public WebPageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);

    }


}
