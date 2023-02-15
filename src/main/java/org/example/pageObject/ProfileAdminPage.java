package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ProfileAdminPage {

    public static WebDriver driver;

    public ProfileAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    String pathImage = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";

    @FindBy(xpath = "//a[@id='btn-sidebar-profile']")
    WebElement sideProfileBtn;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold w-full']")
    private WebElement profilePage;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold w-full']")
    private WebElement companyProfile;

    @FindBy(xpath = "//img[@alt='photo']")
    private WebElement companyLogo;

    @FindBy(xpath = "//p[@class='xl:w-48 btn tracking-wider bg-[#3282B8] text-white hover:border-white font-medium rounded-2xl capitalize border-4 border-white shadow-md shadow-black']")
    private WebElement updateBtn;

    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement editNameField;

    @FindBy(xpath = "//input[@id='input-phone']")
    private WebElement editPhoneField;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement editEmailField;

    @FindBy(xpath = "//input[@id='input-social-media']")
    private WebElement editSocMedField;

    @FindBy(xpath = "//textarea[@id='input-address']")
    private WebElement editAddressField;

    @FindBy(xpath = "//textarea[@id='input-description']")
    private WebElement editDescField;

    @FindBy(xpath = "//input[@id='input-picture']")
    private WebElement editLogosField;

    @FindBy(xpath = "//button[@id='btn-company-submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//label[@id='btn-company-cancel']")
    private WebElement cancelBtn;

    @FindBy(css = ".modal-box")
    private WebElement popUpDisplay;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement msgSubmit;

    @FindBy(xpath = "//input[@id='input-picture']")
    private WebElement addPicBtn;

    public boolean profilePageIsDisplayed(){
        return profilePage.isDisplayed();
    }

    public boolean profileIsDisplayed(){
        return companyProfile.isDisplayed();
    }

    public boolean companyLogoIsDisplayed(){
        return companyLogo.isDisplayed();
    }

    public String getMsgSubmit(){
        return msgSubmit.getText();
    }

    public boolean updatePopUpIsDisplayed(){
        return companyLogo.isDisplayed();
    }

    public void clickProfile() {
        sideProfileBtn.click();
    }

    public void clickUpdateCompany() {
        updateBtn.click();
    }

    public void setCompanyName(String cpName) {
        editNameField.clear();
        editNameField.sendKeys(cpName);
    }

    public void setCompanyPhone(String cpPhone) {
        editPhoneField.clear();
        editPhoneField.sendKeys(cpPhone);
    }

    public void setCompanyEmail(String cpEmail) {
        editEmailField.clear();
        editEmailField.sendKeys(cpEmail);
    }

    public void setCompanySocmed(String cpSocMed) {
        editSocMedField.clear();
        editSocMedField.sendKeys(cpSocMed);
    }

    public void setCompanyAddress(String cpAddress) {
        editAddressField.clear();
        editAddressField.sendKeys(cpAddress);
    }

    public void setCompanyDesc(String cpDesc) {
        editDescField.clear();
        editDescField.sendKeys(cpDesc);
    }

    public void setCompanyLogo(String photosName) {
        editLogosField.sendKeys(pathImage+photosName);
    }

    public void clickSubmitUpdate() {
        submitBtn.click();
    }

    public void clickCancelUpdate() {
        cancelBtn.click();
    }


}

