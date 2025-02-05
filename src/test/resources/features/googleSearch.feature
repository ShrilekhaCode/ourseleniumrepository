Feature: Google Search Test
Scenario: User performs a Google search
    Given User navigates to Google homepage
    When User searches for "Selenium WebDriver"
    Then User should see results for "Selenium WebDriver"