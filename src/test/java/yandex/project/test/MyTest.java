package yandex.project.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.ConfigFileReader;
import yandex.framework.browser.Browser;
import yandex.project.pages.Authorization;
import yandex.project.pages.Catalog;

public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @Test
    public void firstTestSignIn() {
        Authorization authorization = new Authorization();
        authorization.open();
        authorization.clickSignIn();
        authorization.authorizationOnWeb();
    }
    @Test
    public void secondTestCatalog() {
        Catalog catalog = new Catalog();
        catalog.clickCatalog();
        catalog.countSections();
        catalog.clickSection();
    }
}
