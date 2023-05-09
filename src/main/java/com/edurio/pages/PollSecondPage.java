package com.edurio.pages;

import com.edurio.utils.JsClickUtils;
import com.edurio.utils.NextButton;
import com.edurio.utils.PageLoaded;
import com.edurio.utils.WaitingUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PollSecondPage {
    private static final By ADD_COMMENT_LINK = By.xpath("//div[@class='poll-comment']//span");
    private static final By ADD_COMMENT_TEXTAREA_LINK = By.xpath("//textarea[contains(@class, 'comment-textarea-nr-')]");
    private static final By QUITE_SATISFIED_BUTTON = By.xpath("(//div[@class='label-placeholder']//label)[2]");
    private final WebDriver driver;

    public PollSecondPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfPageLoaded() throws InterruptedException {
        return PageLoaded.check(driver, QUITE_SATISFIED_BUTTON);
    }

    @Step("Once the page loads, select the option 'Quite satisfied'.")
    public void selectQuiteSatisfied() {
        WaitingUtils.waitUntilElem(driver, QUITE_SATISFIED_BUTTON, 20);
        driver.findElement(QUITE_SATISFIED_BUTTON).click();
    }

    @Step("Click on the 'Click here to further explain or specify your answer' element")
    public void clickAddCommentLink() {
        WaitingUtils.waitUntilElem(driver, ADD_COMMENT_LINK, 20);
        JsClickUtils.javaScriptClick(driver, ADD_COMMENT_LINK);
    }

    @Step("In the input field that appeared, insert the text 'We joined only 3 months ago.'")
    public void addComment(String addComment) {
        WaitingUtils.waitUntilElem(driver, ADD_COMMENT_TEXTAREA_LINK, 20);
        driver.findElement(ADD_COMMENT_TEXTAREA_LINK).sendKeys(addComment);
    }

    @Step("Click 'Next' button")
    public void clickNext() {
        NextButton.click(driver);
    }
}
