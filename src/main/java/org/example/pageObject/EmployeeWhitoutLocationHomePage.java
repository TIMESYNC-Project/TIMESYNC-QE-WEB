package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeWhitoutLocationHomePage {

    public static WebDriver driver;

    public EmployeeWhitoutLocationHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean displayErrorMessageClockIn(String errorMsgIn) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }

    public boolean displayErrorMessageClockOut(String errorMsgOut) {
        String a = driver.findElement(By.xpath("//div[@class='swal2-html-container']")).getText();
        return true;
    }

}
