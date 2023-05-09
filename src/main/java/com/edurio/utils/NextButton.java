package com.edurio.utils;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextButton {
    private static final By SURVEY_NEXT_BUTTON = By.xpath("//button[@class='btn btn-full nw-survey-filing-next-link']");

    @Step("Click the button Next")
    public static void click(WebDriver driver) {
        WaitingUtils.waitUntilElem(driver, SURVEY_NEXT_BUTTON, 20);
        driver.findElement(SURVEY_NEXT_BUTTON).click();
    }
}