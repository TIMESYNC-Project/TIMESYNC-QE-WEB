package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.EmployeeLogoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EmployeeLogoutSteps {

    private WebDriver webDriver;

    public EmployeeLogoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Employee click on logout button")
    public void employeeClickOnLogoutButton() throws InterruptedException {
        EmployeeLogoutPage employeeLogoutPage = new EmployeeLogoutPage(webDriver);
        employeeLogoutPage.clickLogout();
        Thread.sleep(3000);
    }

    @And("Employee click yes button")
    public void employeeClickYesButton() throws InterruptedException {
        EmployeeLogoutPage employeeLogoutPage = new EmployeeLogoutPage(webDriver);
        employeeLogoutPage.clickYesLogout();
        Thread.sleep(3000);
    }

    @Then("Login page is displayed")
    public void loginPageIsDisplayed() throws InterruptedException {
        EmployeeLogoutPage employeeLogoutPage = new EmployeeLogoutPage(webDriver);
        Assert.assertTrue(employeeLogoutPage.displayingLoginPage());
        Thread.sleep(3000);

    }

}
