package com.edurio.pages;

import com.edurio.utils.JsClickUtils;
import com.edurio.utils.NextButton;
import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollFourthPage {
    private static final By BY_EMAIL_BUTTON = By.xpath("(//div[@class='label-placeholder']//label)[2]");
    private static final By FROM_CHILD_BUTTON = By.xpath("(//div[@class='label-placeholder']//label)[10]");
    private final WebDriver driver;

    public PollFourthPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, BY_EMAIL_BUTTON);
    }

    @Step("Once the page loads, select the options By e-mail.")
    public void selectByEmail() {
        WaitingUtils.waitUntilElem(driver, BY_EMAIL_BUTTON, 20);
        JsClickUtils.javaScriptClick(driver, BY_EMAIL_BUTTON);
    }

    @Step("Select the options From my child.")
    public void selectFromChildNext() {
        WaitingUtils.waitUntilElem(driver, FROM_CHILD_BUTTON, 20);
        JsClickUtils.javaScriptClick(driver, FROM_CHILD_BUTTON);
        NextButton.click(driver);
    }
}
