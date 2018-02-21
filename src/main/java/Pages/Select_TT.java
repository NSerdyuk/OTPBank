package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_TT extends BaseClass {

    public Select_TT(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /*Локаторы*/
    @FindBy(id = "s_i_s_1_l")
    public WebElement search_tt;

    @FindBy(className = "highlight")
    public WebElement code_tt;

    /**Метод ввода кода ТТ в строку поиска*/
    public void fillField(String code, String value) {
        switch (code) {
            case "Поиск ТТ":
                fillField(search_tt, value);
        }
    }

    public String getFillField(String code) {
        switch (code) {
            case "Поиск":
                return search_tt.getAttribute("value");
        }
        throw new AssertionError("Не заполнено поле Код ТТ");
    }

    public void selectTT() {
            Actions dcTT = new Actions(driver);
            Action dbc = dcTT.doubleClick(driver.findElement(By.className("highlight"))).build();
            dbc.perform();
    }
}
