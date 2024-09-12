package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import utilities.BaseClass;


public class HomePageStepDef extends BaseClass {
    WebDriver driver = getDriver();
    HomePage hp = new HomePage(driver);

    @Given("^User launches Chrome browser$")
    public void user_launches_Chrome_browser() throws Throwable {
        driver.get(Entrataurl);
        Thread.sleep(2000);
        //Window maximizing
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Property Management Software | Entrata")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        // For handling cookies
        //driver.switchTo().alert().accept();
    }


    @When("User clicks on Signup button")
    public void userClicksOnSignupButton() throws InterruptedException {
        Thread.sleep(3000);
        hp.clickSignUpbutton();
        Thread.sleep(3000);
    }

    @Then("close popup")
    public void closePopup() {
        hp.closeCookiePopUp();
    }

    @When("User clicks on Summit button")
    public void userClicksOnSummitButton() {
        hp.clickOnSummit();
    }
}
