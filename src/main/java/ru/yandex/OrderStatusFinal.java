package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusFinal extends AbstractPage {
    private final By orderYes = By.xpath("//button[text()='Да'][@class='Button_Button__ra12g Button_Middle__1CSJM']");//подтверждение заказа

    public OrderStatusFinal(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickYes() { //подтверждение заказа, нажатие "ДА"
        webDriver.findElement(orderYes).click();
    }
}
