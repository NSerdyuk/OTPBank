package Pages;

import Steps.BaseClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactCardPage extends BaseClass {

    /**Локаторы страницы*/

    @FindBy(xpath = "//div/div[@title='Добавить товарную категорию Аплет списка']")
    WebElement title;

    @FindBy(xpath = "//div/input[@aria-label='Серия и номер паспорта']")
    WebElement seriaAndNumberOfPassport;

    @FindBy(xpath="//div/input[@aria-label='Когда выдан паспорт']")
    WebElement issuedBy;

    @FindBy(xpath="//div/input[@aria-label='ФИО']")
    WebElement lastName;

    @FindBy(xpath="//div/input[@aria-label='Имя']")
    WebElement firstName;

    @FindBy(xpath="//div/input[@aria-label='Отчество']")
    WebElement middleName;

    @FindBy(xpath="//div/label[@for='s_6_1_9_0_0']")
    WebElement male;

    @FindBy(xpath="//div/input[@aria-label='Дата рождения']")
    WebElement birthdayDate;

    @FindBy(id="s_3_1_1_0_Ctrl")
    WebElement validationData;

    @FindBy(id="No Old PD Flag_Label")
    WebElement oldPassport;

    @FindBy(xpath="//div/span[@class='add-item']")
    WebElement catagoryOfGoods;

    @FindBy (id="1_Category")
    WebElement checkCatagoryOfGoods;

    @FindBy(xpath="//input[@name='S_A14file-upload-0']")
    WebElement sendPhoto1;

    @FindBy(id ="sendPhoto")
    WebElement sendPhotoOK;

    @FindBy(id="s_13_1_0_0_Ctrl")
    WebElement buttonNext;


    public ContactCardPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }



    /**Ввод серии/номера паспорта*/

    public String randomSeriaAndNumberOfPassport (int length) {

        return RandomStringUtils.randomNumeric(length);}

    public void setSeriaAndNumberOfPassport(){

        try {
            Thread.sleep(3000);
            seriaAndNumberOfPassport.sendKeys("0000" + RandomStringUtils.randomNumeric(6));
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }




    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Когда выдан паспорт":
                try {
                    Thread.sleep(2000);
                fillField(issuedBy, value);
                Assert.assertEquals("12.03.2015", issuedBy.getAttribute("value"));

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", issuedBy);
                break;

            case "Фамилия":
                fillField(lastName, value);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastName);
                break;

            case "Имя":
                fillField(firstName, value);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", firstName);
                break;

            case "Отчество":
                fillField(middleName, value);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", middleName);
                break;
            case "Дата рождения":
                fillField(birthdayDate, value);
                Assert.assertEquals("12.03.1993", birthdayDate.getAttribute("value"));
               //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", birthdayDate);
                break;
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Серия и номер паспорта":
                return seriaAndNumberOfPassport.getAttribute("value");
            case "Когда выдан паспорт":
                return issuedBy.getAttribute("value");
            case "Фамилия":
                return lastName.getAttribute("value");
            case "Имя":
                return firstName.getAttribute("value");
            case "Отчество":
                return middleName.getAttribute("value");
            case "Дата рождения":
                return birthdayDate.getAttribute("value");
        }
        throw new AssertionError("Заполнены не все обязательные поля");
    }


    /**Выбор чек-бокса male/female*/

    public void setMale() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", male);
        male.click();
    }

    /**Выбор чек-бокса */

    public void setValidationData() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", validationData);
            validationData.click();
            Thread.sleep(2000);
        }catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    /**Выбор чек-бокса о наличии старого паспорта*/

    public void setOldPassport() {

        oldPassport.click();
    }


    /**Выбор категории товара/продукта*/

    public void setCatagoryOfGoods() {

        catagoryOfGoods.click();
    }

    public void setCheckCatagoryOfGoods(String checkCatagoryOfGood) {
                    checkCatagoryOfGoods.submit();
                    checkCatagoryOfGoods.sendKeys(checkCatagoryOfGood);
                       }



     /**Добавление документа в перелесс*/
    public void setSendPhoto1(String sendPhoto) {
        try {Thread.sleep(5000);
            sendPhoto1.sendKeys(sendPhoto);
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setSendPhotoOK1() {try {
        sendPhotoOK.click();
        Thread.sleep(5000);
    } catch (InterruptedException c) {
        c.printStackTrace();
    }
    }


    /**перейти на следующую страницу*/
    public void setButtonNext() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext);
        buttonNext.click();
    }

}
