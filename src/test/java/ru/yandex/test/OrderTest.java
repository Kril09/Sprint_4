package ru.yandex.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.MainPage;
import ru.yandex.OrderStatusFinal;
import ru.yandex.OrderStatusPage;
import ru.yandex.OrderStatusPageTwo;


public class OrderTest extends BaseUITest{

    @Test
    public void orderBySam0(){ //тест с заказом по верхней кнопке
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStartButton();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        String newNameUser = "Аллолоша";
        orderStatusPage.sendName(newNameUser);
        String newSurname = "Кукошовна";
        orderStatusPage.sendSurname(newSurname);
        String newUserAddress = "Москоу стрит";
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList();
        String newNumberUser = "12312312399";
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver);
        String newDataOrder = "20.02.2023";
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent();
        orderStatusPageTwo.clickCheckBoxBlack();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver);
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }
    @Test
    public void orderBySam1(){ //тест с заказом по нижней кнопке
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStartButtonTwo();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        String newNameUser = "Ваня";
        orderStatusPage.sendName(newNameUser);
        String newSurname = "Иванов";
        orderStatusPage.sendSurname(newSurname);
        String newUserAddress = "Петровка стрит";
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList();
        String newNumberUser = "99988899977";
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver);
        String newDataOrder = "22.04.2023";
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent();
        orderStatusPageTwo.clickCheckBoxBlack();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver);
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }


    @Test
    public void orderBySam2(){ //тест с заказом по верхней кнопке
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStartButton();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        String newNameUser = "Алла";
        orderStatusPage.sendName(newNameUser);
        String newSurname = "Борисовна";
        orderStatusPage.sendSurname(newSurname);
        String newUserAddress = "Тель-авив стрит";
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList1();
        String newNumberUser = "12312312300";
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver);
        String newDataOrder = "13.06.2023";
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent1();
        orderStatusPageTwo.clickCheckBoxGrey();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver);
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }
    @Test
    public void orderBySam3(){ //тест с заказом по нижней кнопке
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStartButtonTwo();
        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        String newNameUser = "Максим";
        orderStatusPage.sendName(newNameUser);
        String newSurname = "Ли";
        orderStatusPage.sendSurname(newSurname);
        String newUserAddress = "Лубянка стрит";
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList1();
        String newNumberUser = "99988899967";
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver);
        String newDataOrder = "23.04.2024";
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent1();
        orderStatusPageTwo.clickCheckBoxGrey();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver);
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }
}
