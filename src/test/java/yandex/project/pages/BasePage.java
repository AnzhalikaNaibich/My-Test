package yandex.project.pages;

import org.openqa.selenium.WebDriver;
import yandex.framework.browser.Browser;

public class BasePage {
    protected Browser browser;

    public BasePage(){
        this.browser = Browser.BROWSER;
    }
}
