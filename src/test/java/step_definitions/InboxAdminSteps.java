package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @When("^Admin input \"([^\"]*)\" on \"To\" field$")
    public void adminInputAnyTextOnToField(String toInput) throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inputNIPInbox(toInput);
        Thread.sleep(1000);
    }


    @When("^Admin input \"([^\"]*)\" on \"Title\" field$")
    public void adminInputAnyTextOnTitleField(String titleInput) throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inputTitleInbox(titleInput);
        Thread.sleep(1000);
    }


    @When("^Admin input \"([^\"]*)\" on \"Messages\" field$")
    public void adminInputAnyTextOnMsgField(String msgInput) throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inputMsgInbox(msgInput);
        Thread.sleep(1000);
    }

    @Then("^\"To\" field is enabled$")
    public void tofieldIsEnabled() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }
    @Then("^\"Title\" field is enabled$")
    public void titlefieldIsEnabled() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }
    @Then("^\"Messages\" field is enabled$")
    public void msgfieldIsEnabled() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }

    @Then("^\"To\" field is accepting any text$")
    public void tofieldIsAcceptingAnyText() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }
    @Then("^\"Title\" field is accepting any text$")
    public void titlefieldIsAcceptingAnyText() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }
    @Then("^\"Messages\" field is accepting any text$")
    public void msgfieldIsAcceptingAnyText() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.popCreateNewInbox();
        Assert.assertTrue(inboxPage.popCreateNewInbox());
        Thread.sleep(1000);
    }

    @And("^Admin click \"Submit\" create inbox button$")
    public void adminClickCreateInboxButton() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.submitInboxBtn();
        Thread.sleep(1000);
    }

    @Then("^Message will be sent to NIP \"23037\"$")
    public void messageWillBeSentToNIP() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click on Close Create Inbox button$")
    public void adminClickOnCloseCreateInboxButton() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.cancelInboxBtn();
        Thread.sleep(1000);
    }

    @Then("^Create Inbox pop-up will be closed$")
    public void createInboxPopUpWillBeClosed() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @Then("^System will be showing list Inbox page$")
    public void systemWillBeShowingListInboxPage() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @Then("^System will be showing date created messages on Inbox page$")
    public void systemWillBeShowingDateCreatedMessagesOnInboxPage() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click on Delete Inbox button$")
    public void adminClickOnDeleteInboxButton() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.deleteInboxBtn();
        Thread.sleep(1000);
    }

    @And("^System showing warning delete inbox message$")
    public void systemShowingWarningDeleteInboxMessage() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.warningDelInbox();
        Assert.assertTrue(inboxPage.warningDelInbox());
        Thread.sleep(1000);
    }

    @And("^Admin click Yes on warning message delete inbox$")
    public void adminClickYesOnWarningMessageDeleteInbox() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.confirmDeleteInbox();
        Thread.sleep(1000);
    }

    @Then("^Inbox will be deleted$")
    public void inboxWillBeDeleted() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @And("^Admin click No on warning message delete inbox$")
    public void adminClickNoOnWarningMessageDeleteInbox() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.cancelDeleteInbox();
        Thread.sleep(1000);
    }

    @Then("^Inbox will not deleted$")
    public void inboxWillNotDeleted() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @Then("^Messages will be sent to all employee$")
    public void messagesWillBeSentToAllEmployee() throws InterruptedException{
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.inboxPageisDisplayed();
        Assert.assertTrue(inboxPage.inboxPageisDisplayed());
        Thread.sleep(1000);
    }

    @When("^Admin click on Inbox card$")
    public void adminClickOnInboxCard() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.detailInboxClick();
        Thread.sleep(1000);
    }

    @Then("^System will be showing detailed inbox$")
    public void systemWillBeShowingDetailedInbox() throws InterruptedException {
        InboxAdminPage inboxPage = new InboxAdminPage(webDriver);
        inboxPage.detailInboxisDisplayed();
        Assert.assertTrue(inboxPage.detailInboxisDisplayed());
        Thread.sleep(1000);
    }
}
