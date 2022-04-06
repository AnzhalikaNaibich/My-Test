package yandex.project.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Catalog extends BasePage{

    public Catalog(WebDriver driver) {
        super(driver);
    }

    public void clickCatalog() {
        driver.findElement(By.id("catalogPopupButton")).click();
    }

    public void countSections(){
        int count = driver.findElements(By.xpath("*[@id=\"catalogPopup\"]//li")).size();
        System.out.println(count);
    }

    public void clickSection(){
        driver.findElement(By.cssSelector("[href=\"/catalog--kompiuternaia-tekhnika/54425\"]")).click();
    }

}
