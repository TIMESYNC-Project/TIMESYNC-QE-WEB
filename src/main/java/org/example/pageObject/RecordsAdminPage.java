package org.example.pageObject;

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
    private WebElement recordsSideBtn;

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

    @FindBy(css = ".react-datepicker__day--020")
    private WebElement dateStart;

    public void startDateRecords(){
        dateStart.click();
    }

    @FindBy(css = ".react-datepicker__day--022")
    private WebElement dateEnd;

    public void endDateRecords(){
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

}
