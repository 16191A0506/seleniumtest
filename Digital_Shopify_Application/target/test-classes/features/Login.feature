Feature: Login
  @UITest
  Scenario: Login to DigitalShopify Application

    Given I am on homepage

    When I click on login

    Then I should be logged in
