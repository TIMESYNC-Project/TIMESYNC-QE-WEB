package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.HomeAdminPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class HomeAdminSteps {

    private WebDriver webDriver;

    public HomeAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^Admin login with \"([^\"]*)\" as username and \"([^\"]*)\" as password to timesync website$")
    public void adminLoginToTimesyncWebsite(String NIP, String pwd) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
        Assert.assertTrue(loginPage.isDisplayed());
        loginPage.setEmployeeNIP(NIP);
        loginPage.setEmployeePwd(pwd);
        Thread.sleep(3000);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @When("^Admin successfully on landing page$")
    public void adminSuccessfullyOnLandingPage() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.dashboardIsDisplayed();
        Assert.assertTrue(homePage.dashboardIsDisplayed());
        Thread.sleep(3000);
    }

    @And("^Admin click Total Employees$")
    public void adminClickTotalEmployees() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.clickTotalEmployee();
        Thread.sleep(3000);
    }

    @Then("^System will be showing Employees page from Home$")
    public void systemWillBeShowingEmployeesPage() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.employeesIsDisplayed();
        Assert.assertTrue(homePage.employeesIsDisplayed());
        Thread.sleep(3000);
    }

    @And("^Admin click Employees$")
    public void adminClickEmployees() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.clickEmployeeList();
        Thread.sleep(3000);
    }

    @And("^Admin click Inbox$")
    public void adminClickInbox() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.clickInbox();
        Thread.sleep(3000);
    }

    @Then("^System will be showing Inbox page$")
    public void systemWillBeShowingInboxPage() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.inboxIsDisplayed();
        Assert.assertTrue(homePage.inboxIsDisplayed());
        Thread.sleep(5000);
    }

    @Then("^System will be showing Graph Working Hours page$")
    public void systemWillBeShowingGraphWorkingHoursPage() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.workingHoursIsDisplayed();
        Assert.assertTrue(homePage.workingHoursIsDisplayed());
        Thread.sleep(3000);
    }

    @Then("^System will be showing Graph Late Employees page$")
    public void systemWillBeShowingGraphLateEmployeesPage() throws InterruptedException{
        HomeAdminPage homePage = new HomeAdminPage(webDriver);
        homePage.lateEmployeeIsDisplayed();
        Assert.assertTrue(homePage.lateEmployeeIsDisplayed());
        Thread.sleep(3000);
    }
}
