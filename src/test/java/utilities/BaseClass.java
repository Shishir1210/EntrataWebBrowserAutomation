package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    protected String PropLoginUsername = "TESTUSERNAME";
    protected String PropLoginPassword = "TESTPASSWORD";
    WebDriverWait wait;

    protected String Entrataurl = "https://www.entrata.com/";
    protected String Agendaurl = "https://web.cvent.com/event/d584d3ce-d8da-4cae-a33f-c2309d8c1900/websitePage:fb9becf2-6bb7-473e-98fb-ba6e066e2694";

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*", "no-sandbox", "-windows--1920*1080");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public void SendKeys(By byLocator, String text) {
        driver.findElement(byLocator)
                .sendKeys(text);
    }

    public void click(By byLocator) {
        driver.findElement(byLocator).click();
    }

    public void doubleClick(By byLocator) {
        WebElement we = driver.findElement(byLocator);
        Actions act = new Actions(driver);
        act.doubleClick(we).perform();
    }

    public void waitForElementClick(By byLocator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(byLocator)).click();
    }

    public void waitForElementSendKeys(By byLocator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(byLocator)).sendKeys();
    }

    public void DropdownbyValue(By byLocator, String value) {
        WebElement element = driver.findElement(byLocator);
        Select dp = new Select(element);
        dp.selectByValue(value);
    }

}
