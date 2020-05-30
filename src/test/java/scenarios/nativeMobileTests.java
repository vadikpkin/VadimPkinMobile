package scenarios;

import org.testng.annotations.Test;
import setup.BaseTest;
import setup.IPageObject;

import static org.testng.Assert.assertTrue;
import static util.PropertiesSingletone.getPropertyByName;

public class nativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "Registration new user and then login as that user test")
    public void registrationAndLoginTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        IPageObject po = getPo();
        //Register new user
        String username = getPropertyByName("username");
        String email = getPropertyByName("email");
        String password = getPropertyByName("password");
        po.getWelement("registerBtn").click();
        po.getWelement("emailInput").sendKeys(email);
        po.getWelement("usernameInput").sendKeys(username);
        po.getWelement("passwordInput").sendKeys(password);
        po.getWelement("confirmInput").sendKeys("testPassword");
        po.getWelement("registerNewAccountBtn").click();
        //Sign in
        po.getWelement("emailAuthInput").sendKeys(email);
        po.getWelement("passwordAuthInput").sendKeys(password);
        po.getWelement("signInBtn").click();
        //Asserting that Activity budget page is opened
        assertTrue(po.getWelement("addNewExpenseBtn").isDisplayed(), "Activity budget page is not opened");
    }
}
