package com.edurio.pages;

import com.edurio.utils.JsClickUtils;
import com.edurio.utils.NextButton;
import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollThirdPage {
    private static final By DONT_KNOW_BUTTON = By.xpath("(//div[@class='label-placeholder']//span)[11]");
    private static final By QUITE_CONFIDENT_BUTTON = By.xpath("(//div[@class='label-placeholder']//label)[8]");
    private final WebDriver driver;

    public PollThirdPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, DONT_KNOW_BUTTON);
    }

    @Step("Once the page loads, select the option 'Don’t know' for question 3")
    public void selectDontKnow() {
        WaitingUtils.waitUntilElem(driver, DONT_KNOW_BUTTON, 20);
        JsClickUtils.javaScriptClick(driver, DONT_KNOW_BUTTON);
    }

    @Step("Select the option 'Quite confident' for question 4.")
    public void selectQuiteConfidentNext() {
        WaitingUtils.waitUntilElem(driver, QUITE_CONFIDENT_BUTTON, 20);
        JsClickUtils.javaScriptClick(driver, QUITE_CONFIDENT_BUTTON);
        NextButton.click(driver);
    }
}
