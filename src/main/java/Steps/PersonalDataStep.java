package Steps;

import Pages.ContactCardPage;
import Pages.PagePersonalData;
import Pages.PageRegistration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class PersonalDataStep extends BaseClass {

    public PersonalDataStep(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField4(String fieldName, String value) {
        new PagePersonalData(driver).fillField(fieldName, value);
    }

    @Step("Заполняются поля:")
    public void stepfillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepfillField4);
    }

    @Step("Выбор отрасли организации {0}")
    public void stepBranchOfOrganization() {
        new PagePersonalData(driver).setBranchOfOrganization();

    }

    @Step("Выбор должности")
    public void stepPosition() {
        new PagePersonalData(driver).setPosition();

    }

    @Step("Выбор общего стажа работы на текущем месте")
    public void stepWorkExperience1() {
        new PagePersonalData(driver).setWorkExperience1();

    }


    @Step("Выбор общего стажа работы")
    public void stepWorkExperience2() {
        new PagePersonalData(driver).setWorkExperience2();

    }

    @Step("Выбор колличества сотрудников в организации")
    public void stepNumberOfEmploeeys() {
        new PagePersonalData(driver).setNumberOfEmploeeys();

    }

    @Step("Выбор образования")
    public void stepEducation() {
        new PagePersonalData(driver).setEducation();

    }

    @Step("Выбор собственности")
    public void stepApartmentInProperty() {
        new PagePersonalData(driver).setApartmentInProperty();

    }

    @Step("Выбор дохода семьи")
    public void stepFamilyIncome() {
        new PagePersonalData(driver).setFamilyIncome();
    }

    @Step("Нажатие на кнопку Далее")
    public void stepbuttonNext(){
        new PagePersonalData(driver).setButtonNext();
    }

    @Step("Получение сообщения от отказе оформления кредита")

    public void stepError(){
        new PagePersonalData(driver).setError();
    }
}