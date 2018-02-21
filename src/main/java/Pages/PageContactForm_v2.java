package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageContactForm_v2 extends BaseClass {

    @FindBy(id = "Home_Phone_#_Label")
    WebElement title;

    @FindBy(xpath="//input[@name='S_A5file-upload-0']")
    WebElement sendPhoto;

    @FindBy(id ="sendPhoto")
    WebElement sendPhotoOK;


    @FindBy(name="S_A5file-upload-1" )
    WebElement sendDoc;

    @FindBy(xpath="//div/button[@id='verificatePhoto']")
    WebElement sendDocoOK;

    @FindBy(xpath = "//input[@name='S_A5file-upload-2']")
    WebElement sendPassport;

    @FindBy(xpath="//div/button[@id='verificatePhoto']")
    WebElement sendPassportOK;

    @FindBy(id = "ISB Social Worker_Label")
    WebElement socialStatus;

    @FindBy(xpath="//label[text()='Не состоял в браке']")
    WebElement maritalStatus;

    @FindBy(xpath="//input[@aria-label='Мобильный телефон']")
    WebElement mobilePhone;

    @FindBy(xpath="//label[text()='Нет E-mail']")
    WebElement checkBoxEmail;

    @FindBy(xpath="//input[@aria-label='Рабочий телефон']")
    WebElement workPhone;

    @FindBy(xpath="//input[@aria-label='Телефон проживания']")
    WebElement homePhone;

    @FindBy(xpath="//input[@aria-label='Адрес регистрации']")
    WebElement adress;

    @FindBy(xpath = "//form/div/div[4]/div[2]/div[2]/div/div/span/a")
    WebElement check;

    @FindBy(xpath="//div/input[@aria-label='Индекс']")
    WebElement appletButton;

    @FindBy(xpath= "//div/input[@aria-label='Улица']")
    WebElement district;

    @FindBy(xpath="//div/input[@aria-label='Дом']")
    WebElement home;

    @FindBy(xpath="//div/input[@aria-label='Дом']")
    WebElement flat;

    @FindBy(xpath = "//button[@title='Проверено']")
    WebElement appletsButton;

    @FindBy(xpath="//span/button[@aria-label='Проверено']")
    WebElement appletssButton;

    @FindBy(xpath="//div/input[@aria-label='Дата регистрации']")
    WebElement registrationDate;

    @FindBy(id="ISB Match Addr Reg Home Flag_Label")
    WebElement adressOfLiving;

    @FindBy(id="ISB Match Addr Reg Post Flag_Label")
    WebElement postAdress;

    @FindBy(xpath="//div/input[@aria-label='Код подразделения']")
    WebElement code;

    @FindBy(xpath="//div/input[@aria-label='Кем выдан']")
    WebElement passportGivenBy;

    @FindBy(xpath="//form/div/div[5]/div[4]/div[1]/div[2]/a")
    WebElement birthdayCountryLabel;

    @FindBy(xpath="//div/input[@aria-label='Место рождения']")
    WebElement birthdayCityLabel;

    @FindBy(xpath="//div/input[@aria-label='Персональный доход']")
    WebElement personalIncome;

    @FindBy(id="1Name")
    WebElement categoryName;

    @FindBy(xpath="//input[@name='Name']")
    WebElement categoryName1;

    @FindBy(id="1Marka")
    WebElement categoryMarka;

    @FindBy(xpath="//input[@name='Marka']")
    WebElement category1Marka1;

    @FindBy(id="1Model")
    WebElement categoryModel;

    @FindBy(xpath="//input[@name='Model']")
    WebElement category1Model1;

    @FindBy(id="1Price")
    WebElement categoryPrice;

    @FindBy(xpath="//input[@name='Price']")
    WebElement category1Price1;

    @FindBy(xpath="//form/div/div[2]/button")
    WebElement buttonNext2;

    public PageContactForm_v2 (WebDriver driver) {
        PageFactory.initElements(driver, this);
        /*(new WebDriverWait(driver, 20))
                .until(ExpectedConditions.visibilityOf(title));*/
        this.driver = driver;
    }

/**Добавление фото к карточке контакта */

    public void setSendPhoto(String sendPhoto1) {
        try {Thread.sleep(5000);
            sendPhoto.sendKeys(sendPhoto1);
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setSendPhotoOK() {try {
        sendPhotoOK.click();
        Thread.sleep(5000);
    } catch (InterruptedException c) {
        c.printStackTrace();
    }
    }


    /** Добавление документов к карточке контакта */

    public void setSendDoc(String sendDoc1) {
        try {Thread.sleep(3000);

            sendDoc.sendKeys(sendDoc1);
            Thread.sleep(2000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setSendDocoOK() {
        try {
            sendDocoOK.click();
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    /** Добавление документов к карточке контакта */

    public void setSendPassport(String sendPassport1) {
        try { Thread.sleep(3000);

            sendPassport.sendKeys(sendPassport1);
            Thread.sleep(3000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setSendPassportOK() {
        try {
            sendPassportOK.click();
            Thread.sleep(5000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }
    }



    public void setSocialStatus() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", socialStatus);
        socialStatus.click();
    }

    public void setMaritalStatus() {

        maritalStatus.click();
    }

    public void setCheckBoxEmail() {
        checkBoxEmail.click();
    }

    public void fillField(String fieldName, String value){
        switch(fieldName) {
            case "Мобильный телефон":
                fillField(mobilePhone, value);
                Assert.assertEquals("9268484949", mobilePhone.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Рабочий телефон":
                fillField(workPhone, value);
                Assert.assertEquals("+79168854949", workPhone.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Телефон проживания":
                fillField(homePhone, value);
                Assert.assertEquals("+74498498498", homePhone.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homePhone);
                break;
            case "Адрес регистрации":
                fillField(adress, value);
                Assert.assertEquals("108816, Россия, Москва, Внуковское п, г Москва, п Мичуринец, ул Ленина, д 41, кв 1", adress.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
    public void setCheckAddress() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", check);
        check.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setAppletButton() {
        appletsButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", appletsButton);
        //appletsButton.click();
    }
    public void fillField_2(String fieldName, String value) {
        switch(fieldName) {
            case "Дата регистрации":
                fillField(registrationDate, value);
                Assert.assertEquals("10.10.2010", registrationDate.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Код подразделения":
                fillField(code, value);
                Assert.assertEquals("228-282",code.getAttribute("value"));
                break;
            case "Кем выдан":
                fillField(passportGivenBy, value);
                Assert.assertEquals("УФМС", passportGivenBy.getAttribute("value"));
                break;
            case "Место рождения":
                fillField(birthdayCityLabel, value);
                Assert.assertEquals("Москва", birthdayCityLabel.getAttribute("value"));
                break;
            case "Персональный доход":
                fillField(personalIncome, value);
                Assert.assertEquals("50000,00", personalIncome.getAttribute("value"));
                break;
        }
    }
    public void setadressOfLiving() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", adressOfLiving);
        adressOfLiving.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setpostAdress() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", postAdress);
        postAdress.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setbirthdayCountryLabel() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", birthdayCountryLabel);
        birthdayCountryLabel.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setcategoryName() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", categoryName);
        categoryName.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void fillField_3(String fieldName, String value) {
        switch (fieldName) {
            case "Наименование":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", categoryName);
                categoryName.click();
                fillField(categoryName1, value);
                Assert.assertEquals("Колонка", categoryName1.getAttribute("value"));
                break;
            case "Марка":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", categoryMarka);
                categoryMarka.click();
                fillField(category1Marka1, value);
                Assert.assertEquals("JVC", category1Marka1.getAttribute("value"));
                break;
            case "Модель":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", categoryModel);
                categoryModel.click();
                fillField(category1Model1, value);
                Assert.assertEquals("010101", category1Model1.getAttribute("value"));
                break;
            case "Цена за шт.":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", categoryPrice);
                categoryPrice.click();
                fillField(category1Price1, value);
                Assert.assertEquals("10000", category1Price1.getAttribute("value"));
                break;
        }
    }
    public void setbuttonNext2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext2);
        buttonNext2.click();
        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
