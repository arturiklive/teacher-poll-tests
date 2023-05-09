package com.edurio.testrunners;

import com.edurio.drivers.DriverFactory;
import com.edurio.pages.*;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumPollTest {
    private static WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }


    @Test(priority = 1, description = "UI Testings - Survey")
    @Description("Executing survey")
    public void testElementsTextBox() throws InterruptedException {
        TeacherStartPage teacherStartPage = new TeacherStartPage(driver);
        teacherStartPage.openPage("https://edurio.com/poll/TftMJA");
        teacherStartPage.clickCookiesButton();
        teacherStartPage.clickStartSurveyButton();

        PollFirstPage pollFirstPage = new PollFirstPage(driver);
        Assert.assertTrue(pollFirstPage.checkIfPageLoaded(), "PollFirstPage is not loaded");
        pollFirstPage.selectYear3();
        pollFirstPage.clickNext();

        PollSecondPage pollSecondPage = new PollSecondPage(driver);
        Assert.assertTrue(pollSecondPage.checkIfPageLoaded(), "PollSecondPage is not loaded");
        pollSecondPage.selectQuiteSatisfied();
        pollSecondPage.clickAddCommentLink();
        pollSecondPage.addComment("We joined only 3 months ago.");
        pollSecondPage.clickNext();

        PollThirdPage pollThirdPage = new PollThirdPage(driver);
        Assert.assertTrue(pollThirdPage.checkIfPageLoaded(), "PollThirdPage is not loaded");
        pollThirdPage.selectDontKnow();
        pollThirdPage.selectQuiteConfident();
        pollThirdPage.clickNext();

        PollFourthPage pollFourthPage = new PollFourthPage(driver);
        Assert.assertTrue(pollFourthPage.checkIfPageLoaded(), "PollFourthPage is not loaded");
        pollFourthPage.selectByEmail();
        pollFourthPage.selectFromChild();
        pollFourthPage.clickNext();

        PollFifthPage pollFifthPage = new PollFifthPage(driver);
        Assert.assertTrue(pollFifthPage.checkIfPageLoaded(), "PollFifthPage is not loaded");
        pollFifthPage.setTextFinishSurvey("Make learning more relevant.");
        pollFifthPage.clickButtonFinishSurvey();

        TeacherFinishPage teacherFinishPage = new TeacherFinishPage(driver);
        Assert.assertTrue(teacherFinishPage.checkIfPageLoaded(), "TeacherFinishPage is not loaded");
        teacherFinishPage.clickFinishSurveyButton();
    }

    @AfterClass
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
