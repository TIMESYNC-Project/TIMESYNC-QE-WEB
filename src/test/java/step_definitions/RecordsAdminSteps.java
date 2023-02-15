package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.EmployeesAdminPage;
import org.example.pageObject.RecordsAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RecordsAdminSteps {

    private WebDriver webDriver;

    public RecordsAdminSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("^Admin click Records on Navigation Bar$")
    public void adminClickRecordsOnNavigationBar() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsSideBtn();
        Thread.sleep(1000);
    }

    @Then("^System will be showing Records page$")
    public void systemWillBeShowingRecordsPage() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin input \"([^\"]*)\" on records search field$")
    public void adminInputOnRecordsSearchField(String searchRecords) throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.searchRecordsonAdmin(searchRecords);
        Thread.sleep(1000);
    }

    @Then("^Search can input any text$")
    public void searchCanInputAnyText() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click Search button on records page$")
    public void adminClickSearchButtonOnRecordsPage() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.searchRecordsBtn();
        Thread.sleep(1000);
    }

    @Then("^System will be showing records with name \"Lumine\"$")
    public void systemWillBeShowingRecordsWithName() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click on selected employee name record$")
    public void adminClickOnSelectedEmployeeNameRecord() throws InterruptedException {
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.clickSelected();
        Thread.sleep(1000);
    }

    @Then("^System will be showing records from selected employee profile$")
    public void systemWillBeShowingRecordsFromSelectedEmployeeProfile() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.detailedRecordsisDisplayed();
        Assert.assertTrue(recordsPage.detailedRecordsisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click Create Attendance button$")
    public void adminClickCreateAttendanceButton() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.createNewAttendance();
        Thread.sleep(1000);
    }

    @Then("^System will be showing Create Attendance Pop-up$")
    public void systemWillBeShowingCreateAttendancePopUp() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.createNewPopUpIsDisplayed();
        Assert.assertTrue(recordsPage.createNewPopUpIsDisplayed());
        Thread.sleep(1000);

    }

    @When("^Admin select \"([^\"]*)\" on attendance field$")
    public void adminSelectOnAttendanceField(String type_attend) throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.selectAttendanceType(type_attend);
        Thread.sleep(1000);
    }

    @Then("^Attendance will change same as Admin selected type$")
    public void attendanceWillChangeSameAsAdminSelectedType() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.createNewPopUpIsDisplayed();
        Assert.assertTrue(recordsPage.createNewPopUpIsDisplayed());
        Thread.sleep(1000);
    }

//    @When("^Admin input (\\d+) on date start field //nanti diganti$")
//    public void adminInputOnDateStartFieldNantiDiganti(int arg0) {
//    }

    @Then("^Date start field will be added$")
    public void dateStartFieldWillBeAdded() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.createNewPopUpIsDisplayed();
        Assert.assertTrue(recordsPage.createNewPopUpIsDisplayed());
        Thread.sleep(1000);
    }

//    @When("^Admin input (\\d+) on date end field //nanti diganti$")
//    public void adminInputOnDateEndFieldNantiDiganti(int arg0) {
//    }

    @Then("^Date end field will be added$")
    public void dateEndFieldWillBeAdded() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.createNewPopUpIsDisplayed();
        Assert.assertTrue(recordsPage.createNewPopUpIsDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click cancel button on Create Attendance$")
    public void adminClickCancelButtonOnCreateAttendance() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.cancelAttendanceBtn();
        Thread.sleep(1000);
    }

    @Then("^New Attendance will not be created$")
    public void newAttendanceWillNotBeCreated() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click submit button on Create Attendance$")
    public void adminClickSubmitButtonOnCreateAttendance() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.submitAttendanceBtn();
        Thread.sleep(1000);
    }

    @Then("^New Attendance should be created$")
    public void newAttendanceShouldBeCreated() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.NewAtdPageisDisplayed();
        Assert.assertTrue(recordsPage.NewAtdPageisDisplayed());
        Thread.sleep(1000);

    }

    @Then("^System will be showing records with NIP \"23002\"$")
    public void systemWillBeShowingRecordsWithNIP() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin input date on calendar field \"([^\"]*)\" as start date and \"([^\"]*)\" as end date$")
    public void adminInputDateOnDateStartField(String startDate, String startEnd) throws InterruptedException {
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.clickDateRecords();
        recordsPage.startDateRecords(startDate);
        recordsPage.endDateRecords(startEnd);
        Thread.sleep(1000);
    }

    @And("^Admin click on search record date button$")
    public void adminClickOnSearchRecordDateButton() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.searchWithDate();
        Thread.sleep(1000);
    }

    @Then("^System will be showing record with chosen date$")
    public void systemWillBeShowingRecordWithChosenDate() throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.recordsPageisDisplayed();
        Assert.assertTrue(recordsPage.recordsPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin input (-?\\d+) on date start field$")
    public void adminInputDateOnDateStartField(String dateStart) throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.addStartDateAttend(dateStart);
        Thread.sleep(1000);
    }

    @And("^Admin input (-?\\d+) on date end field$")
    public void adminInputDateOnDateEndField(String dateEnd) throws InterruptedException{
        RecordsAdminPage recordsPage = new RecordsAdminPage(webDriver);
        recordsPage.addEndDateAttend(dateEnd);
        Thread.sleep(1000);
    }
}
