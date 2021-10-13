package com.blogspot.automatethebox.application.facebook.pages;

import com.google.common.base.Preconditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.testng.Assert.assertTrue;

/**
 * @author Lalit Kumar Narnaulia
 * https://automatethebox.blogspot.com
 */
public class LoginPageImpl extends LoadableComponent<LoginPageImpl> implements LoginPage {

    // Page Elements.
    private WebElement email;
    private WebElement pass;
    private WebElement login;

    // Driver instance.
    private WebDriver driver;

    public LoginPageImpl(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {
        driver.get(APP_URL);
    }

    @Override
    protected void isLoaded() throws Error {
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.toLowerCase().contains(APP_TITLE_STRING),
            "Facebook login page not loaded again");
    }

    @Override
    
    public HomePage loginAs(String emailOrPhone, String password) {
        Preconditions.checkNotNull(emailOrPhone, "Email or phone number parameter is null");
        Preconditions.checkNotNull(password, "Password parameter is null");

        email.sendKeys("0788133164");
        pass.sendKeys("123@abc");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        login.click();
        return new HomePageImpl(driver);
    }
}
