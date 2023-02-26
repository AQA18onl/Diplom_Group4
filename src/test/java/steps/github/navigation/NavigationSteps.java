package steps.github.navigation;

import pages.github.createRepositoryPage.CreateRepositoryPage;
import pages.github.listRepositoriesPage.ListRepositoriesPage;
import pages.github.menuPage.MenuPage;
import pages.github.mainPage.MainPage;
import pages.github.repositorySettingsPage.RepositorySettingsPage;
import pages.github.successCreationRepositoryPage.SuccessCreationRepositoryPage;
import steps.github.repository.RepositorySteps;
import steps.github.user.UserSteps;

public class NavigationSteps {
    private MainPage mainPage;
    private MenuPage menuPage;
    private SuccessCreationRepositoryPage successCreationRepositoryPage;
    private CreateRepositoryPage createRepositoryPage;
    private RepositorySettingsPage repositorySettingsPage;

    public NavigationSteps() {
        mainPage = new MainPage();
        menuPage = new MenuPage();
        successCreationRepositoryPage = new SuccessCreationRepositoryPage();
        createRepositoryPage = new CreateRepositoryPage();
        repositorySettingsPage = new RepositorySettingsPage();
    }

    public UserSteps clickSignInButtonOnMainPage() {
        mainPage.getSignInButtonLocator().click();
        return new UserSteps();
    }

    public RepositorySteps clickNewRepositoryButton() {
        menuPage.getIconPlusButtonLocator().click();
        menuPage.getNewRepositoryButtonLocator().click();
        return new RepositorySteps();
    }

    public SuccessCreationRepositoryPage clickCreateButton() {
        createRepositoryPage.getCreateRepositoryButtonLocator().click();
        return successCreationRepositoryPage;
    }

    public NavigationSteps clickCreateButton2() {
        createRepositoryPage.getCreateRepositoryButtonLocator().click();
        return this;
    }

    public NavigationSteps clickSettingButton() {
        successCreationRepositoryPage.getSettingButtonLocator().click();
        return this;
    }

    public RepositorySteps clickDeleteRepositoryButton() {
        repositorySettingsPage.getDeleteRepositoryButtonLocator().click();
        return new RepositorySteps();
    }

    public ListRepositoriesPage deleteRepositoryButton() {
        repositorySettingsPage.getConfirmDeleteRepositoryButtonLocator().click();
        return new ListRepositoriesPage();
    }
}
