package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class PageExecutionTransaction extends BaseClass {

    public PageExecutionTransaction(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div/button[@aria-label='Распечатать документы']")
    WebElement appletButton;

    @FindBy(xpath = "//html/body/div[7]/div[1]/button/span")
            WebElement buttonClose;

    @FindBy(xpath = "//form/div/div[2]/div[1]/div[2]/input")
            WebElement codeWordLabel;

    @FindBy(xpath = "//div/input[@aria-label='День рождения матери']")
    WebElement motherBirthDate;

    @FindBy(xpath = "//div/input[@aria-label='Номер школы']")
    WebElement schoolNumber;

    @FindBy(xpath = "//div/button[@aria-label='Подписать']")
    WebElement appletButton2;


    @FindBy(xpath = "//div/button[@aria-label='Отказ от подписания']")
    WebElement appletButton3;

    @FindBy(xpath = "//div/button[@aria-label='Сейчас']")
    WebElement appletButtonNow;

    @FindBy(xpath = "//div/button[@aria-label='Позже']")
    WebElement appletButtonLater;


    @FindBy (xpath = "//div/input[@aria-label='Клиент является публичным должностным лицом']")
    WebElement pdlFlagLabel;

    @FindBy(xpath = "//form/div/div[6]/div[1]/div[2]/label/select")
    WebElement checkPDL;

    @FindBy(className = "search-query")
    WebElement searchQuery;

    @FindBy(xpath="//input[@name='S_A9file-upload-0']")
    WebElement sendPhoto;

    @FindBy(id ="sendPhoto")
    WebElement sendPhotoOK;


    @FindBy(name="S_A9file-upload-1" )
    WebElement sendDoc;

    @FindBy(xpath="//div/button[@id='verificatePhoto']")
    WebElement sendDocoOK;

    @FindBy(xpath = "//input[@name='S_A9file-upload-2']")
    WebElement sendPassport;

    @FindBy(xpath="//div/button[@id='verificatePhoto']")
    WebElement sendPassportOK;


    @FindBy(xpath = "//button[@aria-label='Подписать и авторизовать']")
    WebElement button4;

    @FindBy(xpath = "//button[@aria-label='Отказ от подписания']")
    WebElement button5;



    public void setAppletButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", appletButton);
        appletButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //String pageURL = "http://W442956:0123456789@192.168.61.106/agentnew";
        //driver.get(pageURL);

    }

    public void setButtonClose() {

        //driver.navigate().back();
        driver.switchTo().activeElement();
        buttonClose.click();

}
    public void fillField(String fieldName, String value ){
        switch (fieldName) {
            case "КОДОВОЕ СЛОВО":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", codeWordLabel);
                fillField(codeWordLabel, value);
                Assert.assertEquals("КОДОСЛОВО", codeWordLabel.getAttribute("value"));
                break;
            case "День рождения матери":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", motherBirthDate);
                fillField(motherBirthDate, value);
                Assert.assertEquals("01.01.1960", motherBirthDate.getAttribute("value"));
                break;
            case "Школа":
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", schoolNumber);
                fillField(schoolNumber, value);
                Assert.assertEquals("15", schoolNumber.getAttribute("value"));
                break;
        }
    }

    public void setAppletButton2(){
        appletButton2.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setAppletButton3(){
        appletButton3.click();
    }

    public void setAppletButtonNow()
    {
        appletButtonNow.click();
    }


    public void setAppletButtonLater()
    {
        appletButtonLater.click();
    }

    /**Метод ввода кода ТТ в строку поиска*/
    public void fillField3(String code, String value) {
        switch (code) {
            case "Выбор ТТ":
                fillField(searchQuery, value);
        }
    }
        public void selectTT2(){
            Actions dcTT = new Actions(driver);
            Action dbc = dcTT.doubleClick(driver.findElement(By.className("highlight"))).build();
            dbc.perform();
        }

        public void setpdlFlagLabel(){
            pdlFlagLabel.click();
        }


        public void setCheckPDL(){
            select =new Select(checkPDL);
            getSelect(checkPDL);
            select.selectByVisibleText("Российское ПДЛ");
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

    public void setButton4(){
        button4.click();
    }

    public void setButton5(){
        button5.click();
    }




    }





    /*public void PageExecutionTransactionConstructor(String codeWord, String motherBirth, String schoolNumb){
        this.setAppletButton();
        // this.setAlert();
        //this.setButtonClose();
        this.setCodeWordLabel(codeWord);
        this.setMotherBirthDate(motherBirth);
        this.setSchoolNumber(schoolNumb);
        this.setAppletButton2();
        this.setAppletButtonNow();

    }

    public void PageExecutionTransactionConstructor2(){
        this.setAppletButton3();

    }
*/


