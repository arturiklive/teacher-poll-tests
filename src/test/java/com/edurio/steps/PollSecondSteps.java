package com.edurio.steps;

import com.edurio.pages.PollSecondPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class PollSecondSteps {
    PollSecondPage pollSecondPage = new PollSecondPage(driver());
    @Then("the Second page loads")
    public void theSecondPageLoads() throws InterruptedException {
        Assert.assertTrue(pollSecondPage.checkIfPageLoaded(), "PollSecondPage is not loaded");
    }

    @And("I select the option 'Quite satisfied' for question 2")
    public void iSelectTheOptionQuiteSatisfied() {
        pollSecondPage.selectQuiteSatisfied();
    }

    @And("I click on 'Click here to further explain or specify your answer'")
    public void iClickOnClickHereToFurtherExplainOrSpecifyYourAnswer() {
        pollSecondPage.clickAddCommentLink();
    }

    @And("I insert the text {string}")
    public void iInsertTheText(String text) {
        pollSecondPage.addComment(text);
    }
    @And("I click 'Next' to follow to the Third page")
    public void iClickNext() {
        pollSecondPage.clickNext();
    }
}