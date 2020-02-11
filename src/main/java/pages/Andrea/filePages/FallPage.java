package pages.Andrea.filePages;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FallPage {

    String fallIcon = "HomeIconRow6";
    //String fallPageTitle = "//*[@id=\"ctl00_TitlePlaceHolder_masterPageLabel\"]";
    String fallPageTitle = "ctl00_TitlePlaceHolder_masterPageLabel";

    String fallFileFieldPrefix = "ctl00_cph_ctl02_RSK_FALL_Submit_ctl13_ctl05_";
    String fallFileFieldSuffixTb = "_ctl01_tb";
    String fallFileFieldSuffixVhb = "_ctl01_vhb";

    String specificEventType = fallFileFieldPrefix +"ctl11" + fallFileFieldSuffixTb;
    String specificEventTypeHidden = fallFileFieldPrefix +"ctl11" + fallFileFieldSuffixVhb;
    //This is a xPath, cssSelector is not unique
    String specificEventTypeSelectedItem = "//td[text()='From Equipment']";

//    String typeOfPersonAffected = fallFileFieldPrefix +"ctl13" + fallFileFieldSuffixTb;
    String typeOfPersonAffected = "input#ctl00_cph_ctl02_RSK_FALL_Submit_ctl13_ctl05_ctl13_ctl01_tb";

    String personAffectedItem = "//td[text()='Inpatient']";

    String severityLevel = fallFileFieldPrefix +"ctl14" + fallFileFieldSuffixTb;
    String severityLevelItem = "//td[text()='A. Unsafe Condition (Non Event)']";

    String InjuryInccured = fallFileFieldPrefix +"ctl15" + fallFileFieldSuffixTb;
    String EquipmentInvolved = fallFileFieldPrefix +"ctl16" + fallFileFieldSuffixTb;
    String healthgItCause = fallFileFieldPrefix +"ctl17" + fallFileFieldSuffixTb;




    public void clickFallIcon(WebDriver driver) {

        driver.findElement(By.id(fallIcon)).click();
    }

    public String returnFallTitle (WebDriver driver){

       //return driver.findElement(By.xpath(fallPageTitle)).getText();
        return  driver.findElement(By.id(fallPageTitle)).getText();
    }

    public void fillEventType(WebDriver driver){

        driver.findElement(By.id(specificEventType)).click();
        driver.findElement(By.xpath(specificEventTypeSelectedItem)).click();
    }


    public String returnSpecificEventType(WebDriver driver){

        //?need to find the element contains 'From Equipment', this hidden element is wrong or maybe the locator is wrong
        return driver.findElement(By.id(specificEventType)).getText();
    }

    public void enterTypeOfPersonAffected(WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement personAffected = wait.until((ExpectedConditions.elementToBeClickable(By.cssSelector(typeOfPersonAffected))));
        personAffected.click();
//        driver.findElement(By.cssSelector(typeOfPersonAffected)).click();
        driver.findElement(By.xpath(personAffectedItem)).click();
    }

    public void enterSeverityLevel(WebDriver driver){

        driver.findElement(By.id(severityLevel)).click();
        driver.findElement(By.xpath(severityLevelItem)).click();

    }




}
