package steps.github.repository;

import model.Repository;
import pages.github.repository.CreateRepositoryPage;
import pages.github.repository.DownloadFilePage;
import pages.github.repository.RepositorySettingsPage;
import pages.github.repository.SuccessCreationRepositoryPage;
import steps.github.navigation.NavigationSteps;

import java.io.File;

public class RepositorySteps {
    private CreateRepositoryPage createRepositoryPage;
    private RepositorySettingsPage repositorySettingsPage;
    private SuccessCreationRepositoryPage successCreationRepositoryPage;
    private DownloadFilePage downloadFilePage;

    public RepositorySteps() {
        createRepositoryPage = new CreateRepositoryPage();
        repositorySettingsPage = new RepositorySettingsPage();
        successCreationRepositoryPage = new SuccessCreationRepositoryPage();
        downloadFilePage = new DownloadFilePage();
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

    public RepositorySteps chooseFileButtonClick() {
        successCreationRepositoryPage.getProceedToFileDownloadButton().click();
        return this;
    }

    public DownloadFilePage downloadFile() {
        downloadFilePage.getChooseFileButtonLocator().uploadFile(new File("src/test/resources/picture.jpg"));
        return downloadFilePage;
    }
}
