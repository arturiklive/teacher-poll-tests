package com.edurio.steps;

import com.edurio.pages.TeacherStartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.edurio.drivers.DriverProvider.driver;

public class TeacherStartSteps {
    TeacherStartPage teacherStartPage = new TeacherStartPage(driver());

    @Given("I open the link {string}")
    public void iOpenTheLink(String url) {

        teacherStartPage.openPage(url);
    }

    @And("I accept cookies by clicking 'OK'")
    public void iAcceptCookiesByClicking() {
        teacherStartPage.clickCookiesButton();
    }

    @When("I click the button 'Start the poll'")
    public void iClickTheButton() {
        teacherStartPage.clickStartSurveyButton();
    }
}
