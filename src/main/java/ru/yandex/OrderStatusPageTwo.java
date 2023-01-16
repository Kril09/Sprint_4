package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPageTwo extends AbstractPage {
    private final By checkBoxBlack = By.xpath("//label[@for='black']"); //чек-бокс цвета
    private final By checkBoxGrey = By.xpath("//label[@for='grey']"); //чек-бокс цвета
    private final By data = By.xpath("//input[@placeholder='* Когда привезти самокат']");// дата заказа
    private final By rent = By.className("Dropdown-arrow");//срок аренды
    private final By rentTime = By.xpath("//div[text()='сутки']");//выбор сутки
    private final By rentTime1 = By.xpath("//div[text()='двое суток']");//выбор двое суток
    private final By orderTwo = By.xpath("//button[text()='Заказать'][@class = 'Button_Button__ra12g Button_Middle__1CSJM']");//конпка окончательного заказа

    public OrderStatusPageTwo(WebDriver webDriver) {
        super(webDriver);
    }

    public void sendData(String orderData) { // клик и заполнении даты поставки
        webDriver.findElement(data).click();
        webDriver.findElement(data).sendKeys(orderData);
    }

    public void clickCheckBoxBlack() { // клик по чек-боксу цвета "Черный"
        webDriver.findElement(checkBoxBlack).click();
    }

    public void clickCheckBoxGrey() { // клик по чек-боксу цвета "Серый"
        webDriver.findElement(checkBoxGrey).click();
    }

    public void clickRent() { // клик и выбор времени аренды
        webDriver.findElement(rent).click();
        webDriver.findElement(rentTime).click();
    }

    public void clickRent1() { // клик и выбор времени аренды
        webDriver.findElement(rent).click();
        webDriver.findElement(rentTime1).click();
    }

    public void clickOrderTwo() { // клик по кнопке "Заказать"
        webDriver.findElement(orderTwo).click();
    }


}
