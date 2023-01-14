package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends abstractPage{
    public OrderStatusPage(WebDriver webDriver){
        super(webDriver);
    }
    private By name = By.xpath("//input[@placeholder='* Имя']");//поле Имя
    private By surname = By.xpath("//input[@placeholder='* Фамилия']");//поле Фамилия
    private By address = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //поле адресс
    private By list = By.className("select-search");//клик на список

    private By elementList = By.xpath("//li[@data-index = '0']");//выбор Бульвар Рокоссовского

    private By elementList1 = By.xpath("//li[@data-index = '1']");//выбор Черкизовская
    private By number = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //номер телефона
    private By next = By.xpath("//button[text()='Далее']"); //далее


    public void sendName(String nameUser){
        webDriver.findElement(name).sendKeys(nameUser);
    }
    public void sendSurname(String surName){
        webDriver.findElement(surname).sendKeys(surName);
    }
    public void sendAddress(String addressUser){
        webDriver.findElement(address).sendKeys(addressUser);
    }
    public void clickInputList(){
        webDriver.findElement(list).click();
    }
    public void clickElementList() {
        webDriver.findElement(elementList).click();
    }
    public void clickElementList1(){
        webDriver.findElement(elementList1).click();
    }
    public void sendNumber(String numberUser){
        webDriver.findElement(number).sendKeys(numberUser);
    }
    public void clickButtonNext(){
        webDriver.findElement(next).click();
    }
}

