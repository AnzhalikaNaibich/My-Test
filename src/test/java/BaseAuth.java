import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigFileReader;
import yandex.framework.Browser;

import java.util.concurrent.TimeUnit;

public class BaseAuth {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private String login = "user";
    private String password = "passwd";

    @Test
    public void Auth () {
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://" + login + ":" + password + "@" + "httpbin.org/basic-auth/user/passwd");
    }
}


