package com.edurio.steps;

import com.edurio.pages.PollFirstPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class PollFirstSteps {
    PollFirstPage pollFirstPage = new PollFirstPage(driver());
    @Then("the First page loads")
    public void thePageLoads() throws InterruptedException {
        Assert.assertTrue(pollFirstPage.checkIfPageLoaded(), "PollFirstPage is not loaded");
    }

    @And("I select the option 'Year 3' for question 1")
    public void iSelectTheOptionYear() {
        pollFirstPage.selectYear3();
    }

    @And("I click 'Next' to follow to the Second page")
    public void iClickNextToFollowToTheSecondPage() {
        pollFirstPage.clickNext();
    }
}