package stepDefinition;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;
import utilities.BaseClass;

public class LoginClassStepDef extends BaseClass {

    WebDriver driver = getDriver();
    LoginPage lp = new LoginPage(driver);


    @Then("click on PropertyManagerLogin")
    public void clickOnPropertyManagerLogin() throws InterruptedException {
        Thread.sleep(3000);
        lp.clickPropManagerLogin();
    }

    @Then("user provides username and password")
    public void userProvidesUsernameAndPassword() throws InterruptedException {
        lp.PropLoginUsername(PropLoginUsername);
        lp.PropLoginPassword(PropLoginPassword);
        Thread.sleep(2000);
    }

    @Then("click on ResidentLogin")
    public void clickOnResidentLogin() throws InterruptedException {
        Thread.sleep(3000);
        lp.clickResidentLogin();
        Thread.sleep(3000);
    }

    @Then("user view Resident App and App Features")
    public void userViewResidentAppAndAppFeatures() {
        lp.ViewResidentApp();
        lp.ViewAppFeatures();
    }
}
