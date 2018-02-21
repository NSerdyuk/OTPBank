package Pages;

import Steps.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHomeTT extends BaseClass {

    /**Локаторы страницы*/


    @FindBy(id = "s_2_1_1_0_icon")
    //(xpath = "//input[@aria-label='Домашняя ТТ']")
            /*(id = "s_2_1_1_0_icon")*/
            WebElement homeTT;

    @FindBy(id="s_1_1_0_0_Ctrl")
    //(xpath= "//button[@aria-label='\"Незавершенные заявки.:Создать новую заявку\"']")
            //
            WebElement newApplication;


    @FindBy(xpath = "//form/div[1]/div[3]/div[1]/span")
    WebElement checkAgreement;

    @FindBy(xpath = "//tr[@id='1']/td")
    WebElement agreement;


    public PageHomeTT(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    /**Выбор ДомашнейТТ*/

    public void setHomeTT() {
        try {

            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homeTT);
            homeTT.click();

        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setBuilder() {
        try {
            Actions builder = new Actions(driver);
            Action dbclick = builder.doubleClick(driver.findElement(By.id("1ISB_TT_Code"))).build();
            dbclick.perform();
            Thread.sleep(5000);


        }    catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setNewApplication() {
        try {

            newApplication.click();
            Thread.sleep(2000);
        }    catch (InterruptedException c) {
            c.printStackTrace();
        }
    }


    /** Выбор уже существующей заявки */

    public void setOldissue() {
        try {
            Actions oldissue = new Actions(driver);
            Action dbclick = oldissue.doubleClick(driver.findElement(By.id("1"))).build();
            dbclick.perform();
            Thread.sleep(1000);


        }    catch (InterruptedException c) {
            c.printStackTrace();
        }
    }



    public void setCheckAgreement(){
        checkAgreement.click();
    }

    public void setAgreement(){
        agreement.getText();
        String txt = agreement.getText();
    }



}
