package ru.yandex.test;

import org.junit.Test;
import ru.yandex.MainPage;

import static org.junit.Assert.assertEquals;

public class AssertQusteoins extends BaseUITest {
    //Ожидаемые результаты
    public String howMuchExpectedAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String fewScootersExpectedAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String howTimeRentExpectedAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String canMuchScooterExpectedAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String canWaitingAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String bringChargerExpectedAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String cancelOrderExpectedAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String mkadForeverExpectedAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    //Тесты
    @Test
    public void checkAccordion0() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsHowMuch();
        mainPage.textAnswerHowMuch();
        assertEquals("Allarm", howMuchExpectedAnswer, mainPage.textAnswerHowMuch());
    }

    @Test
    public void checkAccordion1() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsFewScooters();
        mainPage.textAnswerFewScooters();
        assertEquals("Allarm", fewScootersExpectedAnswer, mainPage.textAnswerFewScooters());
    }

    @Test
    public void checkAccordion2() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsHowTimeRent();
        mainPage.textAnswerHowTimeRent();
        assertEquals("Allarm", howTimeRentExpectedAnswer, mainPage.textAnswerHowTimeRent());
    }

    @Test
    public void checkAccordion3() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCanMuchScooter();
        mainPage.textAnswerCanMuchScooter();
        assertEquals("Allarm", canMuchScooterExpectedAnswer, mainPage.textAnswerCanMuchScooter());
    }

    @Test
    public void checkAccordion4() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCanExpected();
        mainPage.textAnswerCanExpected();
        assertEquals("Allarm", canWaitingAnswer, mainPage.textAnswerCanExpected());
    }

    @Test
    public void checkAccordion5() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsBringCharger();
        mainPage.textAnswerBringCharger();
        assertEquals("Allarm", bringChargerExpectedAnswer, mainPage.textAnswerBringCharger());
    }

    @Test
    public void checkAccordion6() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCancelOrder();
        mainPage.textAnswerCancelOrder();
        assertEquals("Allarm", cancelOrderExpectedAnswer, mainPage.textAnswerCancelOrder());
    }

    @Test
    public void checkAccordion7() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsMkadForever();
        mainPage.textAnswerMkadForever();
        assertEquals("Allarm", mkadForeverExpectedAnswer, mainPage.textAnswerMkadForever());
    }
}

