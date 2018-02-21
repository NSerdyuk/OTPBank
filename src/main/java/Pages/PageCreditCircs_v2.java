package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class PageCreditCircs_v2 extends BaseClass {

    public PageCreditCircs_v2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 40))
                .until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }


    /**
     * Локаторы по динамическому продукту//div/span/a[text()='Динамический продукт']//span[@data-value='5']
     */

    @FindBy(xpath = "//div[@class='wrapper selected']")
    WebElement dynamicProduct;

    @FindBy(xpath="//div/input[@id='ip' and @type='text']")
    WebElement initialPayment;

    @FindBy(xpath = "//a/b[contains(text(),'месяц')]")
    WebElement creditTermDP;

    @FindBy(id = "periodInput")
    WebElement periodInput;

    @FindBy(xpath = "//span[contains(text(),'Введите срок:')]")
    WebElement periodInput_2;



    /**
     * Локаторы по специальному продукту
     * */

    @FindBy(xpath = "//span/a[contains(text(),'Специальные')]")
    WebElement specialProduct;

    @FindBy(className = "title")
    WebElement title;

    @FindBy(xpath = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable alert-div']/div[3]/div/button")
    WebElement popupOK;

    @FindBy(id = "LifeFlg_Label")
    WebElement lifeInsurance;

    @FindBy(id = "WorkFlg_Label")
    WebElement workInsurance;

    @FindBy(xpath = "//tr[@class='product']/td[@class='value']/label/select")
    WebElement productSpecial;

    @FindBy(xpath = "//table/tbody/tr[9]/td[@class='value']/label/select")
    WebElement creditTerm;

    @FindBy(xpath = "//div[@class='error_m']/input")
    WebElement date;

    @FindBy(xpath = "//button[@aria-label='Рассчитать']")
    WebElement appletButtonCalc;

    @FindBy(xpath = "//button[@aria-label='Оформление сделки']")
    WebElement createCredit;

    /**
     * Локаторы по продукту промо
     * */

    @FindBy(xpath = "//span/a[contains(text(),'Промо')]")
    WebElement promoProduct;

    @FindBy(xpath = "//td[@class='value']/label[@for='s_7_1_9_0']/select")
    WebElement productPromo;


    @FindBy(xpath = "//td[@class='value']/label[@for='s_7_1_7_0']/select")
    WebElement creditTermPromo;


    /**
     * Методы по динамическому продукту
     *@setSelectLifeInsurance - Выбор Страхование жизни
     *@setWorkInsurance - Выбор Страхование от потери работы
     *@fillField - Первоначальный взнос
     *@setCreditTermDP -Срок кредита
     *@setCreateCredit - Нажатие кнопки "Оформление сделки"
     */

    public void setDynamicProduct(){
        dynamicProduct.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fillField(String code, String value) {
        switch (code) {
            case "Первоначальный взнос":
                fillField(initialPayment, value);
                Assert.assertEquals("500", initialPayment.getAttribute("value"));
        }
    }

    public void fillField_2(String code, String value) {
        switch (code) {
            case "Срок":
                /*periodInput.clear();
                fillField(periodInput, value);
                Assert.assertEquals("10", periodInput.getAttribute("value"));*/
                ((JavascriptExecutor) driver).executeScript("document.getElementById('periodInput').value='10'");
        }
    }



    public void setCreditTermDP(){
        creditTermDP.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   /* public void setPeriodInput_2(){
        periodInput_2.click();
    }*/

    public void setPeriodInput(){
        periodInput.clear();
    }




    /**
     * Методы по специальному продукту:
     * @setSelectLifeInsurance - Выбор Страхование жизни
     * @setWorkInsurance - Выбор Страхование от потери работы
     * @setProductSpecial -Выбор продукта
     * @setCreditTerm - Выбор срока кредитования
     * @setAppletButtonCalc - Нажатие кнопки "Рассчитать"
     * @setCreateCredit - Нажатие кнопки "Оформление сделки"
     *
     * */

    public void setSpecialProduct(){
        specialProduct.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }


    public void setSelectLifeInsurance(){

        select = new Select(lifeInsurance);
        // select.getFirstSelectedOption();
        getSelect(lifeInsurance);
        select.selectByVisibleText("СПАО \"РЕСО-ГАРАНТИЯ\"");
    }



    public void setWorkInsurance(){

        select =new Select(workInsurance);
        getSelect(workInsurance);
        select.selectByVisibleText("СПАО \"РЕСО-ГАРАНТИЯ\"");
    }

    public void unsetSelectLifeInsurance(){
        lifeInsurance.click();
    }
    public void unsetWorkInsurance(){
        workInsurance.click();

    }
    public void setProductSpecial(){
        productSpecial.click();
        getSelect(productSpecial);
        select.selectByValue("Ваш выбор (PKP399_M6_36)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      /*  Set<String> handles = driver.getWindowHandles();
        for (String subhandle : handles) {
            if (!subhandle.equals(handles)) {
                driver.switchTo().window(subhandle);

                Actions action = new Actions(driver);
                action.moveToElement(popupOK).build().perform();
                popupOK.click();
            }
        }*/

    }

    public void setCreditTerm(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", creditTerm);
        creditTerm.click();
        select =new Select(creditTerm);
        getSelect(creditTerm);
        select.selectByValue("12");

    }

    public void setDate(String fillDate, String value) {
        switch (fillDate) {
            case "Дата сделки":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", date);
                fieldDate(date, value);
                Assert.assertEquals("21.02.2018", date.getAttribute("value"));
        }
    }


    public void setAppletButtonCalc() {
        try {
            appletButtonCalc.click();
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }
    public void setCreateCredit(){
        try { Thread.sleep(10000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", createCredit);
            createCredit.click();
            Thread.sleep(30000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    /**
     * Методы по продукту промо
     * @setSelectLifeInsurance - Выбор Страхование жизни
     * @setWorkInsurance - Выбор Страхование от потери работы
     * @setProductPromo - Выбор продукта
     * @setCreditTermPromo - Выбор срока кредитования
     * @setAppletButtonCalc - Нажатие кнопки "Рассчитать"
     * @setCreateCredit - Нажатие кнопки "Оформление сделки"
     * */

    /*public void setProductPromo() {
        productPromo.click();
    }*/

    public void setPromoProduct(){
        promoProduct.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public void setProductPromo() {
        productPromo.click();
        getSelect(productPromo);
        select.selectByValue("0-0-24 plus (PKP803_M3_24)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      /*  Set<String> handles = driver.getWindowHandles();
        for (String subhandle : handles) {
            if (!subhandle.equals(handles)) {
                driver.switchTo().window(subhandle);

                Actions action = new Actions(driver);
                action.moveToElement(popupOK).build().perform();
                popupOK.click();
            }
        }*/
    }
    public void setCreditTermPromo() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", creditTermPromo);
        creditTermPromo.click();
        select = new Select(creditTermPromo);
        getSelect(creditTermPromo);
        select.selectByValue("12");

    }

    /**
     * Конструктор по специальному продукту
     *
     */
    public void pageCreditCircsConstructor1(){

        this.setSelectLifeInsurance();
        this.setWorkInsurance();
        this.setCreditTerm();
        this.setAppletButtonCalc();
        this.setCreateCredit();
    }


    /**
     * Конструктор по продукту промо
     * */
    public void pageCreditCircsConstructor2(){
        this.setProductPromo();
        this.setSelectLifeInsurance();
        this.setWorkInsurance();
        this.setCreditTermPromo();
        this.setAppletButtonCalc();
        this.setCreateCredit();


    }


}
