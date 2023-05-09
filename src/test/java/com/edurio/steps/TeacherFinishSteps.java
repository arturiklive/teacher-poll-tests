package com.edurio.steps;

import com.edurio.pages.TeacherFinishPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.edurio.drivers.DriverProvider.driver;

public class TeacherFinishSteps {
    TeacherFinishPage teacherFinishPage = new TeacherFinishPage(driver());
    @Then("the confirmation modal appears")
    public void theConfirmationModalAppears() throws InterruptedException {
        Assert.assertTrue(teacherFinishPage.checkIfPageLoaded(), "TeacherFinishPage is not loaded");
    }

    @And("I click 'Finish survey'")
    public void iClickFinishSurvey() {
        teacherFinishPage.clickFinishSurveyButton();
    }
}