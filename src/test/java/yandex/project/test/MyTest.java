package yandex.project.test;
import org.testng.annotations.Test;
import utils.ConfigFileReader;
import yandex.framework.browser.cookie.CookieManager;
import yandex.project.pages.Authorization;
import yandex.project.pages.Catalog;
import yandex.project.pages.ExamplePage;
import yandex.project.pages.JSAlert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private String name1 = "name_1";
    private String name2 = "name_2";
    private String name3 = "name_3";
    private String value1 = "value_1";
    private String value2 = "value_2";
    private String value3 = "value_3";

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

    @Test
    public void thirdTestAlert(){
        JSAlert alert = new JSAlert();
        alert.openWebAlert();
        alert.checkClickButtons();
        alert.sendText("Hello, word");
    }
    @Test
    public void TestCookieAdd() {
        ExamplePage example = new ExamplePage();
        example.open();
        CookieManager.addCookie(name1, value1);
        CookieManager.addCookie(name2, value2);
        CookieManager.addCookie(name3, value3);

        assertEquals(CookieManager.sizeCookies(), 3, "Don't add");

        CookieManager.deleteCookieNamed(name2);
        assertTrue(CookieManager.cookieIsDelete(name2), "Cookie don't delete");

        CookieManager.setNewNValue(name1, "value_5");
    }
}
