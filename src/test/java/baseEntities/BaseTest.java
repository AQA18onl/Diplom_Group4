package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import steps.github.navigation.NavigationSteps;
import steps.github.repository.RepositorySteps;
import steps.github.user.UserSteps;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected NavigationSteps navigationSteps;
    protected RepositorySteps repositorySteps;
    protected UserSteps userSteps;


    @BeforeSuite
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = ReadProperties.browserName();
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 15000;
        Configuration.fastSetValue = false;

        open("/");

        navigationSteps = new NavigationSteps();
        repositorySteps = new RepositorySteps();
        userSteps = new UserSteps();

//        Configuration.assertionMode = AssertionMode.SOFT;
//        Configuration.headless = true;
//        Configuration.reportsFolder = "target/";
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
