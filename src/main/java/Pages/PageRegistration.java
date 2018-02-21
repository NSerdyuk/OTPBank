package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRegistration extends BaseClass {

    public PageRegistration(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**Локаторы страницы*/

    @FindBy(id = "s_swepi_1")
    public WebElement login;

    @FindBy(id = "s_swepi_2")
    public WebElement password;

    @FindBy(id = "s_swepi_22")
    public WebElement submitButton;


    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Логин":
                fillField(login, value);
                Assert.assertEquals("W442957", login.getAttribute("value"));
                break;
            case "Пароль":
                fillField(password, value);
                Assert.assertEquals("123456789", password.getAttribute("value"));
                break;

        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Логин":
                return login.getAttribute("value");
            case "Пароль":
                return password.getAttribute("value");
        }
        throw new AssertionError("Заполнены не все обязательные поля");
    }

            /**Подтвердить*/
            public void clickSubmitButton(){
                submitButton.click();
            }
 }











