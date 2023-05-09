package com.edurio.steps;

import com.edurio.pages.PollFifthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class PollFifthSteps {
    PollFifthPage pollFifthPage = new PollFifthPage(driver());

    @Then("the Fifth page loads")
    public void theFifthPageLoads() throws InterruptedException {
        Assert.assertTrue(pollFifthPage.checkIfPageLoaded(), "PollFifthPage is not loaded");
    }

    @And("I insert the text {string} for question 6")
    public void iInsertTheTextForQuestion(String text) {
        pollFifthPage.setTextFinishSurvey(text);
    }

    @And("I click 'Finish survey' on the Fifth page")
    public void iClickFinishSurveyOnTheFifthPage() {
        pollFifthPage.clickButtonFinishSurvey();
    }
}