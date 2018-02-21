package Steps;

import Pages.PageContactForm_v2;
import Pages.PageExecutionTransaction;
import Pages.Select_TT;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.LinkedHashMap;

public class PageExecutionTransactionStep extends BaseClass {
    public PageExecutionTransactionStep (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
        @Step("Распечатать документы")
    public void stepAppletButton(){
        new PageExecutionTransaction(driver).setAppletButton();
    }
    @Step("Кнопка закрыть")
    public void stepButtonClose(){
        new PageExecutionTransaction(driver).setButtonClose();
    }
    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField(String fieldName, String value) {
        new PageExecutionTransaction(driver).fillField(fieldName, value);
    }
    @Step("Заполняются поля:")
    public void stepfillFields(LinkedHashMap<String,String> fields){
        fields.forEach(this::stepfillField);
    }

    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField3(String fieldName, String value) {
        new PageExecutionTransaction(driver).fillField3(fieldName, value);
    }
    @Step("Заполняются поля:")
    public void stepfillField(LinkedHashMap<String,String> fields){
        fields.forEach(this::stepfillField3);
    }

    @Step("выбор ТТ")
    public void stepSelectTT(){
        new PageExecutionTransaction(driver).selectTT2();
    }
    @Step("Кнопка Апплета-2")
    public void stepAppletButton2(){
        new PageExecutionTransaction(driver).setAppletButton2();
    }
    @Step("Кнопка Апплета-3")
    public void stepAppletButton3(){
        new PageExecutionTransaction(driver).setAppletButton3();
    }
    @Step("Кнопка Апплета-now")
    public void stepAppletButtonNow(){
        new PageExecutionTransaction(driver).setAppletButtonNow();
    }

    @Step("Кнопка Позже")
    public void stepAppletButtonLater(){
        new PageExecutionTransaction(driver).setAppletButtonLater();
    }

    @Step("Выбор чек-бакса 'Клиент является публичным должностным лицом'")
    public void stepPDLFlagLabel(){
        new PageExecutionTransaction(driver).setpdlFlagLabel();
    }

    @Step("Выбор типа ПДЛ")
    public void stepCheckPDL(){
        new PageExecutionTransaction(driver).setCheckPDL();
    }

    @Step("Добавление фотографии")
    public void stepSendPhoto2(String sendPhoto1){
        new PageExecutionTransaction(driver).setSendPhoto(sendPhoto1);
    }
    @Step("Подтверждение")
    public void stepSendPhotoOK2(){
        new PageExecutionTransaction(driver).setSendPhotoOK();
    }
    @Step("Добавление документа")
    public void stepSendDoc2(String sendDoc1){
        new PageExecutionTransaction(driver).setSendDoc(sendDoc1);
    }
    @Step("Подтверждение")
    public void stepSendDocoOK2(){
        new PageExecutionTransaction(driver).setSendDocoOK();
    }
    @Step("Добавление Паспорта")
    public void stepSendPassport2(String sendPassport1){ new PageExecutionTransaction(driver).setSendPassport(sendPassport1); }
    @Step("Подтверждение")
    public void stepSendPassportOK2(){
        new PageExecutionTransaction(driver).setSendPassportOK();
    }


    @Step("Нажать на кнопку Подписать и авторизовать")
    public void stepButton4(){
        new PageExecutionTransaction(driver).setButton4();
    }

    @Step("Нажать на кнопку Отказ от подписания")
    public void stepButton5(){
        new PageExecutionTransaction(driver).setButton5();
    }

}
