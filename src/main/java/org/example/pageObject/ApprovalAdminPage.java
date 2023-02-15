package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;
import java.util.List;

public class ApprovalAdminPage {

    public static WebDriver driver;

    public ApprovalAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public static final SecureRandom random = new SecureRandom();

    public int randomNumber(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    WebElement approvalPage;

    public boolean approvalPageisDisplayed(){
        return approvalPage.isDisplayed();
    }

    @FindBy(id = "btn-sidebar-approval")
    WebElement sidebarBtnAcc;

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

    @FindBy(xpath = "//*[contains(@id,'card-approval')]//section[4]/p[text()='pending']")
    public List<WebElement> selectPending1;

    public void selectPendingApproval_1(){
        int j = randomNumber(0, selectPending1.size() - 1);
        selectPending1.get(j).click();}

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
