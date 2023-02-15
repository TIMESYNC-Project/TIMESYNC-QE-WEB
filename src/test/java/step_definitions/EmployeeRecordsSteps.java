package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.EmployeeRecordsPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.sql.DriverManager.getDriver;

public class EmployeeRecordsSteps {

    private WebDriver webDriver;

    public EmployeeRecordsSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Employee click on records button from home page")
    public void employeeClickOnRecordsButton() throws InterruptedException {
        EmployeeRecordsPage employeeRecordsPage = new EmployeeRecordsPage(webDriver);
        employeeRecordsPage.clickRecords();
        Thread.sleep(3000);
    }

    @Then("System will showing records page")
    public void systemWillShowingRecordsPage() {
        EmployeeRecordsPage employeeRecordsPage = new EmployeeRecordsPage(webDriver);
        Assert.assertTrue(employeeRecordsPage.displayRecordsPage());
    }

    @And("Employee input date on calendar field \"([^\"]*)\" as start date and \"([^\"]*)\" as end date")
    public void employeeInputDateOnCalendarFieldAsStartDateAndAsEndDate(String startDate, String endDate) throws InterruptedException {
        EmployeeRecordsPage employeeRecordsPage = new EmployeeRecordsPage(webDriver);
        employeeRecordsPage.clickDateField();
        employeeRecordsPage.clickInputStartDate(startDate);
        employeeRecordsPage.clickInputEndDate(endDate);
        Thread.sleep(3000);
    }

    @Then("Employee click on search icon")
    public void employeeClickOnSearchIcon() throws InterruptedException {
        EmployeeRecordsPage employeeRecordsPage = new EmployeeRecordsPage(webDriver);
        employeeRecordsPage.clickSearchRecords();
        Thread.sleep(3000);
    }

    @Then("System will showing records list")
    public void systemWillShowingRecordsList() {
        EmployeeRecordsPage employeeRecordsPage = new EmployeeRecordsPage(webDriver);
        Assert.assertTrue(employeeRecordsPage.displayRecordsList());
    }

}
