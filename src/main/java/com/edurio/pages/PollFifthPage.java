package com.edurio.pages;

import com.edurio.utils.NextButton;
import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollFifthPage {
    private static final By FINISH_TEXTAREA_LINK = By.xpath("//div[@class='answer-type-open-answer']//textarea");
    private final WebDriver driver;

    public PollFifthPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, FINISH_TEXTAREA_LINK);
    }

    @Step("Once the page loads, in the input field for question 6 insert the text 'Make learning" +
            "more relevant.'.")
    public void setTextFinishSurvey(String addComment) {
        WaitingUtils.waitUntilElem(driver, FINISH_TEXTAREA_LINK, 20);
        driver.findElement(FINISH_TEXTAREA_LINK).sendKeys(addComment);
    }
    @Step("Click the button Finish survey.")
    public void clickButtonFinishSurvey() {
        NextButton.click(driver);
    }
}
