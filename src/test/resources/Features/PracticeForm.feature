Feature: DemoQA
  I want to verify the Registration Form
#  @TC_FO_PF_01
#  Scenario: Verify the Generic form fields: Check the behavior of form by not filling up any data into the form.
#    Given I want open the registration form page
#    When I click the submit button
#    Then Mandatory fields should show the red border  and 'Thanks for submitting the form' should not show

#  @TC_FO_PF_02
#  Scenario Outline: Verify the Generic form fields:   Check the behavior of form by filling up all fields.
#    Given I want open the registration form page
#    When I filling up all the required fields
#    And I click the submit button
#    Then The "<message>" 'Thanks for submitting the form' should show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_03
#  Scenario Outline: Verify the Generic form fields:  Check the behavior of form by  filling up the required fields only.
#    Given I want open the registration form page
#    When I filling up the required fields only
#    And I click the submit button
#    Then The "<message>" 'Thanks for submitting the form' should show
#    Examples:
#      | message |
#      |Thanks for submitting the form|

#  @TC_FO_PF_05
#  Scenario: Verify the Name field test:   Check the Full name text field without adding First name.						.
#    Given I want open the registration form page
#    When I filling up mandatory fields without firstname field
#    And I click the submit button
#    Then Firstname field should show the red border  and other mandatory fields should not show the green border

#  @TC_FO_PF_06
#  Scenario: Verify the Name field test:   Check the Full name text field without adding First name.						.
#    Given I want open the registration form page
#    When I filling up mandatory fields without lastname field
#    And I click the submit button
#    Then Lastname field should show the red border  and other mandatory fields should not show the green border

#  @TC_FO_PF_07
#  Scenario: Verify the Name field test: Check by adding numbers or special characters instead of string in the full name text field.						.
#    Given I want open the registration form page
#    When I adding numbers or special characters instead of string in the full name text field.
#    And I click the submit button
#    Then Lastname and Firstname fields should show the red border

#  @TC_FO_PF_08
#  Scenario: Verify the Email field: Check the Email text field that can be empty.											.
#    Given I want open the registration form page
#    When I not filling up any data into email field
#    And I click the submit button
#    Then Email field should show the green border

#  @TC_FO_PF_09
#  Scenario: Verify the Email field:   Check the Email text field that has random string instead of real email.											.
#    Given I want open the registration form page
#    When I filling up random string instead of real email
#    And I click the submit button
#    Then Email field should show the red border

#  @TC_FO_PF_10
#  Scenario: Verify the Email field:  Check the Email text field that must be in correct format.										.
#    Given I want open the registration form page
#    When I filling up wrong format instead of real email
#    And I click the submit button
#    Then Email field should show the red border
#
#  @TC_FO_PF_11
#  Scenario: Verify the Email field: Check the Email text field that must not have a bank space.									.
#    Given I want open the registration form page
#    When I filling up email field have blankspace
#    And I click the submit button
#    Then Email field should show the red border

  @TC_FO_PF_12
  Scenario: Verify the Email field: Check the Gender field must be checked 																.
    Given I want open the registration form page
    When I not checking any data into gender field
    And I click the submit button
    Then Gender field should show the red border
