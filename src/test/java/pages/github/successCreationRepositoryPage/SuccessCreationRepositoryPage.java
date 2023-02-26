package pages.github.successCreationRepositoryPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SuccessCreationRepositoryPage {
    private final By checkSuccessfulCreationRepositoryLocator = By.cssSelector("#empty-setup-clone-url");
    private final By settingButtonLocator = By.cssSelector("#settings-tab");

    public SelenideElement successfulCreationRepositoryPage() {
        return $(checkSuccessfulCreationRepositoryLocator);
    }

    public SelenideElement getSettingButtonLocator() {
        return $(settingButtonLocator);
    }
}
