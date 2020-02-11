package Andrea;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Andrea.AdminCenterPage;
import pages.Andrea.HomePage;
import pages.Andrea.LoginPage;
import pages.Andrea.filePages.FallPage;

public class Utility {


    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver","/Andrea/Tools/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/FHIR_V2");
        //JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.manage().window().maximize();
        
        //LoginTest loginTest = new LoginTest();
        LoginPage loginTest = new LoginPage();
        loginTest.login(driver);

        //In the Icon wall page
        HomePage homePage = new HomePage();
        homePage.WaitClickInformation(driver);

        /**
         *
         * //Click Admin Center
        AdminCenterPage adminCenter = new AdminCenterPage();
        adminCenter.clickLoggedInBtn(driver);
        adminCenter.clickAdminCenter(driver);

         */

        //Click Fall Icon
        FallPage fall = new FallPage();
        fall.clickFallIcon(driver);
        //Assert Fall title
        Assert.assertEquals("Fall - Submission Form", fall.returnFallTitle(driver));
        System.out.println("The returned title is " + fall.returnFallTitle(driver));
        //Begin to fill the Fall form
        fall.fillEventType(driver);
        fall.enterTypeOfPersonAffected(driver);
        fall.enterSeverityLevel(driver);

        new WebDriverWait(driver,15).until(new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver d){
                return ((d.findElements(By.cssSelector(".blockUI")).size() == 0)
                        && (d.findElements(By.cssSelector(".blockUI.blockOverlay")).size() == 0)
                        && (d.findElements(By.cssSelector(".blockUI.blockMsg.blockPage")).size() == 0));
            }

        });


        driver.quit();

    }
}
