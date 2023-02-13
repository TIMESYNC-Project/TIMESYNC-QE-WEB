package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='input-nip']")
    private WebElement employeeNIP;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement employeePwd;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement errMsg;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement OKbtn;

    @FindBy(xpath = "//input[@id='checkbox-show-password']")
    private WebElement checkBox;

    public void clickCheckBox() {
        checkBox.click();
    }

    public void setEmployeeNIP(String user) {
        employeeNIP.sendKeys(user);
    }

    public void setEmployeePwd(String pwd) {
        employeePwd.sendKeys(pwd);
    }

    public String getErrorText(){
        return errMsg.getText();}

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickOK() {
        OKbtn.click();
    }

    public boolean isDisplayed(){
        return employeeNIP.isDisplayed();
    }


}