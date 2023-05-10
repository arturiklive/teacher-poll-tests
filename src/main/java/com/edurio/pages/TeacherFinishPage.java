package com.edurio.pages;

import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherFinishPage {
    private static final By FINISH_SURVEY_BUTTON = By.xpath("//button[@class='modal-default-button']");
    private static final By SURVEY_PASSED_MARK = By.xpath("//div[@class='poll-header-title nw-poll-finished']");
    private final WebDriver driver;

    public TeacherFinishPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, FINISH_SURVEY_BUTTON);
    }

    @Step("On the confirmation modal click the button Finish survey.")
    public void clickFinishSurveyButton() {
        WaitingUtils.waitUntilElem(driver, FINISH_SURVEY_BUTTON, 20);
        driver.findElement(FINISH_SURVEY_BUTTON).click();
    }
    public boolean checkIfSurveyPassed() throws InterruptedException {
        return PageLoaded.check(driver, SURVEY_PASSED_MARK);
    }
}
