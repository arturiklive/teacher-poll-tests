Feature: Teacher Poll Test

  Scenario: Complete Teacher Poll
    Given I open the link "https://edurio.com/poll/TftMJA"
    And I accept cookies by clicking 'OK'
    When I click the button 'Start the poll'

    Then the First page loads
    And I select the option 'Year 3' for question 1 and click 'Next'

    Then the Second page loads
    And I select the option 'Quite satisfied' for question 2
    And I click on 'Click here to further explain or specify your answer'
    And I insert the text "We joined only 3 months ago." and click 'Next'

    Then the Third page loads
    And I select the option 'Don’t know' for question 3
    And I select the option 'Quite confident' for question 4 and click 'Next'

    Then the Fourth page loads
    And I select the options 'By e-mail' for question 4
    And I select the options 'From my child' for question 5 and click 'Next'

    Then the Fifth page loads
    And I insert the text "Make learning more relevant." for question 6
    And I click 'Finish survey' on the Fifth page

    Then the confirmation modal appears
    And I click 'Finish survey'
