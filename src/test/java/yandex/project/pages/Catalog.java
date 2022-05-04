package yandex.project.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;

public class Catalog extends BasePage{
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    public Catalog() {
    }

    public void clickCatalog() {
        browser.findElement(By.id("catalogPopupButton")).click();
    }

    public void countSections(){
        int count = browser.findElements(By.className("_1hPrb")).size();
        System.out.println(count);
    }

    public void clickSection(){
        browser.findElement(By.cssSelector("[href=\"/catalog--kompiuternaia-tekhnika/54425\"]")).click();
    }

}
