package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    //ADMIN
    @Given("Admin open the website timesync")
    public void adminOpenTheWebsiteTimesync() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
        Assert.assertTrue(loginPage.isDisplayed());
        Thread.sleep(3000);
    }

    @When("Admin input \"([^\"]*)\" as NIP and input \"([^\"]*)\" as password")
    public void adminInputAsNIPAndInputAsPassword(String NIP, String pwd) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmployeeNIP(NIP);
        loginPage.setEmployeePwd(pwd);
        Thread.sleep(3000);
    }

    @And("Admin click login button")
    public void adminClickLoginButton() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("Admin can see error \"([^\"]*)\" on login page")
    public void adminCanSeeErrorOnLoginPage(String errorText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.getErrorText());
        Thread.sleep(5000);
    }

    @And("Admin click OK button")
    public void adminClickOKButton() throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickOK();
        Thread.sleep(3000);
    }


    //EMPLOYEE
    @Given("Employee open the website timesync")
    public void employeeOpenTheWebsiteTimesync() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
        Assert.assertTrue(loginPage.isDisplayed());
        Thread.sleep(3000);
    }

    @When("Employee input \"([^\"]*)\" as NIP and input \"([^\"]*)\" as password")
    public void employeeInputAsNIPAndInputAsPassword(String NIP, String pwd) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmployeeNIP(NIP);
        loginPage.setEmployeePwd(pwd);
        Thread.sleep(3000);
    }

    @And("Employee click login button")
    public void clickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("Employee can see error \"(.*)\" on login page")
    public void errorText(String errorText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginPage.getErrorText());
        Thread.sleep(5000);
    }

    @And("Employee click OK button")
    public void clickOKButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickOK();
        Thread.sleep(3000);
    }
}
