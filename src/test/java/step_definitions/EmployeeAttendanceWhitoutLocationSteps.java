package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.EmployeeWhitoutLocationHomePage;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EmployeeAttendanceWhitoutLocationSteps {

    private WebDriver webDriver;

    public EmployeeAttendanceWhitoutLocationSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("Employee login to timesync website with \"([^\"]*)\" NIP & \"([^\"]*)\" password by denying location")
    public void employeeLoginToTimesyncWebsiteWithNIPPasswordByDenyingLocation(String NIP, String pwd) throws Throwable {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmployeeNIP(NIP);
        loginPage.setEmployeePwd(pwd);
        Thread.sleep(3000);
    }

    @When("Employee click login button by denying location")
    public void employeeClickLoginButtonByDenyingLocation() throws InterruptedException {
            LoginPage loginPage = new LoginPage(webDriver);
            loginPage.clickLogin();
            Thread.sleep(3000);
    }

    @Then("Employee successfully on landing page by denying location")
    public void employeeSuccessfullyOnLandingPageByDenyingLocation() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayEmployeeAttendancePage());
        Thread.sleep(5000);
    }

    @And("Employee click on clock in by denying location")
    public void employeeClickOnClockInByDenyingLocation() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        employeeHomePage.clickClockIn();
        Thread.sleep(3000);
    }

    @Then("System will showing error message clock in \"([^\"]*)\"")
    public void systemWillShowingErrorMessageClockIn(String errorMsgIn) throws InterruptedException {
        EmployeeWhitoutLocationHomePage employeeWhitoutLocationHomePage = new EmployeeWhitoutLocationHomePage(webDriver);
        Assert.assertTrue(employeeWhitoutLocationHomePage.displayErrorMessageClockIn(errorMsgIn));
        Thread.sleep(3000);
    }

    @Then("System will showing error message clock out \"([^\"]*)\"")
    public void systemWillShowingErrorMessageClockOut(String errorMsgIn) throws InterruptedException {
        EmployeeWhitoutLocationHomePage employeeWhitoutLocationHomePage = new EmployeeWhitoutLocationHomePage(webDriver);
        Assert.assertTrue(employeeWhitoutLocationHomePage.displayErrorMessageClockOut(errorMsgIn));
        Thread.sleep(3000);
    }

}
