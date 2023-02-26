package steps.github.repository;

import model.Repository;
import pages.github.createRepositoryPage.CreateRepositoryPage;
import pages.github.repositorySettingsPage.RepositorySettingsPage;
import steps.github.navigation.NavigationSteps;

public class RepositorySteps {
    private CreateRepositoryPage createRepositoryPage;
    private RepositorySettingsPage repositorySettingsPage;

    public RepositorySteps() {
        createRepositoryPage = new CreateRepositoryPage();
        repositorySettingsPage = new RepositorySettingsPage();
    }

    public NavigationSteps inputInfoRepository(Repository repository) {
        createRepositoryPage.getInputRepositoryNameLocator().click();
        createRepositoryPage.getInputRepositoryNameLocator().setValue(repository.getName());
        createRepositoryPage.getInputDescriptionRepositoryLocator().click();
        createRepositoryPage.getInputDescriptionRepositoryLocator().setValue(repository.getDescription());
        return new NavigationSteps();
    }

    public NavigationSteps inputDataForDeleteRepository(Repository repository) {
        repositorySettingsPage.getInputTextForDeleteRepositoryLocator().click();
        repositorySettingsPage.getInputTextForDeleteRepositoryLocator().setValue(repository.getDeletionInformation());
        return new NavigationSteps();
    }
}
