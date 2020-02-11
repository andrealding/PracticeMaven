import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ConfirmationPage;
import pages.FormPage;

import static pages.FormPage.submitForm;

public class Form {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Andrea/Tools/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        String expectedMessage = confirmationPage.getAlertBannerText(driver);

        Assert.assertEquals(expectedMessage, "The form was successfully submitted!");

        driver.quit();
    }

}
