package pageobject.currencies;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class HomePage {
    static final By ACTION_BAR_SELECTOR = By.id("de.salomax.currencies:id/action_bar");
    static final By EXCHANGE_RATE_CHART_SELECTOR = new AppiumBy.ByAccessibilityId("Exchange rate chart");
    static final By HISTORICAL_RATES_SELECTOR = new AppiumBy.ByAccessibilityId("Historical rates");
    static final By MORE_OPTIONS_SELECTOR = new AppiumBy.ByAccessibilityId("More options");
    static final By TEXT_FROM_SELECTOR = By.id("de.salomax.currencies:id/textFrom");
    static final By TEXT_TO_SELECTOR = By.id("de.salomax.currencies:id/textTo");
    static final By DIGIT_1_SELECTOR = By.id("de.salomax.currencies:id/btn_1");
    public static SelenideAppiumElement actionBarElement() {
        return $(ACTION_BAR_SELECTOR);
    }
    public static SelenideAppiumElement exchangeRateChartElement() {
        return $(EXCHANGE_RATE_CHART_SELECTOR);
    }
    public static SelenideAppiumElement historicalRatesElement() {
        return $(HISTORICAL_RATES_SELECTOR);
    }
    public static SelenideAppiumElement moreOptionsElement() {
        return $(MORE_OPTIONS_SELECTOR);
    }
    public static SelenideAppiumElement textFromElement() {
        return $(TEXT_FROM_SELECTOR);
    }
    public static SelenideAppiumElement textToElement() {
        return $(TEXT_TO_SELECTOR);
    }
    public HomePage clickDigit1() {
        $(DIGIT_1_SELECTOR).click();
        return this;
    }
}
