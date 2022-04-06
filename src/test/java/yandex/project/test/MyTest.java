package yandex.project.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ConfigFileReader;
import yandex.framework.Browser;
import yandex.project.pages.Authorization;
import yandex.project.pages.Catalog;

public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @Test
    public void firstTestSignIn() {
        WebDriver driver = Browser.getDriver();
        driver.get(config.getApplicationUrl());

        Authorization authorization = new Authorization(driver);
        authorization.clickSignIn();
        authorization.authorizationOnWeb();
    }
    @Test
    public void secondTestCatalog() {
        WebDriver driver = Browser.getDriver();
        driver.get(config.getApplicationUrl());

        Catalog catalog = new Catalog(driver);
        catalog.clickCatalog();
        catalog.countSections();
        catalog.clickSection();
    }
}
