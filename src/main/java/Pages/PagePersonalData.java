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

public class PagePersonalData extends BaseClass {

    public PagePersonalData (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(className = "title")
    WebElement title;


    @FindBy(xpath = "//div/input[@aria-label='Название организации']")
    WebElement organization;

    @FindBy(xpath = "//div/input[@aria-label='Адрес места работы']")
    WebElement addressWork;

    @FindBy(xpath = "//form/table/tbody/tr/td[1]/span/button")
    WebElement button;

    @FindBy(xpath = "//form/div/div[1]/div[1]/div[2]/label/select")
    WebElement branchOfOrganization;

    @FindBy(xpath = "//form/div/div[2]/div[1]/div[2]/div/div[1]/label")
    WebElement position;

    @FindBy(xpath = "//form/div/div[3]/div[1]/div[2]/div/div[2]/label")
    WebElement workExperience1;

    @FindBy(xpath = "//form/div/div[4]/div[1]/div[2]/div/div[5]/label")
    WebElement workExperience2;

    @FindBy(xpath = "//form/div/div[5]/div[1]/div[2]/div/div[4]/label")
    WebElement numberOfEmploeeys;

    @FindBy(xpath = "//form/div/div/div[1]/div[2]/div/div[3]/label[contains(text(),'Высшее')]")
    WebElement education;

    @FindBy(xpath = "//form/div/div[1]/div[1]/div[2]/div[2]/label")
    WebElement apartmentInProperty;

    @FindBy(xpath = "//div/div/div[1]/div[1]/div[9]/div/div/form/div/div[2]/div[1]/div[2]/label/select")
    WebElement familyIncome;

    @FindBy(xpath = "//div/input[@aria-label='Дополнительный доход']")
    WebElement income;

    @FindBy(xpath = "//div/input[@aria-label='Расходы на квартиру']")
    WebElement flatIncome;

    @FindBy(xpath="//form/div/div[2]/button")
    WebElement buttonNext;

    @FindBy(xpath = "//form/div/span/span[contains(text(),'Вам отказано в выдаче кредита.')]")
    WebElement errorMessege;

    @FindBy(xpath = " //button[@aria-label='Перейти на домашнюю страницу']")
    WebElement buttonBackToHP;




    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Название организации":
                fillField(organization, value);
                Assert.assertEquals("Аплана", organization.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Адрес места работы":
                fillField(addressWork, value);
                branchOfOrganization.click();
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
                button.click();
               // Assert.assertEquals("108816, Россия, г Москва, Внуковское п, п Мичуринец, ул Ленина, д 41, офис 1", addressWork.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Дополнительный доход":
                fillField(income, value);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", income);
                Assert.assertEquals("10000", income.getAttribute("value"));

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;

            case "Расходы на квартиру":
                fillField(flatIncome, value);
                Assert.assertEquals("5000", flatIncome.getAttribute("value"));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }




    public void setBranchOfOrganization() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", branchOfOrganization);
        branchOfOrganization.click();
        getSelect(branchOfOrganization);
        select.selectByValue("Здравоохранение");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void setFamilyIncome() {
        familyIncome.click();
        getSelect(familyIncome);
        select.selectByValue("от 10000 до 20000 руб.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPosition(){
        position.click();
    }

    public void setWorkExperience1(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", workExperience1);
        workExperience1.click();
    }

    public void setWorkExperience2(){
        workExperience2.click();
    }

    public void setNumberOfEmploeeys(){
        numberOfEmploeeys.click();
    }


    public void setEducation(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", education);
        education.click();
    }

    public void setApartmentInProperty(){
        apartmentInProperty.click();
    }

    public void setButtonNext(){
        buttonNext.click();
    }


    public void setError(){
        Assert.assertTrue(errorMessege.getText().contains("Вам отказано в выдаче кредита."));
        buttonBackToHP.click();
    }




}
