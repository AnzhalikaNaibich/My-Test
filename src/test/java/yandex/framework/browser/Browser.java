package yandex.framework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigFileReader;

import java.util.List;

public class Browser {
    private WebDriver driver;
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    public static Browser BROWSER;

    private Browser() {
        this.driver = BrowserFactory.getDriver(config.getNameBrowser());
    }

    public void goTo(String url) {
        this.driver.get(url);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebElement findElement(By locator) {
        return this.driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return this.driver.findElements(locator);
    }

}
