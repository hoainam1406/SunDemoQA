Feature: DemoQA
  I want to verify the Registration Form
#  @TC_FO_PF_01
#  Scenario Outline: Verify the Generic form fields: Check the behavior of form by not filling up any data into the form.
#    Given I want open the registration form page
#    When I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should not show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_02
#  Scenario Outline: Verify the Generic form fields:   Check the behavior of form by filling up all fields.
#    Given I want open the registration form page
#    When I filling up all the required fields
#    And I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_03
#  Scenario Outline: Verify the Generic form fields:  Check the behavior of form by  filling up the required fields only.
#    Given I want open the registration form page
#    When I filling up the required fields only
#    And I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_05
#  Scenario Outline: Verify the Name field test:   Check the Full name text field without adding First name.						.
#    Given I want open the registration form page
#    When I filling up firstname and mandatory fields only
#    And I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should not show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_07
#  Scenario Outline: Verify the Name field test:  Check by adding numbers or special characters instead of string in the full name text field.						.
#    Given I want open the registration form page
#    When I adding numbers or special characters instead of string in the full name text field.
#    And I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should not show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
#  @TC_FO_PF_09
#  Scenario Outline: Verify the Email field:   Check the Email text field that has random string instead of real email.											.
#    Given I want open the registration form page
#    When I filling up random string instead of real email
#    And I click the submit button
#    Then The "<message>" "Thanks for submitting the form" should not show
#    Examples:
#      | message |
#      |Thanks for submitting the form|
  @TC_FO_PF_12
  Scenario Outline: Verify the Email field:   Check the Email text field that has random string instead of real email.											.
    Given I want open the registration form page
    When I filling up all the required fields but not check the gender field
    And I click the submit button
    Then The "<message>" "Thanks for submitting the form" should not show
    Examples:
      | message |
      |Thanks for submitting the form|