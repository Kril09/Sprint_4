package ru.yandex.test;

import org.junit.Test;
import ru.yandex.MainPage;

import static org.junit.Assert.assertEquals;

public class assertQusteoins extends BaseUITest{


    @Test
    public void checkAccordion0() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsHowMuch();
        mainPage.textAnswerHowMuch();
        assertEquals("Allarm", mainPage.howMuchExpectedAnswer, mainPage.textAnswerHowMuch());
    }
    @Test
    public void checkAccordion1() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsFewScooters();
        mainPage.textAnswerFewScooters();
        assertEquals("Allarm", mainPage.fewScootersExpectedAnswer, mainPage.textAnswerFewScooters());
    }
    @Test
    public void checkAccordion2() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsHowTimeRent();
        mainPage.textAnswerHowTimeRent();
        assertEquals("Allarm", mainPage.howTimeRentExpectedAnswer, mainPage.textAnswerHowTimeRent());
    }
    @Test
    public void checkAccordion3() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCanMuchScooter();
        mainPage.textAnswerCanMuchScooter();
        assertEquals("Allarm", mainPage.canMuchScooterExpectedAnswer, mainPage.textAnswerCanMuchScooter());
    }
    @Test
    public void checkAccordion4() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCanExpected();
        mainPage.textAnswerCanExpected();
        assertEquals("Allarm", mainPage.canWaitingAnswer, mainPage.textAnswerCanExpected());
    }
    @Test
    public void checkAccordion5() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsBringCharger();
        mainPage.textAnswerBringCharger();
        assertEquals("Allarm", mainPage.bringChargerExpectedAnswer, mainPage.textAnswerBringCharger());
    }
    @Test
    public void checkAccordion6() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsCancelOrder();
        mainPage.textAnswerCancelOrder();
        assertEquals("Allarm", mainPage.cancelOrderExpectedAnswer, mainPage.textAnswerCancelOrder());
    }
    @Test
    public void checkAccordion7() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scroolQuestions();
        mainPage.clickQuestionsMkadForever();
        mainPage.textAnswerMkadForever();
        assertEquals("Allarm", mainPage.mkadForeverExpectedAnswer, mainPage.textAnswerMkadForever());
    }
}

