package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ProfileAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProfileAdminSteps {
    private WebDriver webDriver;

    public ProfileAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("Admin click Profile on Navigation Bar")
    public void adminClickProfileOnNavigationBar() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.clickProfile();
        Thread.sleep(2000);
    }

    @Then("System will be showing Profile page")
    public void systemWillBeShowingProfilePage() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.profilePageIsDisplayed();
        Assert.assertTrue(profilePage.profilePageIsDisplayed());
        Thread.sleep(3000);
    }

    @And("Admin successfully on Profile page")
    public void adminSuccessfullyOnProfilePage() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.profilePageIsDisplayed();
        Assert.assertTrue(profilePage.profilePageIsDisplayed());
        Thread.sleep(3000);
    }

    @And("Admin click Update Profile button")
    public void adminClickUpdateProfileButton() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.clickUpdateCompany();
        Thread.sleep(2000);
    }

    @Then("System will be showing pop-up for edit company profile")
    public void systemWillBeShowingPopUpForEditCompanyProfile() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.updatePopUpIsDisplayed();
        Assert.assertTrue(profilePage.updatePopUpIsDisplayed());
        Thread.sleep(3000);
    }

    @When("Admin change Name field to \"([^\"]*)\"")
    public void adminChangeNameFieldTo(String cpyName) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanyName(cpyName);
        Thread.sleep(1000);
    }

    @And("Admin change Phone field to \"([^\"]*)\"")
    public void adminChangePhoneFieldTo(String cpyPhone) throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanyPhone(cpyPhone);
        Thread.sleep(1000);
    }

    @And("Admin change Email field to \"([^\"]*)\"")
    public void adminChangeEmailFieldTo(String cpyEmail) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanyEmail(cpyEmail);
        Thread.sleep(1000);
    }

    @And("Admin change Social Media field to \"([^\"]*)\"")
    public void adminChangeSocialMediaFieldTo(String cpySocMed) throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanySocmed(cpySocMed);
        Thread.sleep(1000);
    }

    @And("Admin change Address field to \"([^\"]*)\"")
    public void adminChangeAddressFieldTo(String cpyAddress) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanyAddress(cpyAddress);
        Thread.sleep(1000);
    }

    @And("Admin change Description field to \"([^\"]*)\"")
    public void adminChangeDescriptionFieldTo(String cpyDesc) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.setCompanyDesc(cpyDesc);
        Thread.sleep(1000);
    }

    @And("Admin change Select Picture field to \"([^\"]*)\"")
    public void adminChangeSelectPictureFieldTo(String photoName) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
       // profilePage.clickAddPhoto();
        profilePage.setCompanyLogo(photoName);
        Thread.sleep(2000);
    }

    @And("Admin click Submit button")
    public void adminClickSubmitButton() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.clickSubmitUpdate();
        Thread.sleep(2000);
    }

    @Then("System will be showing pop-up message \"([^\"]*)\"")
    public void systemWillBeShowingPopUpMessage(String msgSubmit) throws InterruptedException {
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        Assert.assertEquals(msgSubmit, profilePage.getMsgSubmit());
        Thread.sleep(3000);
    }

    @And("Admin click Cancel button")
    public void adminClickCancelButton() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.clickCancelUpdate();
        Thread.sleep(2000);
    }

    @Then("System will be showing Profile")
    public void systemWillBeShowingProfile() throws InterruptedException{
        ProfileAdminPage profilePage = new ProfileAdminPage(webDriver);
        profilePage.profileIsDisplayed();
        Assert.assertTrue(profilePage.profileIsDisplayed());
        Thread.sleep(3000);
    }
}
