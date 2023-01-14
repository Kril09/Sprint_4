package ru.yandex;

import org.openqa.selenium.WebDriver;

public abstract class abstractPage {
    protected final WebDriver webDriver;
    protected abstractPage(WebDriver webDriver){
        this.webDriver = webDriver;

    }
}
