package Steps;

import Pages.ContactCardPage;
import Pages.PageContactForm_v2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PageContactForm_v2_Step extends BaseClass {
    public PageContactForm_v2_Step(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @Step("Добавление фотографии")
    public void stepSendPhoto(String sendPhoto1){
        new PageContactForm_v2(driver).setSendPhoto(sendPhoto1);
    }
    @Step("Подтверждение")
    public void stepSendPhotoOK(){
        new PageContactForm_v2(driver).setSendPhotoOK();
    }
    @Step("Добавление документа")
    public void stepSendDoc(String sendDoc1){
        new PageContactForm_v2(driver).setSendDoc(sendDoc1);
    }
    @Step("Подтверждение")
    public void stepSendDocoOK(){
        new PageContactForm_v2(driver).setSendDocoOK();
    }
    @Step("Добавление Паспорта")
    public void stepSendPassport(String sendPassport1){ new PageContactForm_v2(driver).setSendPassport(sendPassport1); }
    @Step("Подтверждение")
    public void stepSendPassportOK(){
        new PageContactForm_v2(driver).setSendPassportOK();
    }
    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField(String fieldName, String value){
        new PageContactForm_v2(driver).fillField(fieldName, value);
    }
    @Step("Выбор Социального статуса")
    public void stepSocialStatus(){
        new PageContactForm_v2(driver).setSocialStatus();
    }
    @Step("Выбор Семейное положение")
    public void stepMaritalStatus(){
        new PageContactForm_v2(driver).setMaritalStatus();
    }
    @Step("Выбор E-mail")
    public void stepCheckBoxEmail(){
        new PageContactForm_v2(driver).setCheckBoxEmail();
    }
    @Step("Заполняются поля:")
    public void stepfillFields(LinkedHashMap<String,String> fields){
        fields.forEach(this::stepfillField);
    }
    @Step("Проверка адреса")
    public void stepCheckAddress(){
        new PageContactForm_v2(driver).setCheckAddress();
    }
    @Step("Проверка адреса")
    public void stepAppletButton(){
        new PageContactForm_v2(driver).setAppletButton();
    }
    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField_2(String fieldName, String value) {
        new PageContactForm_v2(driver).fillField_2(fieldName, value);
    }
    @Step("Заполняются поля:")
    public void stepfillFields_2(LinkedHashMap<String,String> fields) {
        fields.forEach(this::stepfillField_2);
    }
    @Step("Проверка адреса")
    public void stepadressOfLiving(){
        new PageContactForm_v2(driver).setadressOfLiving();
    }
    @Step("Проверка адреса")
    public void steppostAdress(){
        new PageContactForm_v2(driver).setpostAdress();
    }
    @Step("Страна рождения")
    public void stepbirthdayCountryLabel(){
        new PageContactForm_v2(driver).setbirthdayCountryLabel();
    }
    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField_3(String fieldName, String value) {
        new PageContactForm_v2(driver).fillField_3(fieldName, value);
    }
    @Step("Заполняются поля:")
    public void stepfillFields_3(LinkedHashMap<String,String> fields) {
        fields.forEach(this::stepfillField_3);
    }
    @Step("Далее")
    public void stepbuttonNext2(){
        new PageContactForm_v2(driver).setbuttonNext2();
    }
}
