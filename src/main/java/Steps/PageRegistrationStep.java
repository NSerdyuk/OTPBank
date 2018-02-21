package Steps;

import Pages.PageRegistration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class PageRegistrationStep extends BaseClass {

    public PageRegistrationStep(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField(String fieldName, String value) {
        new PageRegistration(driver).fillField(fieldName,value);
    }

    @Step("Заполняются поля:")
    public void stepfillFields(HashMap<String,String> fields){
        fields.forEach(this::stepfillField);
    }



    @Step("Ввод")
    public void stepClickSubmitButton(){
        new PageRegistration(driver).clickSubmitButton();

    }









}
