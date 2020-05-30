package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.BaseTest;

import static org.testng.Assert.assertTrue;
import static util.PropertiesSingletone.getPropertyByName;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Doing google search and asserting result")
    public void googleSearchTest() {
        // open Google homepage
        getDriver().get(getPropertyByName("url"));
        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        //Entering EPAM to search input and clicks search button
        String search = "EPAM";
        getDriver().findElement(By.xpath("//input[@name='q']")).sendKeys(search);
        getDriver().findElement(By.xpath("//button[@class='Tg7LZd']")).click();
        //Asserting search results
        WebElement result = getDriver().findElement(By.cssSelector("#rso > div"));
        assertTrue(result.getText().contains(search), "Search result is not expected");
    }
}
