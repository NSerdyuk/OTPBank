package Steps;

import Pages.PageContactForm_v2;
import Pages.PageCreditCircs_v2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.LinkedHashMap;

public class CreditCircsStep extends BaseClass {

    public CreditCircsStep (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    /**
     * Методы по специальному продукту:
     * @stepSelectLifeInsurance - Выбор Страхование жизни
     * @stepWorkInsurance - Выбор Страхование от потери работы
     * @stepProductSpecial - Выбор продукта
     * @stepCreditTerm - Выбор срока кредитования
     * @stepAppletButtonCalc - Нажатие кнопки "Рассчитать"
     * @stepCreateCredit - Нажатие кнопки "Оформление сделки"
     *
     * */

    @Step("Выбор вкладки 'Специальный продукт'")
    public void stepSpecialProduct(){
        new PageCreditCircs_v2(driver).setSpecialProduct();
    }


    @Step("Выбор Страхование жизни {0}")
    public void stepSelectLifeInsurance(){
        new PageCreditCircs_v2(driver).unsetSelectLifeInsurance();
    }

    @Step("Выбор Страхование от потери работы {0}")
    public void stepWorkInsurance(){
        new PageCreditCircs_v2(driver).unsetWorkInsurance();
    }

    @Step("Выбор продукта")
    public void stepProductSpecial(){
        new PageCreditCircs_v2(driver).setProductSpecial();
    }

    @Step("Выбор срока кредитования")
    public void stepCreditTerm(){
        new PageCreditCircs_v2(driver).setCreditTerm();
    }
    @Step("Поля {0} заполняются значением {1}")
    public void stepDate(String date, String value) {
        new PageCreditCircs_v2(driver).setDate(date, value);
    }
    @Step("Заполняются поля:")
    public void stepDateset(LinkedHashMap<String,String> fields){
        fields.forEach(this::stepDate);
    }

    @Step("Нажатие кнопки 'Рассчитать'")
    public void stepAppletButtonCalc(){
        new PageCreditCircs_v2(driver).setAppletButtonCalc();
    }

    @Step("Нажатие кнопки 'Оформление сделки'")
    public void stepCreateCredit(){
        new PageCreditCircs_v2(driver).setCreateCredit();
    }



    /**
     * Методы по продукту промо
     * @stepSelectLifeInsurance - Выбор Страхование жизни
     * @stepWorkInsurance - Выбор Страхование от потери работы
     * @stepProductPromo - Выбор продукта
     * @stepCreditTermPromo - Выбор срока кредитования
     * @stepAppletButtonCalc - Нажатие кнопки "Рассчитать"
     * @stepCreateCredit - Нажатие кнопки "Оформление сделки"
     * */

    @Step("Выбор вкладки 'Промо'")
    public void stepPromoProduct(){
        new PageCreditCircs_v2(driver).setPromoProduct();
    }

    @Step("Выбор продукта")
    public void stepProductPromo(){
        new PageCreditCircs_v2(driver).setProductPromo();
    }

    @Step("Выбор срока кредитования")
    public void stepCreditTermPromo(){
        new PageCreditCircs_v2(driver).setCreditTermPromo();
    }

    /**
     * Методы по динамическому продукту
     *@stepSelectLifeInsurance - Выбор Страхование жизни
     *@stepWorkInsurance - Выбор Страхование от потери работы
     *@fillSearch - Первоначальный взнос
     *@stepCreditTermDP -Срок кредита
     *@stepCreateCredit - Нажатие кнопки "Оформление сделки"
     */

    @Step("Выбор вкладки 'Динамический продукт'")

    public  void stepDynamicProduct(){
        new PageCreditCircs_v2(driver).setDynamicProduct();
    }

    @Step("Заполнение поля {0}")
    public void stepfillSearch(String fillField, String value){
        new PageCreditCircs_v2(driver).fillField(fillField,value);
    }
    @Step("Заполняется поле:")
    public void stepfillFields(LinkedHashMap<String,String> fields){
        fields.forEach(this::stepfillSearch);
    }

    @Step("Выбор срока{0}")

    public void stepCreditTermDP(String termDP){
        new PageCreditCircs_v2(driver).setCreditTermDP();
    }


}
