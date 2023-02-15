package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.SecureRandom;
import java.util.List;

public class EmployeesAdminPage {

    public static WebDriver driver;

    public EmployeesAdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
    public static final SecureRandom random = new SecureRandom();
    public int randomNumber(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }


    String pathCSV = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";

    @FindBy(id = "btn-sidebar-employees")
    public WebElement clickEmployee;

    public void employeeNavBar(){ clickEmployee.click();}
    @FindBy(css = ".font-extrabold")
    WebElement employeePageDisplayed;

    public boolean employeePageisDisplayed(){
        return employeePageDisplayed.isDisplayed();
    }

    @FindBy(xpath = "//input[@id='input-search']")
    WebElement searchField;

    public void setSearchField(String employee) {
        searchField.sendKeys(employee);
    }

    @FindBy(xpath = "//button[@id='btn-search-submit']")
   WebElement searchBtn;

    public void clickSearchEmployee() {
        searchBtn.click();
    }

    @FindBy(xpath = "//label[@id='btn-import-file']")
    WebElement csvBtn;

    public void clickCSV() {
        csvBtn.click();
    }

    @FindBy(xpath = "//input[@id='input-import-file']")
    WebElement uploadCSV;

    public void uploadCSV(String csvName){
        uploadCSV.sendKeys(pathCSV+csvName);
    }

    @FindBy(xpath = "//button[@id='btn-file-submit']")
    WebElement submitCSV;

    public void submitCSVFile(){
        submitCSV.click();
    }

    @FindBy(xpath = "//label[@id='btn-file-cancel']")
    WebElement cancelCSV;

    public void cancelCSVFile(){
        cancelCSV.click();
    }

    @FindBy(xpath = "//label[@id='btn-add-employee']")
    WebElement addBtn;

    public void addEmployeeBtn(){
        addBtn.click();
    }

    @FindBy(xpath="//input[@id='input-add-name']")
    WebElement nameEmployeeField;

    public void addNameEmployee(String nameEmployee){
        nameEmployeeField.sendKeys(nameEmployee);
    }
    @FindBy(xpath="//input[@id='input-add-email']")
    WebElement emailEmployeeField;

    public void addEmailEmployee(String emailEmployee){
        emailEmployeeField.sendKeys(emailEmployee);
    }

    @FindBy(xpath="//input[@id='input-add-password']")
    WebElement pwdEmployeeField;

    public void addPwdEmployee(String pwdEmployee){
        pwdEmployeeField.sendKeys(pwdEmployee);
    }

    @FindBy(xpath="//input[@id='input-add-phone']")
    WebElement phoneEmployeeField;

    public void addPhoneEmployee(String phoneEmployee){
        phoneEmployeeField.sendKeys(phoneEmployee);
    }

    @FindBy(xpath="//select[@id='select-add-position']")
    WebElement positionEmployeeField;

    public void addPositionEmployee(String pstnEmployee){
        Select b = new Select(positionEmployeeField);
        b.selectByVisibleText(pstnEmployee);
    }

    @FindBy(xpath="//select[@id='select-add-gender']")
    WebElement genderEmployeeContainer;

    public void addGenderEmployee(String genderEmployee){
        Select b = new Select(genderEmployeeContainer);
        b.selectByVisibleText(genderEmployee);
    }


    @FindBy(xpath="//input[@id='input-add-birthdate']")
    WebElement calendarEmployeeInput;

    public void addBirthEmployee(String birthdate){
        calendarEmployeeInput.sendKeys(birthdate);
    }


    @FindBy(xpath="//textarea[@id='input-add-address']")
    WebElement addressEmployeeField;

    public void addAddressEmployee(String addressEmployee){
        addressEmployeeField.sendKeys(addressEmployee);
    }

    @FindBy(xpath="//button[@id='btn-add-submit']")
    WebElement submitAddEmployee;

    public void addSingleEmployee(){
        submitAddEmployee.click();
    }
    public boolean displayNotSubmit(){ return submitAddEmployee.isDisplayed();}

    @FindBy(xpath="//label[@id='btn-add-cancel']")
    WebElement cancelAddBtn;

    public void cancelAddBtn(){
        cancelAddBtn.click();
    }

    @FindBy(xpath = "//*[contains(@id,'btn-edit-employee')]")
    public List<WebElement> editProfileBtn;

    public void editEmployeeProfileBtn(){
        int j = randomNumber(12, editProfileBtn.size() - 1);
        editProfileBtn.get(j).click();
    }

    @FindBy(xpath = "//div[@class='undefined p-10']/div[1]//button[@class='mx-3 text-sky hover:cursor-pointer hover:text-red-600']")
    WebElement delEmployeeBtn;

    public void delEmployeeProfileBtn(){
        delEmployeeBtn.click();
    }

    @FindBy(xpath = "//h2[@class='swal2-title']")
    WebElement warningMsgDelEmployee;

