package stepDefinition;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.SummitAgenda;

import java.util.Iterator;
import java.util.Set;


public class SummitAgendaStepDef extends SummitAgenda {
    WebDriver driver = getDriver();
    SummitAgenda sa = new SummitAgenda();

    @Then("User clicks on Agenda")
    public void userClicksOnAgenda() throws InterruptedException {
        Thread.sleep(20000);

        String currentHandle = driver.getWindowHandle();
        Set handles = driver.getWindowHandles();
        Iterator ite = handles.iterator();

        while (ite.hasNext()) {
            String popupHandle = ite.next().toString();
            if (!popupHandle.contains(currentHandle)) {
                driver.switchTo().window(popupHandle);
            }
        }
        sa.waitForElementClick(Agenda);

    }

    @Then("user clicks on Filters option")
    public void userClicksOnFiltersOption() throws InterruptedException {
        Thread.sleep(10000);
        sa.waitForElementClick(Filters);
    }

    @Then("user clicks on Category option")
    public void userClicksOnCategoryOption() {
        sa.waitForElementClick(Category);
    }

    @Then("user selects any two category")
    public void userSelectsAnyTwoCategory() {
        sa.waitForElementClick(WellnessActivities);
        sa.waitForElementClick(GeneralSession);
    }

    @Then("user selects day as Tuesday and verify the category selected")
    public void userSelectsDayAsTuesdayAndVerifyTheCategorySelected() {
        sa.waitForElementClick(DateSelect);
        if (driver.getTitle().equals("Agenda - Summit 2024")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

}
