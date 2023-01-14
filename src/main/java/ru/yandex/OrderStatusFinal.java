package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusFinal extends abstractPage{

    public OrderStatusFinal(WebDriver webDriver){
        super(webDriver);
    }
    private By orderYes = By.xpath("//button[text()='Да'][@class='Button_Button__ra12g Button_Middle__1CSJM']");//подтверждение заказа

    public void clickYes() {
        webDriver.findElement(orderYes).click();
    }
}
