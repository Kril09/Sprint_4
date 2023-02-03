package ru.yandex.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.MainPage;
import ru.yandex.OrderStatusFinal;
import ru.yandex.OrderStatusPage;
import ru.yandex.OrderStatusPageTwo;

public class OrderTest extends BaseUITest {

    @Test
    public void orderBySam0() { //тест с заказом по верхней кнопке
        String newNameUser = "Аллолоша";
        String newSurname = "Кукошовна";
        String newUserAddress = "Москоу стрит";
        String newNumberUser = "12312312399";
        String newDataOrder = "20.02.2023";

        MainPage mainPage = new MainPage(webDriver); // заказ на главной странице
        mainPage.clickOrderStartButton();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver); // заполнение данных на первой странице
        orderStatusPage.sendName(newNameUser);
        orderStatusPage.sendSurname(newSurname);
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList();
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver); // заполнение данных на второй странице
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent();
        orderStatusPageTwo.clickCheckBoxBlack();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver); // подтверждение заказа
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }

    @Test
    public void orderBySam1() { //тест с заказом по нижней кнопке
        String newNameUser = "Ваня";
        String newSurname = "Иванов";
        String newUserAddress = "Петровка стрит";
        String newNumberUser = "99988899977";
        String newDataOrder = "22.04.2023";

        MainPage mainPage = new MainPage(webDriver); // заказ на главной странице
        mainPage.clickOrderStartButtonTwo();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver); // заполнение данных на первой странице
        orderStatusPage.sendName(newNameUser);
        orderStatusPage.sendSurname(newSurname);
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList();
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver); // заполнение данных на второй странице
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent();
        orderStatusPageTwo.clickCheckBoxBlack();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver); // подтверждение заказа
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }

    @Test
    public void orderBySam2() { //тест с заказом по верхней кнопке
        String newNameUser = "Алла";
        String newSurname = "Борисовна";
        String newUserAddress = "Тель-авив стрит";
        String newNumberUser = "12312312300";
        String newDataOrder = "13.06.2023";

        MainPage mainPage = new MainPage(webDriver); // заказ на главной странице
        mainPage.clickOrderStartButton();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver); // заполнение данных на первой странице
        orderStatusPage.sendName(newNameUser);
        orderStatusPage.sendSurname(newSurname);
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList1();
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver); // заполнение данных на второй странице
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent1();
        orderStatusPageTwo.clickCheckBoxGrey();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver); // подтверждение заказа
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }

    @Test
    public void orderBySam3() { //тест с заказом по нижней кнопке
        String newNameUser = "Максим";
        String newSurname = "Ли";
        String newNumberUser = "99988899967";
        String newUserAddress = "Лубянка стрит";
        String newDataOrder = "23.04.2024";

        MainPage mainPage = new MainPage(webDriver); // заказ на главной странице
        mainPage.clickOrderStartButtonTwo();

        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver); // заполнение данных на первой странице
        orderStatusPage.sendName(newNameUser);
        orderStatusPage.sendSurname(newSurname);
        orderStatusPage.sendAddress(newUserAddress);
        orderStatusPage.clickInputList();
        orderStatusPage.clickElementList1();
        orderStatusPage.sendNumber(newNumberUser);
        orderStatusPage.clickButtonNext();

        OrderStatusPageTwo orderStatusPageTwo = new OrderStatusPageTwo(webDriver); // заполнение данных на второй странице
        orderStatusPageTwo.sendData(newDataOrder);
        orderStatusPageTwo.clickRent1();
        orderStatusPageTwo.clickCheckBoxGrey();
        orderStatusPageTwo.clickOrderTwo();

        OrderStatusFinal orderStatusFinal = new OrderStatusFinal(webDriver); // подтверждение заказа
        orderStatusFinal.clickYes();
        boolean isDisplayed = webDriver.findElement(By.xpath("//div[text()='Заказ оформлен']")).isDisplayed();
        Assert.assertTrue("Заказ оформлен", isDisplayed);
    }
}
