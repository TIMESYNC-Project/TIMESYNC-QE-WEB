package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxAdminPage {

    public static WebDriver driver;

    public InboxAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@id='btn-sidebar-inbox']")
    private WebElement inboxSideBtn;

    public void clickInboxSideBtn(){inboxSideBtn.click();}

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement inboxPage;

    public boolean inboxPageisDisplayed(){
        return inboxPage.isDisplayed();
    }

    @FindBy(xpath = "//label[@id='btn-create-inbox']")
    private WebElement createNewInbox;

    public void getCreateNewInbox(){
        createNewInbox.click();
    }

    @FindBy(xpath = "//div[@class='modal-box border-2 border-sky flex flex-col justify-center text-sky']")
    private WebElement popUpNewInbox;

    public boolean popCreateNewInbox(){
        return popUpNewInbox.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='input-inbox-receiver']")
    private WebElement toField;

    public void inputNIPInbox(String NIP){
        toField.sendKeys(NIP);
    }

    @FindBy(xpath = "//input[@id='input-inbox-title']")
    private WebElement titleField;

    public void inputTitleInbox(String title){
        titleField.sendKeys(title);
    }

    @FindBy(xpath = "//textarea[@id='input-inbox-message']")
    private WebElement msgField;

    public void inputMsgInbox(String msg){
        msgField.sendKeys(msg);
    }

    @FindBy(xpath = "//button[@id='btn-inbox-submit']")
    private WebElement submitBtn;

    public void submitInboxBtn(){
        submitBtn.click();
    }

    @FindBy(xpath = "//label[@id='btn-inbox-cancel']")
    private WebElement cancelBtn;

    public void cancelInboxBtn(){
        cancelBtn.click();
    }

    @FindBy(xpath = "//div[@class='undefined p-10']/div[1]//p[@class='text-red-600 duration-300 hover:cursor-pointer active:scale-90']")
    private WebElement deleteMsg;

    public void deleteInboxBtn(){
        deleteMsg.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement warningMsg;

    public boolean warningDelInbox(){
        return warningMsg.isDisplayed();
    }

    @FindBy(css = ".swal2-confirm")
    private WebElement confirmDelete;

    public void confirmDeleteInbox(){
        confirmDelete.click();
    }

    @FindBy(css = ".swal2-cancel")
    private WebElement cancelDelete;

    public void cancelDeleteInbox(){
        confirmDelete.click();
    }

//    @FindBy()
//    private WebElement detailInbox;
//
//    public void detailInboxClick(){
//          detailInbox.click();
//    }
//      tunggu update FE

    @FindBy(xpath = "//div[@class='undefined p-10']/div[1]//p[@class='mb-5 pb-2 text-2xl border-b-2 font-bold text-black']")
    private WebElement detailPopUp;

    public void detailInboxisDisplayed(){
        detailPopUp.isDisplayed();
    }

    //tanyain lg nih ((tunggu update FE))
    @FindBy(xpath = "//div[@class='undefined p-10']/div[1]//label[@class='w-28 text-sm text-center border-2 border-sky rounded-xl py-1 text-sky font-medium duration-300 hover:cursor-pointer hover:bg-red-600 hover:text-white  active:scale-90']")
    private WebElement closePopUp;

    public void closeDetailInbox(){
        closePopUp.click();
    }

}
