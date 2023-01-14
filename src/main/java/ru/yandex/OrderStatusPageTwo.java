package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPageTwo extends abstractPage{
    public OrderStatusPageTwo(WebDriver webDriver){
        super(webDriver);
    }
    private By checkBoxBlack = By.xpath("//label[@for='black']"); //чек-бокс цвета
    private By checkBoxGrey = By.xpath("//label[@for='grey']"); //чек-бокс цвета
    private By data = By.xpath("//input[@placeholder='* Когда привезти самокат']");// дата заказа
    private By rent = By.className("Dropdown-arrow");//срок аренды
    private By rentTime = By.xpath("//div[text()='сутки']");//выбор сутки
    private By rentTime1 = By.xpath("//div[text()='двое суток']");//выбор двое суток
    private By orderTwo = By.xpath("//button[text()='Заказать'][@class = 'Button_Button__ra12g Button_Middle__1CSJM']");//конпка окончательного заказа

    public void sendData(String orderData){
        webDriver.findElement(data).click();
        webDriver.findElement(data).sendKeys(orderData);
    }
    public void clickCheckBoxBlack() {
        webDriver.findElement(checkBoxBlack).click();
    }
    public void clickCheckBoxGrey() {
        webDriver.findElement(checkBoxGrey).click();
    }
    public void clickRent(){
        webDriver.findElement(rent).click();
        webDriver.findElement(rentTime).click();
    }
    public void clickRent1(){
        webDriver.findElement(rent).click();
        webDriver.findElement(rentTime1).click();
    }
    public  void clickOrderTwo(){
        webDriver.findElement(orderTwo).click();
    }


}
