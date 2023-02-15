package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.SecureRandom;
import java.util.List;

public class RecordsAdminPage {

    public static final SecureRandom random = new SecureRandom();

    public static WebDriver driver;

    public int randomNumber(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

    public RecordsAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    @FindBy(css = "#btn-sidebar-records")
    WebElement recordsSideBtn;

    public void recordsSideBtn(){
        recordsSideBtn.click();
    }


    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")

    private WebElement recordsPageDisplay;

    public boolean recordsPageisDisplayed(){
        return recordsPageDisplay.isDisplayed();
    }

    @FindBy(css = ".rounded-2xl")
    private WebElement employeeRecords;

    public void getEmployeeRecords(){
        employeeRecords.click();
    }

    @FindBy(xpath = "//input[@id='input-search']")
    private WebElement searchRecords;

    public void searchRecordsonAdmin(String nameEmployee){
        searchRecords.sendKeys(nameEmployee);
    }
    @FindBy(id = "btn-detail-records")
    public List<WebElement> selected;

    public void clickSelected() {
        int j = randomNumber(8, selected.size() - 1);
        selected.get(j).click();
    }

    @FindBy(xpath = "//button[@id='btn-search']")
    private WebElement searchBtn;

    public void searchRecordsBtn(){
        searchBtn.click();
    }

    @FindBy(xpath = "//p[@class='text-xl font-bold text-navy']")
    private WebElement nameEmployeeRecord;

    public boolean employeeNameDetailRecordsisDisplayed(){
        return nameEmployeeRecord.isDisplayed();
    }

    @FindBy(css = ".rounded-2xl")
    private WebElement detailedMore;

    public void employeeDetailCheckin(){
        detailedMore.click();
    }

    @FindBy(xpath = "//p[@class='uppercase text-xl font-bold text-[#FFC909]']")

    private WebElement NewAtdPageDisplay;

    public boolean NewAtdPageisDisplayed(){
        return NewAtdPageDisplay.isDisplayed();
    }

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement detailedRecords;

    public boolean detailedRecordsisDisplayed(){
        return detailedRecords.isDisplayed();
    }

    @FindBy(xpath = "//label[@id='btn-cancel-detail']")
    private WebElement cancelDetailed;

    public void cancelDetailedRecords(){
        cancelDetailed.click();
    }

    @FindBy(xpath = "//select[@id='select-date-recods']")
    private WebElement selectDateRecords;

    public void recordsDate(String dateRecords){
        Select b = new Select(selectDateRecords);
        b.selectByVisibleText(dateRecords);
    }

    @FindBy(xpath = "//p[.='Create Attendance']")
    private WebElement popUpShow;

    public boolean createNewPopUpIsDisplayed(){ return popUpShow.isDisplayed();}
    @FindBy(css = ".cursor-pointer")
    private WebElement createAttendance;

    public void createNewAttendance(){
        createAttendance.click();
    }



    @FindBy(xpath = "//select[@id='select-attendance']")
    private WebElement selectAttendance;

    public void selectAttendanceType(String typeAttendance){
        Select b = new Select(selectAttendance);
        b.selectByVisibleText(typeAttendance);
    }

    @FindBy(id = "input-date-range-picker")
    private WebElement clickdate;

    public void clickDateRecords(){
        clickdate.click();
    }


    public void startDateRecords(String startDate){
        WebElement dateStart = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+startDate+"']"));
        dateStart.click();
    }


    public void endDateRecords(String endDate){
        WebElement dateEnd = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+endDate+"']"));
        dateEnd.click();
    }


    @FindBy(xpath = "//label[@id='btn-cancel-attendance']")
    private WebElement cancelAttendance;

    public void cancelAttendanceBtn(){
        cancelAttendance.click();
    }

    @FindBy(xpath = "//button[@id='btn-submit-attendance']")
    private WebElement submitAttendance;

    public void submitAttendanceBtn(){
        submitAttendance.click();
    }

    @FindBy(xpath = "//div[@id='btn-date-range-picker']")
    WebElement searchDateRecords;

    public void searchWithDate(){searchDateRecords.click();}

    @FindBy(xpath = "//input[@id='input-date-start']")
    WebElement dateStartAtdc;

    public void addStartDateAttend(String dateStart){
        dateStartAtdc.sendKeys(dateStart);
    }

    @FindBy(xpath = "//input[@id='input-date-end']")
    WebElement dateEndAtdc;

    public void addEndDateAttend(String dateEnd){dateEndAtdc.sendKeys(dateEnd);}

}
