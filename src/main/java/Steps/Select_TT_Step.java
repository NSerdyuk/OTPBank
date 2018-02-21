package Steps;

import Pages.PageRegistration;
import Pages.Select_TT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class Select_TT_Step extends BaseClass {

    public Select_TT_Step(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Поле поиск заполняется значением кода ТТ")
    public void fillSearch(String fillField, String value){
        new Select_TT(driver).fillField(fillField,value);
    }
    @Step("Заполняется поле:")
    public void stepfillFields(HashMap<String,String> fields){
        fields.forEach(this::fillSearch);
}

    @Step("выбор ТТ")
    public void stepSelectTT(){
        new Select_TT(driver).selectTT();
    }
}
