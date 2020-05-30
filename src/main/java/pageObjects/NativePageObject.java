package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativePageObject {

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/add_new_expense")
    WebElement addNewExpenseBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    WebElement emailInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    WebElement usernameInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    WebElement passwordInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    WebElement confirmInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    WebElement registerNewAccountBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    WebElement emailAuthInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    WebElement passwordAuthInput;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    WebElement signInBtn;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    WebElement registerBtn;

    public NativePageObject(AppiumDriver appiumDriver) {
        PageFactory.initElements( new AppiumFieldDecorator(appiumDriver), this);
    }

}
