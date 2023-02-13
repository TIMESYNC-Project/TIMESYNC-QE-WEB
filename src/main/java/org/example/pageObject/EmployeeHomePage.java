package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeHomePage {

    public static WebDriver driver;

    public EmployeeHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayEmployeeAttendancePage;

    @FindBy(xpath = "//p[@class='mx-2 capitalize text-black text-center text-sm lg:text-xl']")
    private WebElement displayLocation;

    @FindBy(xpath = "//button[@id='btn-clockin']")
    private WebElement btnClockIn;

    @FindBy(xpath = "//p[.='clock in']")
    private WebElement displayLogsClockIn;

    @FindBy(xpath = "//button[@id='btn-clockout']")
    private WebElement btnClockOut;

    @FindBy(xpath = "//p[.='clock out']")
    private WebElement displayLogsClockOut;

    @FindBy(xpath = "//p[@class='text-black text-sm lg:text-base text-right capitalize font-medium']")
    private WebElement btnSeeMore;

    public boolean displayEmployeeAttendancePage() {
        return displayEmployeeAttendancePage.isDisplayed();
    }

    public boolean displayLocation() {
        return displayLocation.isDisplayed();
    }

    public void clickClockIn() {
        btnClockIn.click();
    }

    public boolean warningAlreadyClockIn(String alreadyMsgIn) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }

    public boolean warningAlreadyClockOut(String alreadyMsgOut) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }

    public boolean displayLogsClockIn() {
        return displayLogsClockIn.isDisplayed();
    }

    public void clickClockOut() {
        btnClockOut.click();
    }

    public boolean displayLogsClockOut() {
        return displayLogsClockOut.isDisplayed();
    }

    public void clickSeeMore() {
        btnSeeMore.click();
    }


}
