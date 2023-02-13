package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.EmployeesAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EmployeesAdminSteps {

    private WebDriver webDriver;

    public EmployeesAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("Admin click Employees on Navigation Bar")
    public void EmployeesOnNavigationBar() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeNavBar();
        Thread.sleep(1000);
    }

    @Then("System will be showing Employees page")
    public void systemWillBeShowingEmployeesPage() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeePageisDisplayed();
        Assert.assertTrue(employeePage.employeePageisDisplayed());
        Thread.sleep(1000);
    }

    @When("Admin input \"([^\"]*)\" on search field")
    public void adminInputOnSarchField(String searchText) throws InterruptedException {
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.setSearchField(searchText);
        Thread.sleep(1000);
    }

    @And("Admin click Search button")
    public void adminClickSearchButton() throws  InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.clickSearchEmployee();
        Thread.sleep(1000);
    }

    @Then("System will be showing profile with name \"Violet Evergarden\"")
    public void systemWillBeShowingProfileWithName() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.showEmployeeName();
        Assert.assertTrue(employeePage.showEmployeeName());
        Thread.sleep(1000);
    }

    @Then("List of Employee successfully created")
    public void listOfEmployeeSuccessfullyCreated() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.submitCSVFile();
        Thread.sleep(1000);
    }

    @And("Admin click Create a new employee button")
    public void adminClickCreateANewEmployeeButton() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addEmployeeBtn();
        Thread.sleep(1000);
    }

    @And("Admin add Name field to \"([^\"]*)\"")
    public void adminAddNameFieldTo(String addName) throws InterruptedException {
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addNameEmployee(addName);
        Thread.sleep(1000);
    }

    @And("Admin add Email field to \"([^\"]*)\"")
    public void adminAddEmailFieldTo(String addEmail) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addEmailEmployee(addEmail);
        Thread.sleep(1000);
    }

    @And("Admin add Password field to \"([^\"]*)\"")
    public void adminAddPasswordFieldTo(String addPwd) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addPwdEmployee(addPwd);
        Thread.sleep(1000);
    }

    @And("Admin add Phone field to \"([^\"]*)\"")
    public void adminAddPhoneFieldTo(String addPhone) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addPhoneEmployee(addPhone);
        Thread.sleep(1000);
    }

    @And("Admin select position to \"([^\"]*)\"")
    public void adminSelectPositionTo(String addPosition) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addPositionEmployee(addPosition);
        Thread.sleep(1000);
    }

    @And("Admin add gender to \"([^\"]*)\"")
    public void adminAddGenderTo(String addGender) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addGenderEmployee(addGender);
        Thread.sleep(1000);
    }

    @And("Admin add Birthdate to (-?\\d+)")
    public void adminAddBirthdateTp(String birthDate) throws InterruptedException {
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addBirthEmployee(birthDate);
        Thread.sleep(1000);
    }

    @And("Admin add address to \"([^\"]*)\"")
    public void adminAddAddressTo(String addAddress) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addAddressEmployee(addAddress);
        Thread.sleep(1000);
    }

    @When("Admin click Submit Create New Employee button")
    public void adminClickSubmitCreateNewEmployeeButton() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.addSingleEmployee();
        Thread.sleep(1000);
    }

    @Then("New Employee successfully created")
    public void newEmployeeSuccessfullyCreated() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.successCreate();
        Assert.assertTrue(employeePage.successCreate());
        Thread.sleep(1000);
    }

    @Then("Submit button will not be created")
    public void submitButtonWillNotBeCreated() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.displayNotSubmit();
        Assert.assertTrue(employeePage.displayNotSubmit());
        Thread.sleep(1000);
    }

    @When("^Admin click on selected employee name$")
    public void adminClickOnEmployeeName() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeNameBtn();
        Thread.sleep(1000);
    }

    @Then("System will be showing selected employee profile")
    public void systemWillBeShowingEmployeeProfile() throws InterruptedException {
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeProfileIsDisplayed();
        Assert.assertTrue(employeePage.employeeProfileIsDisplayed());
        Thread.sleep(1000);
    }

    @When("Admin click back button on employee profile page")
    public void adminClickBackButtonOnEmployeeProfilePage() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.backEmployeePage();
        Thread.sleep(1000);
    }

    @Then("System will redirect back to employee page")
    public void systemWillRedirectBackToEmployeePage() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeePageisDisplayed();
        Assert.assertTrue(employeePage.employeePageisDisplayed());
        Thread.sleep(1000);
    }

    @When("Admin click on selected employee position")
    public void adminClickOnEmployeePosition() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.roleEmployeeProfileBtn();
        Thread.sleep(1000);
    }

    @Then("System will be showing selected position employee profile")
    public void systemWillBeShowingSelectedEmployeeProfile() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeProfileIsDisplayed();
        Assert.assertTrue(employeePage.employeeProfileIsDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click Edit button on employee card button$")
    public void adminClickOnEmployeeCardButton() throws InterruptedException {
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.editEmployeeProfileBtn();
        Thread.sleep(1000);
    }

    @And("^Admin edit Name field to \"([^\"]*)\"$")
    public void adminEditNameFieldTo(String editName) throws InterruptedException {
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editNameEmployee(editName);
        Thread.sleep(1000);
    }

    @And("^Admin edit Email field to \"([^\"]*)\"$")
    public void adminEditEmailFieldTo(String editEmail) throws InterruptedException {
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editEmailEmployee(editEmail);
        Thread.sleep(1000);
    }

    @And("^Admin edit Password field to \"([^\"]*)\"$")
    public void adminEditPasswordFieldTo(String editPwd) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editPwdEmployee(editPwd);
        Thread.sleep(1000);
    }

    @And("^Admin edit Phone field to \"([^\"]*)\"$")
    public void adminEditPhoneFieldTo(String editPhone) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editPhoneEmployee(editPhone);
        Thread.sleep(1000);
    }

    @And("^Admin edit select position to \"([^\"]*)\"$")
    public void adminEditSelectPositionTo(String editPstn) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editRoleEmployee(editPstn);
        Thread.sleep(1000);
    }

    @And("^Admin edit gender to \"([^\"]*)\"$")
    public void adminEditGenderTo(String editGender) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editGenderEmployee(editGender);
        Thread.sleep(1000);
    }

    @And("^Admin edit Birthdate tp (-?\\d+)$")
    public void adminEditBirthdateTp(String bday) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editBdayEmployee(bday);
        Thread.sleep(1000);
    }

    @And("^Admin edit address to \"([^\"]*)\"$")
    public void adminEditAddressTo(String address) throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.editAddressEmployee(address);
        Thread.sleep(1000);
    }

    @When("^Admin click edit submit button$")
    public void adminClickEditSubmitButton() throws InterruptedException{
        EmployeesAdminPage employeesPage = new EmployeesAdminPage(webDriver);
        employeesPage.submitEditEmployeeProfileBtn();
        Thread.sleep(1000);
    }

    @Then("^Employee data will be updated$")
    public void dataWillBeUpdated() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeProfileIsDisplayed();
        Assert.assertTrue(employeePage.employeeProfileIsDisplayed());
        Thread.sleep(1000);
    }

    @Then("^Employee data will not affected$")
    public void dataWillNotAffected() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeNameBtn();
        Thread.sleep(1000);
    }

    @When("^Admin click edit cancel button$")
    public void adminClickEditCancelButton() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.cancelEditEmployeeProfileBtn();
        Thread.sleep(1000);
    }

    @When("^Admin click delete button on selected card$")
    public void adminClickDeleteButtonOnSelectedCard() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.deleteEmployeeBtn();
        Thread.sleep(1000);
    }

    @Then("^Warning messages will appeared$")
    public void warningMessagesWillAppeared() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.warningMsgisDisplayed();
        Assert.assertTrue(employeePage.warningMsgisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click Yes on warning messages delete employee$")
    public void adminClickOnWarningMessagesDeleteEmployee() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.yesDeleteEmployeeBtn();
        Thread.sleep(1000);
    }

    @And("^Admin click No on warning messages delete employee$")
    public void adminClickNoOnWarningMessagesDeleteEmployee() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.cancelDeleteEmployeeBtn();
        Thread.sleep(1000);
    }

    @Then("Employee will successfully deleted")
    public void employeeWillSuccessfullyDeleted() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeProfileIsDisplayed();
        Assert.assertTrue(employeePage.employeeProfileIsDisplayed());
        Thread.sleep(1000);
    }

    @Then("Employee will not be deleted")
    public void employeeWillNotBeDeleted() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.employeeProfileIsDisplayed();
        Assert.assertTrue(employeePage.employeeProfileIsDisplayed());
        Thread.sleep(1000);
    }

    @And("Admin click Add to Csv button")
    public void adminClickAddToCsvButton() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.clickCSV();
        Thread.sleep(1000);
    }

    @When("Admin input \"([^\"]*)\" on add csv field")
    public void adminInputOnAddCsvField(String csvName) throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.uploadCSV(csvName);
        Thread.sleep(2000);
    }

    @When("Admin click cancel add button")
    public void adminClickCancelAddButton() throws InterruptedException{
        EmployeesAdminPage employeePage = new EmployeesAdminPage(webDriver);
        employeePage.cancelAddBtn();
        Thread.sleep(1000);
    }
}
