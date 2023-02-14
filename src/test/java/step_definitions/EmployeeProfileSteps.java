package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.EmployeeApprovalPage;
import org.example.pageObject.EmployeeHomePage;
import org.example.pageObject.EmployeeProfilePage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static step_definitions.Hooks.webDriver;

public class EmployeeProfileSteps {

    private WebDriver webDriver;

    public EmployeeProfileSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("Employee click on profile button")
    public void employeeClickOnProfileButton() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickProfile();
        Thread.sleep(3000);
    }

    @Then("System will showing profile page")
    public void systemWillShowingProfilePage() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        Assert.assertTrue(employeeProfilePage.displayProfilePage());
        Thread.sleep(3000);
    }

    @And("Employee click on company profile")
    public void employeeClickOnCompanyProfile() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickCompanyProfile();
        Thread.sleep(3000);
    }

    @Then("System will showing company profile page")
    public void systemWillShowingCompanyProfilePage() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        Assert.assertTrue(employeeProfilePage.displayCompanyProfilePage());
        Thread.sleep(3000);
    }

    @And("Employee click back to employee's profile")
    public void backToEmployeeSProfile() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickBackToEmployeeProfile();
        Thread.sleep(3000);
    }

    @Then("Employee click on update photo button")
    public void employeeClickOnUpdatePhotoButton() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickUpdatePhoto1();
        Thread.sleep(3000);
    }

    @Then("Employee click update button for photo")
    public void employeeClickUpdateBtnForPhoto() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickUpdatePhoto2();
        Thread.sleep(3000);
    }

    @Then("Employee click on update password button")
    public void employeeClickOnUpdatePasswordButton() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickUpdatePwd1();
        Thread.sleep(3000);
    }

    @And("Employee input new password with \"([^\"]*)\"")
    public void employeeInputNewPasswordWith(String pwd) throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.setEmployeeUpdatePwd(pwd);
        Thread.sleep(3000);
    }

    @Then("Employee click update button for password")
    public void employeeClickUpdateBtnForPwd() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickUpdatePwd2();
        Thread.sleep(3000);
    }

    @And("Employee choose image input photo \"([^\"]*)\"")
    public void employeeChooseJpgInputPhoto(String imageFile) throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.chooseImgFile(imageFile);
        Thread.sleep(3000);
    }

    //Button Cancel Update Photo & Password
    @And("Employee click cancel update photo")
    public void employeeClickCancelUpdatePhoto() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickCancelUpdatePhoto();
        Thread.sleep(3000);
    }

    @And("Employee click cancel update password")
    public void employeeClickCancelUpdatePassword() throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        employeeProfilePage.clickCancelUpdatePwd();
        Thread.sleep(3000);
    }

    @Then("System will showing warning \"([^\"]*)\"")
    public void systemWillShowingWarningValidateIsNotAlphanium(String errorPwd) throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        Assert.assertTrue(employeeProfilePage.warningValidatePwd(errorPwd));
        Thread.sleep(3000);
    }

    @Then("System will showing error message for profile image upload \"([^\"]*)\"")
    public void systemWillShowingErrorMessageForProfileImageUpload(String errorSize) throws InterruptedException {
        EmployeeProfilePage employeeProfilePage = new EmployeeProfilePage(webDriver);
        Assert.assertTrue(employeeProfilePage.displayErrorSizeImageProfile(errorSize));
        Thread.sleep(6000);
    }
}