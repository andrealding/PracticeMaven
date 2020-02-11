package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm (WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Mary");

        driver.findElement(By.id("last-name")).sendKeys("Smith");

        driver.findElement(By.id("job-title")).sendKeys("Manager");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        //dataPicker - enter the date by "mm/dd/yyyy"
        driver.findElement(By.id("datepicker")).sendKeys("12/03/2019");
        //sendKeys(Keys.RETURN) -- to close the the data picker
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

    }
}
