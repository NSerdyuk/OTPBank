package Steps;

import Pages.PageAdditionalServices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class AdditionalServicesStep extends BaseClass {

    public AdditionalServicesStep (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Убрать чек-бокс доп.карты перекрестных продаж")
    public void stepAddCardPP(){
        new PageAdditionalServices(driver).setAddCardPP();
    }

    @Step("Переход на следующую страницу")
    public void stepButtonNext2(){
        new PageAdditionalServices(driver).setButtonNext2();
    }


}
