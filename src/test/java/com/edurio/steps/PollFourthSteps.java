package com.edurio.steps;

import com.edurio.pages.PollFourthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class PollFourthSteps {
    PollFourthPage pollFourthPage = new PollFourthPage(driver());
    @Then("the Fourth page loads")
    public void theFourthPageLoads() throws InterruptedException {
        Assert.assertTrue(pollFourthPage.checkIfPageLoaded(), "PollFourthPage is not loaded");
    }

    @And("I select the options 'By e-mail' for question 4")
    public void iSelectTheOptionsByEMail() {
        pollFourthPage.selectByEmail();
    }

    @And("I select the options 'From my child' for question 5 and click 'Next'")
    public void iSelectTheOptionsFromMyChild() {
        pollFourthPage.selectFromChildNext();
    }
}