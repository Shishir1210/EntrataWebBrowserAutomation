package pageObject;

import org.openqa.selenium.By;
import utilities.BaseClass;

public class SummitAgenda extends BaseClass {
    protected By Agenda = By.xpath("//a[@href='https://cvent.me/nMd7LY']");
    protected By Filters = By.xpath("//button[text() = 'Filters']");
    protected By Category = By.xpath("//div[@id = '1-header']");
    protected By WellnessActivities = By.xpath("//li//label[text() = 'Wellness Activities']");
    protected By GeneralSession = By.xpath("//li//label[text() = 'General Session']");
    protected By DateSelect = By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]");

    public SummitAgenda() {
        super();
    }

}

