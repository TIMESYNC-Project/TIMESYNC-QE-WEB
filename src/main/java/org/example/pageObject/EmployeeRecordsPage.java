package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeRecordsPage {

    public static WebDriver driver;

    public EmployeeRecordsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[.='Records']")
    private WebElement btnRecords;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayRecordsPage;

    @FindBy(xpath = "//input[@id='input-date-range-picker']")
    private WebElement btnDate;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--005 react-datepicker__day--weekend']")
    private WebElement btnStartDate;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--009']")
    private WebElement btnEndDate;

    @FindBy(xpath = "//div[@id='btn-date-range-picker']")
    private WebElement btnSearchRecords;


    public void clickRecords() {
        btnRecords.click();
    }

    public boolean displayRecordsPage() {
        return displayRecordsPage.isDisplayed();
    }

    public void clickDateField() {
        btnDate.click();
    }
    public void clickInputStartDate() {
        btnStartDate.click();
    }
    public void clickInputEndDate() {
        btnEndDate.click();
    }

//    public void clickInputStartDate1(String startDate) {
//        btnStartDate.click();
//    }
//    public void clickInputEndDate1(String endDate) {
//        btnEndDate.click();
//    }

    public void clickSearchRecords() {
        btnSearchRecords.click();
    }

}
