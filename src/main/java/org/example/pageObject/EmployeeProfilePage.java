package org.example.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeProfilePage {

    public static WebDriver driver;

    public EmployeeProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    String pathImage = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";

    @FindBy(xpath = "//p[.='Profile']")
    private WebElement btnProfile;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayProfilePage;

    @FindBy(xpath = "//a[@id='btn-company-profile']")
    private WebElement btnCompanyProfile;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold w-full']")
    private WebElement displayCompanyProfilePage;

    @FindBy(xpath = "//button[@class='flex justify-center items-center tracking-wider bg-sky text-white border-white hover:border-white shadow-md shadow-gray-600 duration-300 active:scale-90 border-2 border-white shadow-md shadow-black rounded-full capitalize md:font-medium gap-2 px-3 text-xs hover:bg-navy py-1 md:py-2 rounded-full']")
    private WebElement btnBackEmployeeProfile;

    @FindBy(xpath = "//label[@id='btn-update-photo']/p[@class='w-36 lg:w-48 text-xs lg:text-base text-center py-2 tracking-wider bg-[#3282B8] text-white hover:border-white font-medium rounded-2xl capitalize border-4 border-white shadow-md shadow-black duration-300 active:scale-90 hover:cursor-pointer']")
    private WebElement btnUpdatePhoto1;

    @FindBy(xpath = "//input[@id='input-photo']")
    private WebElement uploadImg;

    @FindBy(xpath = "//button[@id='btn-photo-submit']")
    private WebElement btnUpdatePhoto2;

    @FindBy(xpath = "//label[@id='btn-update-password']/p[@class='w-36 lg:w-48 text-xs lg:text-base text-center py-2 tracking-wider bg-[#3282B8] text-white hover:border-white font-medium rounded-2xl capitalize border-4 border-white shadow-md shadow-black duration-300 active:scale-90 hover:cursor-pointer']")
    private WebElement btnUpdatePwd1;

    @FindBy(xpath = "//input[@id='input-new-password']")
    private WebElement employeeUpdatePwd;

    @FindBy(xpath = "//button[@id='btn-password-submit']")
    private WebElement btnUpdatePwd2;

    //Button Cancel Update Photo & Password
    @FindBy(xpath = "//label[@id='btn-photo-cancel']")
    private WebElement btnCancelUpdatePhoto;
    @FindBy(xpath = "//label[@id='btn-password-cancel']")
    private WebElement btnCancelUpdatePwd;

    public void clickProfile() {
        btnProfile.click();
    }

    public boolean displayProfilePage() {
        return displayProfilePage.isDisplayed();
    }

    public void clickCompanyProfile() {
        btnCompanyProfile.click();
    }

    public boolean displayCompanyProfilePage() {
        return displayCompanyProfilePage.isDisplayed();
    }

    public void clickBackToEmployeeProfile() {
        btnBackEmployeeProfile.click();
    }

    public void clickUpdatePhoto1() {
        btnUpdatePhoto1.click();
    }
    public void chooseImgFile(String imageFile){
        uploadImg.sendKeys(pathImage+(imageFile));
    }
    public void clickUpdatePhoto2() {
        btnUpdatePhoto2.click();
    }

    public void clickUpdatePwd1() {
        btnUpdatePwd1.click();
    }

    public void setEmployeeUpdatePwd(String pwd) {
        employeeUpdatePwd.sendKeys(String.valueOf(pwd));
    }

    public void clickUpdatePwd2() {
        btnUpdatePwd2.click();
    }

    //Button Cancel Update Photo & Password
    public void clickCancelUpdatePhoto() {
        btnCancelUpdatePhoto.click();
    }
    public void clickCancelUpdatePwd() {
        btnCancelUpdatePwd.click();
    }

    public boolean warningValidatePwd(String errorPwd) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }
}

