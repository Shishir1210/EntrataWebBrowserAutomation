package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class LoginPage extends BaseClass {

    By PropManagerLogin = By.xpath("/html/body/section[1]/div/div[1]/div/div[1]/div/a[1]");
    By EnterPropLoginUsername = By.xpath("//input[@id = 'entrata-username']");
    By EnterPropLoginPassword = By.xpath("//input[@id = 'entrata-password']");
    By ResidentLogin = By.xpath("/html/body/section[1]/div/div[1]/div/div[1]/div/a[2]/div");
    By ViewResidentApp = By.xpath("//div[@class = 'start-button app-button' and text()='View the App']");
    By ViewAppFeatures = By.xpath("//div[@class= 'landing-nav app-content']//a[text() ='App Features']");

    public LoginPage(WebDriver driver) {
        super();
    }

    public void clickPropManagerLogin() {
        waitForElementClick(PropManagerLogin);
    }

    public void PropLoginUsername(String uName) {
        SendKeys(EnterPropLoginUsername, uName);
    }

    public void PropLoginPassword(String uPwd) {
        SendKeys(EnterPropLoginPassword, uPwd);
    }

    public void clickResidentLogin() {
        waitForElementClick(ResidentLogin);
    }

    public void ViewResidentApp() {
        waitForElementClick(ViewResidentApp);
    }

    public void ViewAppFeatures() {
        waitForElementClick(ViewAppFeatures);
    }

}

