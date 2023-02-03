package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends AbstractPage {
    private final By name = By.xpath("//input[@placeholder='* Имя']");//поле Имя
    private final By surname = By.xpath("//input[@placeholder='* Фамилия']");//поле Фамилия
    private final By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //поле адресс
    private final By list = By.className("select-search");//клик на список
    private final By elementList = By.xpath("//li[@data-index = '0']");//выбор Бульвар Рокоссовского
    private final By elementList1 = By.xpath("//li[@data-index = '1']");//выбор Черкизовская
    private final By number = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //номер телефона
    private final By next = By.xpath("//button[text()='Далее']"); //далее

    public OrderStatusPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void sendName(String nameUser) { // заполнение поля Имя
        webDriver.findElement(name).sendKeys(nameUser);
    }

    public void sendSurname(String surName) { // заполнение поля Фамилия
        webDriver.findElement(surname).sendKeys(surName);
    }

    public void sendAddress(String addressUser) { // заполнение поля Адрес
        webDriver.findElement(address).sendKeys(addressUser);
    }

    public void clickInputList() { // клик по полю список станций
        webDriver.findElement(list).click();
    }

    public void clickElementList() { // выбор станции
        webDriver.findElement(elementList).click();
    }

    public void clickElementList1() { // выбор станции
        webDriver.findElement(elementList1).click();
    }

    public void sendNumber(String numberUser) { // заполнение поля номер
        webDriver.findElement(number).sendKeys(numberUser);
    }

    public void clickButtonNext() { // нажатие кнопки "Далее"
        webDriver.findElement(next).click();
    }
}

