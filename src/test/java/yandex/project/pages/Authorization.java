package yandex.project.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigFileReader;
import yandex.framework.browser.Browser;


public class Authorization extends BasePage {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private By signIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a");
    private By inputLogin = By.id("passp-field-login");
    private By buttonSingIn = By.id("passp:sign-in");
    private By inputPassword = By.id("passp-field-passwd");
    private By buttonLogin= By.id("passp:sign-in");

    public Authorization() {
    }
    public void open() {
        browser.goTo(config.getApplicationUrl());
    }

    public void clickSignIn() {
        browser.findElement(signIn).click();
    }

    public void authorizationOnWeb() {
        browser.findElement(inputLogin).sendKeys(config.getLogin());
        browser.findElement(buttonSingIn).click();
        browser.findElement(inputPassword).sendKeys(config.getPassword());
        browser.findElement(buttonLogin).click();
    }
}


