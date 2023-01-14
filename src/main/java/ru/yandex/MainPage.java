package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage<textAnswerHowMuchText> extends abstractPage{ //кнопки "Заказать"
    private By order = By.className("Button_Button__ra12g");//верхняя кнопка "Заказать"
    private By orderTwo = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //нижняя кнопка "Заказать"

    //блок FAQ, вопросы
    private By bossQuestions = By.xpath("//div[text()='Вопросы о важном']");//Вопросы о важном

    private By howMuch = By.xpath("//div[text()='Сколько это стоит? И как оплатить?']");//Сколько стоит
    private By fewScooters = By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']");//несколько самокатов
    private By howTimeRent = By.xpath("//div[text()='Как рассчитывается время аренды?']");//Как рассчитывается время аренды?
    private By canMuchScooter = By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']");//Можно ли заказать самокат прямо на сегодня?
    private By canExpected = By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");//Можно ли продлить заказ или вернуть самокат раньше?
    private By bringCharger = By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']");//Вы привозите зарядку вместе с самокатом?
    private By cancelOrder = By.xpath("//div[text()='Можно ли отменить заказ?']");//Можно ли отменить заказ?
    private By mkadForever = By.xpath("//div[text()='Я живу за МКАДом, привезёте?']");//Я живу за МКАДом, привезёте? баг на опечатку, сделал тест валидным сразу

    //блок FAQ, ответы
    private By howMuchAnswer = By.xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");//Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By fewScootersAnswer = By.xpath("//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");//Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    private By howTimeRentAnswer = By.xpath("//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");//Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    private By canMuchScooterAnswer = By.xpath("//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");//Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    private By canExpectedAnswer = By.xpath("//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");//Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    private By bringChargerAnswer = By.xpath("//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");//Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    private By cancelOrderAnswer = By.xpath("//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");//Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    private By mkadForeverAnswer = By.xpath("//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");//Да, обязательно. Всем самокатов! И Москве, и Московской области.

    //Ожидайки резулты
    public String howMuchExpectedAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String fewScootersExpectedAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String howTimeRentExpectedAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String canMuchScooterExpectedAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String canWaitingAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String bringChargerExpectedAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String cancelOrderExpectedAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String mkadForeverExpectedAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public MainPage(WebDriver webDriver){
        super(webDriver);
    }
    public void clickOrderStartButton(){ //клик по верхней кнопке заказать
        webDriver.findElement(order).click();
    }
    public void clickOrderStartButtonTwo(){ //клик по нижней кнопке заказать и скролл до нее
        WebElement element = webDriver.findElement(orderTwo);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        webDriver.findElement(orderTwo).click();
    }

    public void scroolQuestions() { //скролл до вопросов
        WebElement element = webDriver.findElement(bossQuestions);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuestionsHowMuch(){ //клик на вопрос Сколько стоит
        webDriver.findElement(howMuch).click();
    }
    public Object textAnswerHowMuch(){ //текст ошибки Сколько стоит
        String result0 = webDriver.findElement(howMuchAnswer).getText();
        return result0;
    }
    public void clickQuestionsFewScooters(){ //клик на вопрос несколько самокатов
        webDriver.findElement(fewScooters).click();
    }
    public Object textAnswerFewScooters(){ //текст ошибки несколько самокатов
        String result1 = webDriver.findElement(fewScootersAnswer).getText();
        return result1;
    }
    public void clickQuestionsHowTimeRent (){ //клик на вопрос Как рассчитывается время аренды?
        webDriver.findElement(howTimeRent).click();
    }
    public Object textAnswerHowTimeRent (){ //текст ошибки Как рассчитывается время аренды?
        String result2 = webDriver.findElement(howTimeRentAnswer).getText();
        return result2;
    }
    public void clickQuestionsCanMuchScooter (){ //клик на вопрос Можно ли заказать самокат прямо на сегодня?
        webDriver.findElement(canMuchScooter).click();
    }
    public Object textAnswerCanMuchScooter (){ //текст ошибки Можно ли заказать самокат прямо на сегодня?
        String result3 = webDriver.findElement(canMuchScooterAnswer).getText();
        return result3;
    }
    public void clickQuestionsCanExpected (){ //клик на вопрос Можно ли продлить заказ или вернуть самокат раньше?
        webDriver.findElement(canExpected).click();
    }
    public Object textAnswerCanExpected (){ //текст ошибки Можно ли продлить заказ или вернуть самокат раньше?
        String result4 = webDriver.findElement(canExpectedAnswer).getText();
        return result4;
    }
    public void clickQuestionsBringCharger (){ //клик на вопрос Вы привозите зарядку вместе с самокатом?
        webDriver.findElement(bringCharger).click();
    }
    public Object textAnswerBringCharger (){ //текст ошибки Вы привозите зарядку вместе с самокатом?
        String result5 = webDriver.findElement(bringChargerAnswer).getText();
        return result5;
    }
    public void clickQuestionsCancelOrder (){ //клик на вопрос Можно ли отменить заказ?
        webDriver.findElement(cancelOrder).click();
    }
    public Object textAnswerCancelOrder (){ //текст ошибки Можно ли отменить заказ?
        String result6 = webDriver.findElement(cancelOrderAnswer).getText();
        return result6;
    }
    public void clickQuestionsMkadForever (){ //клик на вопрос Я живу за МКАДом, привезёте?
        webDriver.findElement(mkadForever).click();
    }
    public Object textAnswerMkadForever (){ //текст ошибки Я живу за МКАДом, привезёте?
        String result7 = webDriver.findElement(mkadForeverAnswer).getText();
        return result7;
    }
}

