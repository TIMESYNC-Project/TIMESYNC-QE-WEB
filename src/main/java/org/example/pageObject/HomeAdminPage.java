package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAdminPage {
    public static WebDriver driver;

    public HomeAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement dashboardAdmin;

    @FindBy(xpath="//h1[.='total employees']")
    private WebElement totalEmployees;

    @FindBy(xpath="//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement employeesPage;

    @FindBy(xpath = "//h1[.='employees']")
    private WebElement employeesList;

    @FindBy(xpath = "//h1[.='inbox']")
    private WebElement inbox;

    @FindBy(xpath="//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement inboxPage;

    @FindBy(xpath = "//p[.='Traffic total working hours by weekly']")
    private WebElement workingHours;

    @FindBy(xpath = "//p[.='Traffic total late employees by weekly']")
    private WebElement lateEmployee;


    public void clickTotalEmployee() {
        totalEmployees.click();
    }

    public void clickEmployeeList() {
        employeesList.click();
    }

    public void clickInbox() {
        inbox.click();
    }
    public boolean dashboardIsDisplayed(){
        return dashboardAdmin.isDisplayed();
    }

    public boolean employeesIsDisplayed(){
        return employeesPage.isDisplayed();
    }

    public boolean inboxIsDisplayed(){
        return inboxPage.isDisplayed();
    }

    public boolean workingHoursIsDisplayed(){
        return workingHours.isDisplayed();
    }

    public boolean lateEmployeeIsDisplayed(){
        return lateEmployee.isDisplayed();
    }
}
