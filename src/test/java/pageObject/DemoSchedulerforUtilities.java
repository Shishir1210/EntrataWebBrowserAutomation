package pageObject;

import org.openqa.selenium.By;
import utilities.BaseClass;

public class DemoSchedulerforUtilities extends BaseClass {

    protected By UtilitiesOption = By.xpath("//a[@href = '/utilities']");
    protected By InvoiceManagementTab = By.xpath("//span[text() = 'Invoice Management']");
    protected By VacantCostManagementTab = By.xpath("//span[text() = 'Vacant Cost Management']");
    protected By WatchDemo = By.xpath("/html/body/div[1]/div[1]/div/nav/div[5]/a[1]");
    protected By firstName = By.xpath("//input[@id = 'FirstName']");
    protected By lastName = By.xpath("//input[@id = 'LastName']");
    protected By email = By.xpath("//input[@id = 'Email']");
    protected By company = By.xpath("//input[@id = 'Company']");
    protected By phone = By.xpath("//input[@id = 'Phone']");
    protected By jobTitle = By.xpath("//input[@id = 'Title']");
    protected By unitCount = By.xpath("//select[@id = 'Unit_Count__c']");
    protected By iam = By.xpath("//select[@id = 'demoRequest']");

    public DemoSchedulerforUtilities() {
        super();
    }

}
