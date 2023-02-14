package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.EmployeesAdminPage;
import org.example.pageObject.SettingsAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SettingsAdminSteps {

    private WebDriver webDriver;

    public SettingsAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("^Admin click Settings button$")
    public void adminClickSettingsButton() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsSideBar();
        Thread.sleep(1000);
    }

    @Then("^Settings button can be clicked$")
    public void settingsButtonCanBeClicked() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @Then("^System will be showing Settings page$")
    public void systemWillBeShowingSettingsPage() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin input start office hours to \"([^\"]*)\"$")
    public void adminInputStartOfficeHoursToAnd(String startHours_1) throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.setInputStartHour(startHours_1);
        Thread.sleep(1000);
    }

    @Then("^Set start office hours field can be inputted$")
    public void setStartOfficeHoursFieldCanBeInputted() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin input end office hours to \"([^\"]*)\"$")
    public void adminInputEndOfficeHoursToAnd(String endHours_1) throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.setInputEndHour(endHours_1);
        Thread.sleep(1000);
    }

    @Then("^Set end office hours field can be inputted$")
    public void setEndOfficeHoursFieldCanBeInputted() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin input set office start hours tolerancy to (\\d+)$")
    public void adminInputSetOfficeStartHoursTolerancyTo(String tolerancy) throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.setTolerancyMin(tolerancy);
        Thread.sleep(1000);
    }

    @Then("^Set start office hours tolerancy field can be inputted$")
    public void setStartOfficeHoursTolerancyFieldCanBeInputted() throws InterruptedException  {
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin input set employee annual leaves to (\\d+)$")
    public void adminInputSetEmployeeAnnualLeavesTo(String annual) throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.setLeaveDay(annual);
        Thread.sleep(1000);
    }

    @Then("^Set employee annual leaves can be inputted$")
    public void setEmployeeAnnualLeavesCanBeInputted() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click save settings button$")
    public void adminClickSaveSettingsButton() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.saveSettingsBtn();
        Thread.sleep(1000);
    }

    @Then("^settings office will be updated$")
    public void settingsOfficeWillBeUpdated() throws InterruptedException{
        SettingsAdminPage settingsPage = new SettingsAdminPage(webDriver);
        settingsPage.settingsPageisDisplayed();
        Assert.assertTrue(settingsPage.settingsPageisDisplayed());
        Thread.sleep(1000);
    }
}
