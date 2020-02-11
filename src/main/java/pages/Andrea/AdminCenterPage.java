package pages.Andrea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCenterPage {

    String loggedIn_Btn = "[title~=Logged]";
    String adminCenter = "ctl00_A7";

    public void clickLoggedInBtn(WebDriver driver){

        driver.findElement(By.cssSelector(loggedIn_Btn)).click();
    }

    public void clickAdminCenter(WebDriver driver){

        driver.findElement(By.id(adminCenter)).click();
    }
}
