package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.DemoSchedulerforUtilities;


public class DemoScheduledForUtilitiesStepDef extends DemoSchedulerforUtilities {
    WebDriver driver = getDriver();
    DemoSchedulerforUtilities dm = new DemoSchedulerforUtilities();


    @When("we explore Utilities feature")
    public void weExploreUtilitiesFeature() {
        dm.waitForElementClick(UtilitiesOption);
    }

    @Then("check complete Utility optimization details")
    public void checkCompleteUtilityOptimizationDetails() {
        dm.waitForElementClick(InvoiceManagementTab);
        dm.waitForElementClick(VacantCostManagementTab);
    }

    @Then("click on Scheduled Demo")
    public void clickOnScheduledDemo() throws InterruptedException {
        Thread.sleep(3000);
        dm.waitForElementClick(WatchDemo);
    }

    @Then("^Fill the data in form for Demo as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void fillTheDataInFormForDemoAs(String fn, String ln, String Email, String CompanyName, String PhoneNumber, String UnitCount, String JobTitle, String Iam) throws Exception {
        dm.SendKeys(firstName, fn);
        dm.SendKeys(lastName, ln);
        dm.SendKeys(email, Email);
        dm.SendKeys(company, CompanyName);
        dm.SendKeys(phone, PhoneNumber);
        dm.DropdownbyValue(unitCount, UnitCount);
        dm.SendKeys(jobTitle, JobTitle);
        dm.DropdownbyValue(iam, Iam);

    }

}
