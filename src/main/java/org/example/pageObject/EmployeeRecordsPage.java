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

    @FindBy(xpath = "//div[@id='btn-date-range-picker']")
    private WebElement btnSearchRecords;

    @FindBy(xpath = "//div[@class='undefined p-3 md:p-6 xl:p-10']/div[@class='my-5 xl:mx-24 undefined']/div[contains(.,'Feb 09 202310:49-13:01present')]")
    private WebElement displayRecordsList;

    public void clickRecords() {
        btnRecords.click();
    }

    public boolean displayRecordsPage() {
        return displayRecordsPage.isDisplayed();
    }

    public void clickDateField() {
        btnDate.click();
    }

    public void clickInputStartDate(String startDate) {
        WebElement btnStartDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--"+startDate+" react-datepicker__day--weekend']"));
        btnStartDate.click();
    }

    public void clickInputEndDate(String endDate) {
        WebElement btnEndDate = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--"+endDate+"']"));
        btnEndDate.click();
    }

    public void clickSearchRecords() {
        btnSearchRecords.click();
    }

    public boolean displayRecordsList() {
        return displayRecordsList.isDisplayed();
    }

}
