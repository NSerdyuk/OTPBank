package Steps;

import Pages.ContactCardPage;
import Pages.PageContactForm_v2;
import Pages.PageRegistration;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class ContactCardStep extends BaseClass {

    public ContactCardStep(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Ввод серии и номера паспорта {0}")

    public void stepSeriaAndNumberOfPassport(){
        new ContactCardPage(driver).setSeriaAndNumberOfPassport();
    }

    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField(String fieldName, String value){
        new ContactCardPage(driver).fillField(fieldName,value);
    }

    @Step("Заполняются поля:")
    public void stepfillFields(HashMap<String,String> fields){
        fields.forEach(this::stepfillField);
    }

    @Step("Выбор чек-бокса male/female:")
    public void stepMale(){
        new ContactCardPage(driver).setMale();
    }

    @Step("Выбор чек-бокса")

    public void stepValidationData(){
        new ContactCardPage(driver).setValidationData();
    }

    @Step("Выбор чек-бокса о наличии старого паспорта")

    public void stepOldPassport(){
        new ContactCardPage(driver).setOldPassport();
    }

    @Step("Добавить продукт")
    public void stepCheck(){
        new ContactCardPage(driver).setCatagoryOfGoods();
    }
    @Step("Выбор товара")
    public void stepSet(String checkCatagoryOfGood) {
        new ContactCardPage(driver).setCheckCatagoryOfGoods(checkCatagoryOfGood);
    }


    @Step("Выбор Социального статуса")
    public void stepSendPhoto1(String sendPhoto){
        new ContactCardPage(driver).setSendPhoto1(sendPhoto);
    }
    @Step("Выбор Социального статуса")
    public void stepSendPhotoOK1(){
        new ContactCardPage(driver).setSendPhotoOK1();
    }

    @Step("Переход на следующую страницу")

    public void stepButtonNext(){
        new ContactCardPage(driver).setButtonNext();

    }



}
