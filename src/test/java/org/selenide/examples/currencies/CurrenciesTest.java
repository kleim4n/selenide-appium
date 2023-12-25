package org.selenide.examples.currencies;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import pageobject.currencies.HomePage;
import webdriverprovider.AndroidDriverWithCurrencies;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static pageobject.currencies.HomePage.*;

public class CurrenciesTest {

    public static final HomePage HOME_PAGE = new HomePage();

    @BeforeAll
    static void setUp() {
        closeWebDriver();
        Configuration.browserSize = null;
        Configuration.browser = AndroidDriverWithCurrencies.class.getName();
        WebDriverRunner.addListener(new WebDriverListener() {
            @Override
            public void beforeClick(WebElement element) {
                WebDriverListener.super.beforeClick(element);
            }
        });
        open();
    }
    @Test
    void actionBarTest() {
        exchangeRateChartElement().shouldBe(visible);
        historicalRatesElement().shouldBe(visible);
        moreOptionsElement().shouldBe(visible);
    }
    @Test
    void convertTest() {
        textFromElement()
            .shouldHave(attribute("name", "$ 0"));
        textToElement()
            .shouldHave(attribute("name", "€ 0"));
        HOME_PAGE
            .clickDigit1();
        textFromElement()
            .shouldHave(attribute("name", "$ 1"));
        textToElement()
            .shouldNotHave(attribute("name", "€ 0"));
    }
}
