package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// setup untuk cucumber BDD
public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        webDriver = new ChromeDriver();
        String appUrl = "https://mytimesync.vercel.app/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}