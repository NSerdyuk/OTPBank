package Pages;

import Steps.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAdditionalServices extends BaseClass {

    @FindBy(id = "ISB Rejection Of Cards_Label")
    WebElement addCardPP;

    @FindBy(xpath="//div/button[@title='Далее']")
    WebElement buttonNext2;

    public PageAdditionalServices (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /** Убрать чек-бокс доп.карты перекрестных продаж*/


    public void setAddCardPP(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addCardPP);
        addCardPP.click();

    }


    /**Переход на следующую страницу*/

    public void setButtonNext2() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext2);
            buttonNext2.click();
            Thread.sleep(20000);
        } catch (InterruptedException c) {
            c.printStackTrace();
        }}




}
