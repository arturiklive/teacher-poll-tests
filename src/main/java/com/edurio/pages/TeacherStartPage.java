package com.edurio.pages;

import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class TeacherStartPage {
    private static final By COOKIES_ACCEPT_BUTTON = By.xpath("//div[@class='accept-btn']");
    private static final By START_SURVEY_BUTTON = By.xpath("//div[@class='poll-start-survey']//button");
    private final WebDriver driver;

    public TeacherStartPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open the link https://edurio.com/poll/TftMJA")
    public void openPage(String url) {
        driver.get(url);
        WaitingUtils.waitUntilElem(driver, START_SURVEY_BUTTON, 20);
    }

    @Step("Accept cookies by clicking OK")
    public void clickCookiesButton() {
        try {
            WaitingUtils.waitUntilElem(driver, COOKIES_ACCEPT_BUTTON, 20);
            driver.findElement(COOKIES_ACCEPT_BUTTON).click();
        } catch (NoSuchElementException e) {
            String errorMessage = "Element not found: " + e.getMessage();
            Allure.addAttachment("Error", errorMessage);
            System.err.println(errorMessage);
        } catch (TimeoutException e) {
            String errorMessage = "Timeout waiting for element: " + e.getMessage();
            Allure.addAttachment("Error", errorMessage);
            System.err.println(errorMessage);
        }
    }

    @Step("Click the button 'Start the poll'")
    public void clickStartSurveyButton() {
        WaitingUtils.waitUntilElem(driver, START_SURVEY_BUTTON, 20);
        driver.findElement(START_SURVEY_BUTTON).click();
    }
}
