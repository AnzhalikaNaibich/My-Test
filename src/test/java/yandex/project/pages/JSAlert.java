package yandex.project.pages;
import org.openqa.selenium.By;
import utils.ConfigFileReader;
import yandex.framework.browser.Browser;

public class JSAlert extends BasePage {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser;
    private By jsAlert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By jsConfirm = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By jsPrompt = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By result = By.id("result");

    public JSAlert() {
        browser = Browser.BROWSER;
    }

    public void openWebAlert() {
        browser.goTo(config.getApplicationUrlAlert());
    }

    public void checkClickButtons() {
        browser.findElement(jsAlert).click();
        browser.getDriver().switchTo().alert().accept();

        browser.findElement(jsConfirm).click();
        browser.getDriver().switchTo().alert().dismiss();
    }

    public void sendText(String text) {
        browser.findElement(jsPrompt).click();
        browser.getDriver().switchTo().alert().sendKeys(text);
        browser.getDriver().switchTo().alert().accept();
        if (browser.findElement(result).getText().equals("You entered: " + text)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
