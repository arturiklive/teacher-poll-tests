package com.edurio.pages;

import com.edurio.utils.JsClickUtils;
import com.edurio.utils.NextButton;
import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollFirstPage {
    private static final By YEAR_3_BUTTON = By.xpath("(//div[@class='label-placeholder']//label)[5]");
    private final WebDriver driver;

    public PollFirstPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, YEAR_3_BUTTON);
    }

    @Step("Once the page loads, select the option 'Year 3' and click the button 'Next'")
    public void selectYear3() {
        WaitingUtils.waitUntilElem(driver, YEAR_3_BUTTON, 20);
        JsClickUtils.javaScriptClick(driver, YEAR_3_BUTTON);
    }

    @Step("Click the button 'Next'")
    public void clickNext() {
        NextButton.click(driver);
    }
}
