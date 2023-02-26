package steps.github.user;

import model.User;
import pages.github.loginPage.LoginPage;
import steps.github.navigation.NavigationSteps;

public class UserSteps {
    private LoginPage loginPage;

    public UserSteps() {
        loginPage = new LoginPage();
    }

    public UserSteps loginGitHub(String userName, String password) {
        loginPage.getUserNameInputLocator().setValue(userName);
        loginPage.getPasswordInputLocator().setValue(password);
        loginPage.getLoginButtonLocator().click();
        return this;
    }

    public NavigationSteps loginSuccessfulGitHub(User user) {
        loginGitHub(user.getUserName(), user.getPassword());
        return new NavigationSteps();
    }
}
