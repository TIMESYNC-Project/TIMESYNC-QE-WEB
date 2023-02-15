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

    @FindBy(id = "btn-sidebar-employees")
    WebElement employeesPage;

    @FindBy(xpath = "//h1[.='employees']")
    private WebElement employeesList;

    @FindBy(xpath = "//div[@class='box-border w-full bg-white rounded-2xl border-sky border-2 p-3 xl:p-5 undefined']")
    private WebElement inbox;

    @FindBy(xpath="//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    WebElement inboxPage;

    @FindBy(xpath = "//p[.='Traffic total working hours by month']")
    private WebElement workingHours;

    @FindBy(xpath = "//p[.='Traffic total late employees by month']")
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
