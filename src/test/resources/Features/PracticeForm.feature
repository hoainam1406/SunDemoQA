Feature: DemoQA
  I want to verify the Registration Form
  @TC_FO_PF_01
  Scenario Outline: Verify the Generic form fields: Check the behavior of form by not filling up any data into the form.
    Given I want open the registration form page
    When I click the submit button
    Then The "<message>" "Thanks for submitting the form" should not show
    Examples:
      | message |
      |Thanks for submitting the form|
  @TC_FO_PF_03
  Scenario Outline: Verify the Generic form fields:  Check the behavior of form by  filling up the required fields only.
    Given I want open the registration form page
    When I filling up the required fields only
    And I click the submit button
    Then The "<message>" "Thanks for submitting the form" should not show
    Examples:
      | message |
      |Thanks for submitting the form|