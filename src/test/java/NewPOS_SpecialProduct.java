
import Pages.PageHomeTT;
import Steps.*;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import java.util.LinkedHashMap;

public class NewPOS_SpecialProduct extends BaseClass {

    PageRegistrationStep pageRegistrationStep;
    PageHomeTTStep pageHomeTTStep;
    Select_TT_Step pageSelectTTStep;
    ContactCardStep contactCardStep;
    PageContactForm_v2_Step pageContactForm_v2_step;
    CreditCircsStep pageCreditCircsStep;
    AdditionalServicesStep additionalServicesStep;
    PageExecutionTransactionStep pageExecutionTransactionStep;





    @Test
    @Title("NewPOS специальный продукт")
    public void TestNewPos(){

        pageRegistrationStep = new PageRegistrationStep(driver);
        pageHomeTTStep = new PageHomeTTStep(driver);
        pageSelectTTStep = new Select_TT_Step(driver);
        contactCardStep = new ContactCardStep(driver);
        pageContactForm_v2_step = new PageContactForm_v2_Step(driver);
        pageCreditCircsStep= new CreditCircsStep(driver);
        additionalServicesStep= new AdditionalServicesStep(driver);
        pageExecutionTransactionStep = new PageExecutionTransactionStep(driver);


        LinkedHashMap<String,String> testDate = new LinkedHashMap<>();

        testDate.put("Логин","W442957");
        testDate.put("Пароль","123456789");
        testDate.put("Когда выдан паспорт","12.03.2015");
        testDate.put("Фамилия","НОВПОСОКОВЫЙ");
        testDate.put("Имя","ИВАНЪ");
        testDate.put("Отчество","ИВАНЫЧ");
        testDate.put("Дата рождения","12 03 1993");
        testDate.put("Поиск ТТ","5401308000001");
        testDate.put("Мобильный телефон","9268484949");
        testDate.put("Рабочий телефон","9168854949");
        testDate.put("Телефон проживания","4498498498");
        testDate.put("Адрес регистрации","108816, Россия, Москва, Внуковское п, г Москва, п Мичуринец, ул Ленина, д 41, кв 1");
        testDate.put("Дата регистрации","10.10.2010");
        testDate.put("Код подразделения","228-282");
        testDate.put("Кем выдан","УФМС");
        testDate.put("Место рождения","Москва");
        testDate.put("Персональный доход","50000,00");
        testDate.put("Наименование","Колонка");
        testDate.put("Марка","JVC");
        testDate.put("Модель","010101");
        testDate.put("Цена за шт.","10000");
        testDate.put("КОДОВОЕ СЛОВО","КОДОСЛОВО");
        testDate.put("День рождения матери","01.01.1960");
        testDate.put("Школа","15");
        testDate.put("Дата сделки","08.02.2018");
        testDate.put("Выбор ТТ","5401308000001");
       /* testDate.put("","");
        testDate.put("","");
        testDate.put("","");*/


        pageRegistrationStep.stepfillFields(testDate);
        pageRegistrationStep.stepClickSubmitButton();

        pageHomeTTStep.stepHomeTT();
        pageHomeTTStep.stepBuilder();
        pageHomeTTStep.stepNewApplication();

        pageSelectTTStep.stepfillFields(testDate);
        pageSelectTTStep.stepSelectTT();

        contactCardStep.stepSeriaAndNumberOfPassport();
        contactCardStep.stepfillFields(testDate);
        contactCardStep.stepMale();
        contactCardStep.stepValidationData();
        contactCardStep.stepOldPassport();
        contactCardStep.stepCheck();
        contactCardStep.stepSet("Авто аудио-видео системы");
       /* contactCardStep.stepSendPhoto1("C:/ОТПБанк/фото1.png");
        contactCardStep.stepSendPhotoOK1();*/
        contactCardStep.stepButtonNext();

        pageContactForm_v2_step.stepSendPhoto("C:/ОТПБанк/фото1.png");
        pageContactForm_v2_step.stepSendPhotoOK();
        pageContactForm_v2_step.stepSendDoc("C:/ОТПБанк/фото2.png");
        pageContactForm_v2_step.stepSendDocoOK();
        pageContactForm_v2_step.stepSendPassport("C:/ОТПБанк/фото3.png");
        pageContactForm_v2_step.stepSendPassportOK();
        pageContactForm_v2_step.stepSocialStatus();
        pageContactForm_v2_step.stepMaritalStatus();
        pageContactForm_v2_step.stepCheckBoxEmail();
        pageContactForm_v2_step.stepfillFields(testDate);
        pageContactForm_v2_step.stepCheckAddress();
        pageContactForm_v2_step.stepAppletButton();
        pageContactForm_v2_step.stepfillFields_2(testDate);
        pageContactForm_v2_step.stepadressOfLiving();
        pageContactForm_v2_step.steppostAdress();
        pageContactForm_v2_step.stepbirthdayCountryLabel();
        pageContactForm_v2_step.stepfillFields_3(testDate);
        pageContactForm_v2_step.stepbuttonNext2();

        pageCreditCircsStep.stepSpecialProduct();
        pageCreditCircsStep.stepProductSpecial();
        pageCreditCircsStep.stepSelectLifeInsurance();
        pageCreditCircsStep.stepWorkInsurance();
        pageCreditCircsStep.stepCreditTerm();
        pageCreditCircsStep.stepAppletButtonCalc();
        pageCreditCircsStep.stepCreateCredit();

        additionalServicesStep.stepAddCardPP();
        additionalServicesStep.stepButtonNext2();

        pageExecutionTransactionStep.stepAppletButton();
        pageExecutionTransactionStep.stepButtonClose();
        pageExecutionTransactionStep.stepfillFields(testDate);
        pageExecutionTransactionStep.stepAppletButton2();
        pageExecutionTransactionStep.stepfillField(testDate);
        pageExecutionTransactionStep.stepSelectTT();
        pageExecutionTransactionStep.stepAppletButtonNow();

        pageHomeTTStep.stepCheckAgreement();
        pageHomeTTStep.stepAgreement();

    }

}