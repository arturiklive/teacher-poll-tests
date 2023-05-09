package com.edurio.steps;

import com.edurio.pages.PollThirdPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class PollThirdSteps {
    PollThirdPage pollThirdPage = new PollThirdPage(driver());
    @Then("the Third page loads")
    public void theThirdPageLoads() throws InterruptedException {
        Assert.assertTrue(pollThirdPage.checkIfPageLoaded(), "PollThirdPage is not loaded");
    }

    @And("I select the option 'Don’t know' for question 3")
    public void iSelectTheOptionDonTKnowForQuestion() {
        pollThirdPage.selectDontKnow();
    }

    @And("I select the option 'Quite confident' for question 4 and click 'Next'")
    public void iSelectTheOptionQuiteConfidentForQuestion() {
        pollThirdPage.selectQuiteConfidentNext();
    }
}