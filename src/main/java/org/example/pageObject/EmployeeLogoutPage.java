package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeLogoutPage {


    public static WebDriver driver;

    public EmployeeLogoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='flex justify-center items-center mx-7 px-5 py-3 border-2 border-white rounded-xl shadow-md shadow-black gap-1 font-bold text-yellow-400 duration-300 hover:cursor-pointer active:scale-90']")
    private WebElement btnLogout;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYesLogout;

    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement displayLoginPage;

    public void clickLogout() {
        btnLogout.click();
    }

    public void clickYesLogout() {
        btnYesLogout.click();
    }

    public boolean displayingLoginPage() {
        return displayLoginPage.isDisplayed();
    }

}
