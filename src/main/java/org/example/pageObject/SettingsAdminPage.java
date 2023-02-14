package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsAdminPage {

    public static WebDriver driver;

    public SettingsAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(xpath = "//a[@id='btn-sidebar-settings']")
    private WebElement sidebarBtn;

    public void settingsSideBar(){sidebarBtn.click();}
    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement settingsPage;

    public boolean settingsPageisDisplayed(){
        return settingsPage.isDisplayed();
    }
    // dari sini kebawah tipe inputnya apa ya euy
    @FindBy(xpath = "//input[@id='input-start-hour']")
    private WebElement inputStartHour;

    public void setInputStartHour(String start){
        inputStartHour.clear();
        inputStartHour.sendKeys(start);
    }

    @FindBy(xpath = "//input[@id='input-end-hour']")
    private WebElement inputEndHour;

    public void setInputEndHour(String end){
        inputEndHour.clear();
        inputEndHour.sendKeys(end);
    }


    @FindBy(xpath = "//input[@id='input-tolerancy']")
    private WebElement timeMin;

    public void setTolerancyMin(String tolerancyMin){
        timeMin.clear();
        timeMin.sendKeys(tolerancyMin);
    }

    @FindBy(xpath = "//input[@id='input-annual-leaves']")
    private WebElement leaveDay;

    public void setLeaveDay(String leftDay){
        leaveDay.clear();
        leaveDay.sendKeys(leftDay);
    }

    @FindBy(xpath = "//button[@id='btn-save-settings']")
    private WebElement saveSett;

    public void saveSettingsBtn(){
        saveSett.click();
    }

    @FindBy(xpath = "//div[@id='btn-sidebar-logout']")
    private WebElement logout;

    public void clickLogout(){
        logout.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement warningLogOut;

    public boolean warningOutMsgisDisplayed(){
        return warningLogOut.isDisplayed();
    }

    @FindBy(css = ".swal2-confirm")
    private WebElement yesLogOut;

    public void warningYesBtn(){
        yesLogOut.click();
    }

    @FindBy(css = ".swal2-cancel")
    private WebElement noLogOut;

    public void warningNoBtn(){
        noLogOut.click();
    }


}
