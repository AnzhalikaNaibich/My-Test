package yandex.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private static WebDriver driver;
    private Browser () {}

    public static WebDriver getDriver (){
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
