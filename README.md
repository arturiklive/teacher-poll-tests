# teacher-poll-tests

Simple test for https://edurio.com/poll/TftMJA

Technology stack:
Maven, Java, Selenium, Cucumber, Allure

Look com.edurio.testrunners for CucumberRunnerTest or SeleniumPollTest
Or simple use mvn test for TestNG.xml

TESTING GOAL:
The goal is to test the survey tool available at https://edurio.com/poll/TftMJA to ensure it functions correctly and meets the intended purpose.
The objective is to verify that teachers can create surveys, add questions, choose response options, preview surveys, and analyze the collected data accurately.
The testing aims to identify any defects, issues, or usability problems and ensure a smooth and satisfactory user experience for teachers.

EXPECTED:
Survey is completed with no errors. All elements are available through testing process. Confirmation page shown at the end.

TEST TASK:
1. Open the link https://edurio.com/poll/TftMJA
2. Accept cookies by clicking “OK”.
3. Click the button “Start the poll”
4. Once the page loads, select the option “Year 3” and click the button “Next”.
5. Once the page loads, select the option “Quite satisfied”. Click on the “Click here to
   further explain or specify your answer” element and in the input field that appeared
   insert the text “We joined only 3 months ago.”. Click the button “Next”.
6. Once the page loads, select the option “Don’t know” for question 3 and select the
   option “Quite confident” for question 4. Click the button “Next”.
7. Once the page loads, select the options “By e-mail” and “From my child”. Click the
   button “Next”.
8. Once the page loads, in the input field for question 6 insert the text “Make learning
   more relevant.”. Click the button “Finish survey”.
9. On the confirmation modal click the button “Finish survey”.