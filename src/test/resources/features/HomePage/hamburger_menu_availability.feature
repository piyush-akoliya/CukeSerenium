Feature: Ace Online Shoe Portal Page

  Scenario: Verify the title of the Ace Online Shoe Portal
    Given User navigates to the Ace Online Shoe Portal page
    Then the title of the page should be "Ace Online Shoe Portal"

  Scenario: Verify the presence of main page text
    Given User navigates to the Ace Online Shoe Portal page
    Then the main page text should be displayed as "One Stop Shop for all your Shoes needs!"

  Scenario: Verify the presence of copyright footer
    Given User navigates to the Ace Online Shoe Portal page
    Then the copyright footer should be displayed as "Ace Automation © All Rights Reserved 2024"
    