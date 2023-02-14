package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.EmployeeApprovalPage;
import org.example.pageObject.EmployeeProfilePage;
import org.example.pageObject.EmployeeRecordsPage;
import org.example.pageObject.EmployeeWhitoutLocationHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EmployeeApprovalSteps {

    private WebDriver webDriver;

    public EmployeeApprovalSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Displaying Approval Page
    @And("Employee click on approval button from home page")
    public void employeeClickOnApprovalButtonFromHomePage() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.clickApproval();
        Thread.sleep(3000);
    }

    @Then("System will showing approval page")
    public void systemWillShowingApprovalPage() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        Assert.assertTrue(employeeApprovalPage.displayingApprovalPage());
        Thread.sleep(3000);
    }

    //Request Approval
    @And("Employee click on request approval")
    public void employeeClickOnRequestApproval() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.clickRequestApproval();
        Thread.sleep(3000);
    }

    @Then("Employee choose approval type to \"([^\"]*)\"")
    public void employeeChooseApprovalTypeTo(String approvalType) throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.chooseApprovalType(approvalType);
        Thread.sleep(3000);
    }

    @And("Employee choose start date at \"([^\"]*)\" to \"([^\"]*)\"")
    public void employeeChooseStartDateAtTo(String startDate, String endDate) throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.setStartDate(startDate);
        employeeApprovalPage.setEndDate(endDate);
        Thread.sleep(3000);
    }

    @Then("Employee input description \"([^\"]*)\"")
    public void employeeInputDescription(String description) throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.setDescription(description);
        Thread.sleep(3000);
    }

    @And("Employee upload file for evidence \"([^\"]*)\"")
    public void employeeUploadFileForEvidence(String image) throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.chooseImageFile(image);
        Thread.sleep(3000);
    }
    @Then("Employee click submit")
    public void employeeClickSubmit() throws InterruptedException {
            EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
            employeeApprovalPage.clickSubmitApproval();
            Thread.sleep(3000);
    }

    //Displaying Detail Approval
    @And("Employee click on detail approval")
    public void employeeClickOnDetailApproval() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.clickDetailApproval();
        Thread.sleep(3000);
    }

    @Then("System will showing modal box detail approval")
    public void systemWillShowingModalBoxDetailApproval() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        Assert.assertTrue(employeeApprovalPage.displayingDetailApproval());
        Thread.sleep(3000);
    }

    @Then("Employee click on close detail approval")
    public void employeeClickOnCloseDetailApproval() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        employeeApprovalPage.clickCloseDetailApproval();
        Thread.sleep(3000);
    }

    @Then("^System will showing error message$")
    public void systemWillShowingErrorMessage() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        Assert.assertTrue(employeeApprovalPage.displayingErrorRequestApproval());
        Thread.sleep(3000);
    }

    @Then("System showing request approval page")
    public void systemWillShowingRequestApprovalPage() throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        Assert.assertTrue(employeeApprovalPage.displayingRequestApproval());
        Thread.sleep(3000);
    }

    @And("System will showing error message for image upload \"([^\"]*)\"")
    public void systemWillShowingErrorMessageForImageUpload(String errorSize) throws InterruptedException {
        EmployeeApprovalPage employeeApprovalPage = new EmployeeApprovalPage(webDriver);
        Assert.assertTrue(employeeApprovalPage.displayErrorSizeImage(errorSize));
        Thread.sleep(6000);
    }
}
