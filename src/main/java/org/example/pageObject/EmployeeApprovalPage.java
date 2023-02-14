package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeApprovalPage {

    public static WebDriver driver;

    public EmployeeApprovalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    String pathImageApproval = System.getProperty("user.dir") + "\\src\\test\\resources\\input_files\\";

    //Displaying Approval Page
    @FindBy(xpath = "//p[.='Approval']")
    private WebElement btnApproval;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayApprovalPage;

    //Displaying Detail Approval
    @FindBy(xpath = "//div[@class='undefined p-3 md:p-6 xl:p-10']/div[@class='my-5 xl:mx-24 active:scale-95']/div[contains(.,'Feb 08 2023Sick Leaveapproved')]")
    private WebElement btnDetailApproval;

    @FindBy(xpath = "//div[@class='modal-box border-2 border-sky flex flex-col justify-center text-sky undefined']/div[@class='box-border w-full bg-white rounded-2xl border-sky border-2 p-5']")
    private WebElement displayDetailApproval;

    @FindBy(xpath = "//label[@id='btn-close-modals']")
    private WebElement btnCloseDetailApproval;

    @FindBy(xpath = "//button[@id='btn-request-approval']")
    private WebElement btnRequestApproval;

    @FindBy(xpath = "//select[@id='select-approval-type']")
    private WebElement selectContainer;

    @FindBy(xpath = "//input[@id='input-start-date']")
    private WebElement inputStartDate;

    @FindBy(xpath = "//input[@id='input-end-date']")
    private WebElement inputEndDate;

    @FindBy(xpath = "//textarea[@id='input-description']")
    private WebElement inputDescription;

    @FindBy(xpath = "//input[@id='input-picture']")
    private WebElement uploadImage;

    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement btnSubmitApproval;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement displayErrorRequestApproval;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayRequestApproval;

    //Displaying Approval Page
    public void clickApproval() {
        btnApproval.click();
    }

    public boolean displayingApprovalPage() {
        return displayApprovalPage.isDisplayed();
    }

    //Displaying Detail Approval
    public void clickDetailApproval() {
        btnDetailApproval.click();
    }

    public boolean displayingDetailApproval() {
        return displayDetailApproval.isDisplayed();
    }

    public void clickCloseDetailApproval() {
        btnCloseDetailApproval.click();
    }

    public void clickRequestApproval() {
        btnRequestApproval.click();
    }

    public void chooseApprovalType(String products) {
        Select b = new Select(selectContainer);
        b.selectByVisibleText(products);
    }

    public void setStartDate(String date1) {
        inputStartDate.sendKeys(date1);
    }

    public void setEndDate(String date2) {
        inputEndDate.sendKeys(date2);
    }

    public void setDescription(String description) {
        inputDescription.sendKeys(description);
    }

    public void chooseImageFile(String image) {
        uploadImage.sendKeys(pathImageApproval + (image));
    }

    public void clickSubmitApproval() {
        btnSubmitApproval.click();
    }

    public boolean displayingErrorRequestApproval() {
        return displayErrorRequestApproval.isDisplayed();
    }

    public boolean displayingRequestApproval() {
        return displayRequestApproval.isDisplayed();
    }

    public boolean displayErrorSizeImage(String errorSize) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }
}
