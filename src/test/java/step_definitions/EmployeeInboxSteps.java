package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.EmployeeApprovalPage;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.EmployeeInboxPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class EmployeeInboxSteps {

    private WebDriver webDriver;

    public EmployeeInboxSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Employee click on inbox button from home page")
    public void employeeClickOnInboxButtonFromHomePage() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        employeeInboxPage.clickInbox();
        Thread.sleep(3000);
    }

    @Then("System will showing inbox page")
    public void systemWillShowingInboxPage() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        Assert.assertTrue(employeeInboxPage.displayingInboxPage());
        Thread.sleep(3000);
    }

    @And("Employee click on detail inbox message")
    public void employeeClickOnDetailInboxMessage() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        employeeInboxPage.clickDetailInbox();
        Thread.sleep(3000);
    }

    @Then("System will showing modal box detail inbox message")
    public void systemWillShowingModalBoxDetailInboxMessage() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        Assert.assertTrue(employeeInboxPage.displayingDetailInbox());
        Thread.sleep(3000);
    }

    @Then("Employee click on close detail inbox message")
    public void employeeClickOnCloseDetailInboxMessage() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        employeeInboxPage.clickCloseDetailInbox();
        Thread.sleep(3000);
    }

    //Timesync Icon
    @And("Employee click Timesync logo")
    public void employeeClickTimesyncIcon() throws InterruptedException {
        EmployeeInboxPage employeeInboxPage = new EmployeeInboxPage(webDriver);
        employeeInboxPage.clickTimesyncIcon();
        Thread.sleep(3000);
    }

    @Then("System bring back to home page attendance")
    public void systemBringBackToHomePageAttendance() throws InterruptedException {
        EmployeeHomePage employeeHomePage = new EmployeeHomePage(webDriver);
        Assert.assertTrue(employeeHomePage.displayEmployeeAttendancePage());
        Thread.sleep(5000);
    }

}
