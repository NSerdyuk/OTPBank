package Steps;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;
    public Select select;
    @org.junit.Before
    public void Logining() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/Aplana_OTPBank/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        driver = new ChromeDriver(co);
        /*String pageURL = "http://PLCARDAGENTE65:123456789@192.168.63.102/agentnew";
        driver.get(pageURL);*/
        driver.get("http://192.168.61.106/agentnew/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//"http://192.168.61.106/agentnew/"  http://192.168.63.102/agentnew/
    }

    /*@AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }*/
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }
    public void fieldDate(WebElement date, String value){
        date.clear();
        date.sendKeys(value);
    }

    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }
}
