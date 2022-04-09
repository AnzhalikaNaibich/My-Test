package yandex.project.test;
import org.testng.annotations.Test;
import utils.ConfigFileReader;
import yandex.project.pages.Authorization;
import yandex.project.pages.Catalog;
import yandex.project.pages.JSAlert;

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

    @Test
    public void thirdTestAlert(){
        JSAlert alert = new JSAlert();
        alert.openWebAlert();
        alert.checkClickButtons();
        alert.sendText("Hello, word");
    }
}
