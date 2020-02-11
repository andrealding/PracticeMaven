package pages.Andrea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    String applicationAccount_input = "ctl00_cph_ProviderSelector_tb";
    String applicationAccount = "tr.SelectedItem> td:first-child";
    String username = "ctl00_cph_appLoginController_UserID";
    String password = "ctl00_cph_appLoginController_Password";
    String login_Btn = "ctl00_cph_appLoginController_btnLogin";

    String URL = "http://localhost/RL_FHIR";

    public void login(WebDriver driver){

        driver.findElement(By.id(applicationAccount_input)).click();
        driver.findElement(By.cssSelector(applicationAccount)).click();

        driver.findElement(By.id(username)).sendKeys( "rladmin");
        driver.findElement(By.id(password)).sendKeys( "R@dicalogic1");

        driver.findElement(By.id(login_Btn)).click();
    }
}
