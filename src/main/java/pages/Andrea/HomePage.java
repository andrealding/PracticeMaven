package pages.Andrea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    String informationOK_Btn = "td#mdlgokcell>input[value='OK']";
    String welcomeMessage = "ctl00_cph_skip";

    public void WaitClickInformation (WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, 5);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(informationOK_Btn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(welcomeMessage))).click();

    }



}
