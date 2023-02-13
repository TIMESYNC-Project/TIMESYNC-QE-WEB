package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class EmployeeInboxPage {

    public static WebDriver driver;

    public EmployeeInboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//p[.='Inbox']")
    private WebElement btnInbox;

    @FindBy(xpath = "//h1[@class='capitalize text-xl md:text-2xl lg:text-3xl font-extrabold undefined']")
    private WebElement displayInboxPage;

    @FindBy(xpath = "//div[@class='undefined p-3 md:p-6 xl:p-10']/div[1]//p[@class='text-black capitalize']")
    private WebElement btnDetailInbox;

    @FindBy(xpath = "//div[@class='h-full w-full overflow-auto mt-20']/div[2]//p[@class='mb-5 pb-2 text-2xl border-b-2 font-bold text-black']")
    private WebElement displayDetailInbox;

    @FindBy(xpath = "//div[@class='h-full w-full overflow-auto mt-20']/div[2]//label[@class='w-28 text-sm text-center border-2 border-sky rounded-xl py-1 text-sky font-medium duration-300 hover:cursor-pointer hover:bg-red-600 hover:text-white  active:scale-90']")
    private WebElement btnCloseDetailInbox;

    @FindBy(xpath = "//img[@alt='logo-app']")
    private WebElement btnTimesyncIcon;

    public void clickInbox() {
        btnInbox.click();
    }

    public boolean displayingInboxPage() {
        return displayInboxPage.isDisplayed();
    }

    public void clickDetailInbox() {
        btnDetailInbox.click();
    }

    public boolean displayingDetailInbox() {
        return displayDetailInbox.isDisplayed();
    }

    public void clickCloseDetailInbox() {
        btnCloseDetailInbox.click();
    }

    public void clickTimesyncIcon() {
        btnTimesyncIcon.click();
    }

}
