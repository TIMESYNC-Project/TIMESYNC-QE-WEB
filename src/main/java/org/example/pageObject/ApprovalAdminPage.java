package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovalAdminPage {

    public static WebDriver driver;

    public ApprovalAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement approvalPage;

    public boolean approvalPageisDisplayed(){
        return approvalPage.isDisplayed();
    }

    @FindBy(xpath = "//a[@id='btn-sidebar-approval']")
    private WebElement sidebarBtnAcc;

    public void sidebarApprovalBtn(){
        sidebarBtnAcc.click();
    }

    @FindBy(xpath = "//div[67]/div[@class='box-border w-full bg-white rounded-2xl border-sky border-2 p-5']")
    private WebElement cardSick;

    public void selectCardBtn(){ cardSick.click();}

    @FindBy(css = ".btn-sm")
    private WebElement closePopUp;

    public void closePopUpApproval(){
        closePopUp.click();
    }

    // ini diganti nanti
    @FindBy(xpath = "//label[contains(.,'Feb 10 2023Violet EvergardenOn Leavepending')]")
    private WebElement selectPending1;

    public void selectPendingApproval_1(){selectPending1.click();}

    @FindBy(xpath = "//label[contains(.,'Feb 10 2023Violet EvergardenAnnual Leavepending')]")
    private WebElement selectPending2;

    public void selectPendingApproval_2(){selectPending2.click();}

    @FindBy(xpath = "//button[@id='btn-reject-modals']")
    private WebElement rejectApprovals;

    public void setRejectApprovals(){
        rejectApprovals.click();
    }

    @FindBy(xpath = "//button[@id='btn-approve-modals']")
    private WebElement approveApprovals;

    public void setApproveApprovals(){
        approveApprovals.click();
    }

    @FindBy(css = ".modal-box")
    private WebElement popUpApprovals;

    public boolean popUpApprovalsisDisplayed(){
        return popUpApprovals.isDisplayed();
    }

}
