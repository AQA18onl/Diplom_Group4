package pages.github.loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final By userNameInputLocator = By.cssSelector("#login_field");
    private final By passwordInputLocator = By.cssSelector("#password");
    private final By loginButtonLocator = By.className("js-sign-in-button");

    public SelenideElement getUserNameInputLocator() {
        return $(userNameInputLocator);
    }
    public SelenideElement getPasswordInputLocator() {
        return $(passwordInputLocator);
    }
    public SelenideElement getLoginButtonLocator() {
        return $(loginButtonLocator);
    }
}
