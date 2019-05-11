Feature: Abhibus Ticket Booking

  Scenario: Verification of Reset button
    Given I visit Abhibus website
    Then I verify abhibus banner logo tooltip is "abhibus.com - India's Fastest Online bus ticket booking site"
    When I enter soure as "Hyderabad" and Destination as "Chennai"
    And I enter from date "25-05-2019" and retrun date as "29-05-2019"
    And I click search button
    Then I should be ticket booking page
    When I select a random traveller and seat from departure
    And I select a random traveller and seat during return
    And click on proceed to payment button
    And checkout the Abhibuslogo and tooltip massage
    