package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.EmployeesAdminPage;
import org.example.pageObject.InboxAdminPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class InboxAdminSteps {
    private WebDriver webDriver;

    public InboxAdminSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^Admin click Inbox on Navigation Bar$")
    public void adminClickInboxOnNavigationBar() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.clickInboxSideBtn();
        Thread.sleep(1000);
    }

    @Then("^Admin can click Inbox on Navigation Bar$")
    public void adminCanClickInboxOnNavigationBar() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click on Create Inbox button$")
    public void adminClickOnCreateInboxButton() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.getCreateNewInbox();
        Thread.sleep(1000);
    }

    @Then("^System will be showing Create Inbox pop-up$")
    public void systemWillBeShowingCreateInboxPopUp() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }

    @Then("^System will be showing Create Inbox pop-up with proper format$")
    public void systemWillBeShowingCreateInboxPopUpWithProperFormat() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }

    @When("^Admin input any text on \"To\" field$")
    public void adminInputAnyTextOnToField(String arg0) throws Throwable {

    }


    @When("^Admin input any text on \"Title\" field$")
    public void adminInputAnyTextOnTitleField(String arg0) throws Throwable {

    }


    @When("^Admin input any text on \"Messages\" field$")
    public void adminInputAnyTextOnMsgField(String arg0) throws Throwable {

    }

    @Then("^\"To\" field is enabled$")
    public void tofieldIsEnabled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^\"Title\" field is enabled$")
    public void titlefieldIsEnabled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^\"Messages\" field is enabled$")
    public void msgfieldIsEnabled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\"To\" field is accepting any text$")
    public void fieldIsAcceptingAnyText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^\"Title\" field is accepting any text$")
    public void fieldIsAcceptingAnyText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^\"Messages\" field is accepting any text$")
    public void fieldIsAcceptingAnyText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Admin input \"([^\"]*)\" on \"([^\"]*)\" field$")
    public void adminInputOnField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Admin click \"([^\"]*)\" create inbox button$")
    public void adminClickCreateInboxButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Message will be sent to NIP \"([^\"]*)\"$")
    public void messageWillBeSentToNIP(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Admin click on Close Create Inbox button$")
    public void adminClickOnCloseCreateInboxButton() {
    }

    @Then("^Create Inbox pop-up will be closed$")
    public void createInboxPopUpWillBeClosed() {
    }

    @Then("^System will be showing list Inbox page$")
    public void systemWillBeShowingListInboxPage() {
    }

    @Then("^System will be showing date created messages on Inbox page$")
    public void systemWillBeShowingDateCreatedMessagesOnInboxPage() {
    }

    @When("^Admin click on Delete Inbox button$")
    public void adminClickOnDeleteInboxButton() {
    }

    @And("^System showing warning delete inbox message$")
    public void systemShowingWarningDeleteInboxMessage() {
    }

    @And("^Admin click Yes on warning message delete inbox$")
    public void adminClickYesOnWarningMessageDeleteInbox() {
    }

    @Then("^Inbox will be deleted$")
    public void inboxWillBeDeleted() {
    }

    @And("^Admin click No on warning message delete inbox$")
    public void adminClickNoOnWarningMessageDeleteInbox() {
    }

    @Then("^Inbox will not deleted$")
    public void inboxWillNotDeleted() {
    }
}
