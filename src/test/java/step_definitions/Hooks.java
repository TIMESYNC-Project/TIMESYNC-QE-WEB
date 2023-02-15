package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

// setup untuk cucumber BDD
public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser(Scenario scenario) {

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();

        prefs.put("googlegeolocationaccess.enabled", true);
        if (scenario.getName().contains("without location")) {
            prefs.put("profile.default_content_setting_values.geolocation", 0); // 1:allow 2:block
        }else {
            prefs.put("profile.default_content_setting_values.geolocation", 1); // 1:allow 2:block
        }
        prefs.put("profile.default_content_setting_values.notifications", 1);
        prefs.put("profile.managed_default_content_settings", 1);
        options.setExperimentalOption("prefs", prefs);

        webDriver = new ChromeDriver(options);
        String appUrl = "https://mytimesync.vercel.app/";
        webDriver.get(appUrl);

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.quit();
    }
}