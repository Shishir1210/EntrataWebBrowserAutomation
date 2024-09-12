package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class HomePage extends BaseClass {

    By Summit = By.xpath("/html/body/section[1]/div[14]/div[1]/nav/a");
    By SignInButton = By.xpath("/html/body/section[1]/div[14]/div[1]/nav/div[5]/a[2]");
    By ClosePopUp = By.xpath("//div[text() = 'X']");

    public HomePage(WebDriver driver) {
        super();
    }

    public void clickOnSummit() {
        waitForElementClick(Summit);
    }

    public void clickSignUpbutton() {
        click(SignInButton);
    }

    public void closeCookiePopUp() {
        int X = driver.findElements(By.xpath("//div[@id = 'cookie-policy']")).size();
        if (X == 1) {
            click(ClosePopUp);
        } else {
            System.out.println("No pop up found");
        }
    }
}

