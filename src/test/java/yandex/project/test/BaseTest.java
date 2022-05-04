package yandex.project.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import utils.ConfigFileReader;
import yandex.framework.browser.Browser;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @BeforeClass
    public void before(){
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        WebDriver driver = Browser.BROWSER.getDriver();
        driver.manage().timeouts().implicitlyWait(20,
                TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
