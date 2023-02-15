package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.EmployeeProfilePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static step_definitions.Hooks.webDriver;

public class EmployeeAttendanceSteps {

    private WebDriver webDriver;

    public EmployeeAttendanceSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("Employee login to timesync website with \"([^\"]*)\" NIP & \"([^\"]*)\" password")
    public void employeeLoginToTimesyncWebsiteWithNIPPassword(String NIP, String pwd) throws Throwable {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmployeeNIP(NIP);
        loginPage.setEmployeePwd(pwd);
        Thread.sleep(3000);
    }

    @Then("Employee successfully on landing page")
    public void employeeSuccessfullyOnLandingPage() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayEmployeeAttendancePage());
        Thread.sleep(6000);
    }

    //Verify Location showed on attendance page
    @And("System will showing the location")
    public void systemWillShowingRealtimeLocation() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayLocation());
        Thread.sleep(5000);
    }

    //Clock In
    @And("Employee click on clock in")
    public void employeeClickOnClockIn() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        employeeHomePage.clickClockIn();
        Thread.sleep(3000);
    }

    @Then("System will showing clock in hour on logs today")
    public void systemWillShowingClockInHourOnLogsToday() {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayLogsClockIn());
    }

    //Clock Out
    @And("Employee click on clock out")
    public void employeeClickOnClockOut() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        employeeHomePage.clickClockOut();
        Thread.sleep(3000);
    }

    @Then("System will showing clock out hour on logs today")
    public void systemWillShowingClockOutHourOnLogsToday() {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayLogsClockOut());
    }

    //See more..
    @And("Employee click on See more feature")
    public void employeeClickOnSeeMore() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        employeeHomePage.clickSeeMore();
        Thread.sleep(3000);
    }

    @Then("System will showing warning message already clock in \"([^\"]*)\"")
    public void systemWillShowingWarningMessageClockIn(String alreadyMsgIn) throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.warningAlreadyClockIn(alreadyMsgIn));
        Thread.sleep(3000);
    }

    @Then("System will showing warning message already clock out \"([^\"]*)\"")
    public void systemWillShowingWarningMessageClockOut(String alreadyMsgIn) throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.warningAlreadyClockOut(alreadyMsgIn));
        Thread.sleep(3000);
    }

}
