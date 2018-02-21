package Steps;

import Pages.PageHomeTT;
import ru.yandex.qatools.allure.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageHomeTTStep extends  BaseClass {

    public PageHomeTTStep(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Выбор Домашней ТТ")
    public void stepHomeTT(){
        new PageHomeTT(driver).setHomeTT();
    }


    @Step("Выполнен выбор ТТ")
    public void stepBuilder(){
        new PageHomeTT(driver).setBuilder();
    }

    @Step("Выполнено нажатие на создание новой заявки")
    public  void stepNewApplication(){
        new PageHomeTT(driver).setNewApplication();
    }

    @Step("Выбор существующей заявки")
    public void stepOldissue(){
        new PageHomeTT(driver).setOldissue();
    }


    @Step("Выбор вкладки Договор")
    public void stepCheckAgreement(){
        new PageHomeTT(driver).setCheckAgreement();
    }


    @Step("Выбор Договора")
    public void stepAgreement(){
        new PageHomeTT(driver).setAgreement();
    }

}
