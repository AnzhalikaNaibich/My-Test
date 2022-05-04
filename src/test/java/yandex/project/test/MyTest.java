package yandex.project.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import yandex.framework.browser.Browser;
import yandex.project.pages.Authorization;
import yandex.project.pages.Catalog;

public class MyTest extends BaseTest {
    WebDriver driver = Browser.BROWSER.getDriver();
    @Test
    public void firstTestSignIn() {
        Authorization authorization = new Authorization();
        authorization.open();
        authorization.clickSignIn();
        authorization.authorizationOnWeb();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/div/button/div/img")).isDisplayed(), "you don't authorization");
    }
    @Test
    public void secondTestCatalog() {
        Catalog catalog = new Catalog();
        catalog.clickCatalog();
        catalog.countSections();
        catalog.clickSection();
        Assert.assertTrue(driver.findElement(By.className("_39qdP")).isDisplayed(), "computers partition didn't open");
    }
}
