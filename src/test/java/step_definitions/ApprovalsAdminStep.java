package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ApprovalAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ApprovalsAdminStep {
    private WebDriver webDriver;

    public ApprovalsAdminStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^Admin click Approval on Navigation Bar$")
    public void adminClickApprovalOnNavigationBar() throws InterruptedException {
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.sidebarApprovalBtn();
        Thread.sleep(1000);
    }

    @Then("^System will be showing Approval request page$")
    public void systemWillBeShowingApprovalPage() throws InterruptedException{
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.approvalPageisDisplayed();
        Assert.assertTrue(approvalPage.approvalPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click selected any employee card$")
    public void adminClickSelectedAnyEmployeeCard() throws InterruptedException{
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.selectCardBtn();
        Thread.sleep(1000);
    }

    @Then("^Detail approval will be displayed$")
    public void detailApprovalWillBeDisplayed() throws InterruptedException {
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.popUpApprovalsisDisplayed();
        Assert.assertTrue(approvalPage.popUpApprovalsisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click selected pending employee card$")
    public void adminClickSelectedPendingEmployeeCard() throws InterruptedException {
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.selectPendingApproval_1();
        Thread.sleep(1000);
    }

    @And("^Admin click selected any pending employee card$")
    public void adminClickSelectedAnyPendingEmployeeCard() throws InterruptedException{
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.selectPendingApproval_2();
        Thread.sleep(1000);
    }

    @When("^Admin click Approve approval button$")
    public void adminClickApproveApprovalButton() throws InterruptedException{
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.setApproveApprovals();
        Thread.sleep(1000);
    }

    @Then("^Approval request will be Approved$")
    public void approvalRequestWillBeApproved() throws InterruptedException {
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.approvalPageisDisplayed();
        Assert.assertTrue(approvalPage.approvalPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click Reject approval button$")
    public void adminClickRejectApprovalButton() throws InterruptedException{
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.setRejectApprovals();
        Thread.sleep(1000);
    }

    @Then("^Approval request will be Rejected$")
    public void approvalRequestWillBeRejected() throws InterruptedException {
        ApprovalAdminPage approvalPage = new ApprovalAdminPage(webDriver);
        approvalPage.approvalPageisDisplayed();
        Assert.assertTrue(approvalPage.approvalPageisDisplayed());
        Thread.sleep(1000);

    }
}