    public boolean warningMsgisDisplayed(){
        return warningMsgDelEmployee.isDisplayed();
    }

    @FindBy(css = ".swal2-confirm")
    WebElement yesDeleteEmployee;

    public void yesDeleteEmployeeBtn(){
        yesDeleteEmployee.click();
    }

    @FindBy(css = ".swal2-cancel")
    WebElement cancelDeleteEmployee;

    public void cancelDeleteEmployeeBtn(){
        cancelDeleteEmployee.click();
    }

    @FindBy(xpath = "//p[.='Bennet']")
    WebElement clickNameEmployee;

    public void employeeNameBtn(){
        clickNameEmployee.click();
    }
    @FindBy(xpath = "//div[49]//p[@class='text-right font-bold xl:text-lg text-navy duration-300 hover:cursor-pointer active:scale-95']")
    WebElement clickRoleEmployee;

    public void roleEmployeeProfileBtn(){
        clickRoleEmployee.click();

    }


    @FindBy(xpath = "//input[@id='input-edit-name']")
    WebElement editEmployeeName;

    public void editNameEmployee(String nameEmployee){
        editEmployeeName.clear();
        editEmployeeName.sendKeys(nameEmployee);
    }

    @FindBy(xpath = "//input[@id='input-edit-email']")
    WebElement editEmployeeEmail;

    public void editEmailEmployee(String emailEmployee){
        editEmployeeEmail.clear();
        editEmployeeEmail.sendKeys(emailEmployee);
    }

    @FindBy(xpath = "//input[@id='input-edit-password']")
    WebElement editEmployeePwd;

    public void editPwdEmployee(String pwdEmployee){
        editEmployeePwd.clear();
        editEmployeePwd.sendKeys(pwdEmployee);
    }

    @FindBy(xpath = "//input[@id='input-edit-phone']")
    WebElement editEmployeePhone;

    public void editPhoneEmployee(String phoneEmployee){
        editEmployeePhone.clear();
        editEmployeePhone.sendKeys(phoneEmployee);
    }

    @FindBy(xpath = "//select[@id='select-edit-position']")
    WebElement editEmployeeRole;

    public void editRoleEmployee(String roleEmployee){
        Select b = new Select(editEmployeeRole);
        b.selectByVisibleText(roleEmployee);
    }

    @FindBy(xpath = "//select[@id='select-edit-gender']")
    WebElement editEmployeeGender;

    public void editGenderEmployee(String genderEmployee){
        Select b = new Select(editEmployeeGender);
        b.selectByVisibleText(genderEmployee);
    }

    @FindBy(xpath = "//input[@id='input-edit-birthdate']")
    WebElement editEmployeeBirth;

    public void editBdayEmployee(String birthEmployee){
        editEmployeeBirth.clear();
        editEmployeeBirth.sendKeys(birthEmployee);
    }

    @FindBy(xpath = "//textarea[@id='input-edit-address']")
    WebElement editEmployeeAddress;

    public void editAddressEmployee(String addressEmployee){
        editEmployeeAddress.clear();
        editEmployeeAddress.sendKeys(addressEmployee);
    }

    @FindBy(xpath = "//div[@class='modal-box pt-52 border-2 border-sky flex flex-col justify-center text-sky']//button[@class='w-24 text-sm text-center border-2 border-sky bg-sky rounded-xl py-1 text-gray-50 font-medium duration-300 hover:cursor-pointer  hover:bg-blue-900  active:scale-90 disabled:bg-gray-300 disabled:text-gray-400 disabled:border-gray-300 disabled:cursor-not-allowed disabled:active:scale-100']")
    public WebElement submitBtn;

    public void submitEditEmployeeProfileBtn(){
        submitBtn.click();
    }

    @FindBy(css = "w-24 text-sm text-center border-2 border-sky rounded-xl py-1 text-sky font-medium duration-300 hover:cursor-pointer hover:bg-red-600 hover:text-white  active:scale-90 disabled:bg-gray-300 disabled:text-gray-400 disabled:border-gray-300 disabled:cursor-not-allowed disabled:active:scale-100")
    WebElement cancelBtn;

    public void cancelEditEmployeeProfileBtn(){
        cancelBtn.click();
    }

    @FindBy(xpath = "//p[.='Alif']")
    WebElement showName;

    public boolean showEmployeeName(){ return showName.isDisplayed();}

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    WebElement successCreate;
    public boolean successCreate(){ return successCreate.isDisplayed();}

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    WebElement showProfile;

    public boolean employeeProfileIsDisplayed(){return showProfile.isDisplayed();}

    @FindBy(xpath = "//button[@id='btn-back']")
    WebElement backToEmployee;

    public void backEmployeePage(){backToEmployee.click();}


    @FindBy(xpath = "//div[52]//button[@class='text-sky hover:cursor-pointer hover:text-red-600']")
    WebElement delEmploy;

    public void deleteEmployeeBtn(){delEmploy.click();}


}
