package yandex.project.pages;

import utils.ConfigFileReader;
import yandex.framework.browser.cookie.CookieManager;

public class ExamplePage extends BasePage{
    private ConfigFileReader config =  ConfigFileReader.configFileReader;

    public ExamplePage() {
    }

    public void open(){
        browser.goTo(config.getApplicationUrlExample());
    }
}
