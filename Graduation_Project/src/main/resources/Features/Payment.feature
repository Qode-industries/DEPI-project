Feature: Payment Page Feature Functionality

  Background:
    Given User in cart page
    Given User is signed in
    Given User has an item in cart
    Given User clicks Proceed to Checkout
    Given User clicks Proceed to Payment

  Scenario: Verify Payment Validation with Empty Fields
    When User clicks pay and confirm with empty fields
    Then Error message is displayed

  Scenario: Verify Payment Validation with Invalid Data
    When User clicks pay and confirm with Invalid data
    Then Payment not confirmed

  Scenario: Verify payment with valid Payment
    When User clicks pay and confirm with valid data
    Then Payment is confirmed

  Scenario: Verify downloading invoice button initiates download
    Given User clicks pay and confirm with valid data
    When User clicks download invoice
    Then download initiated

  Scenario: Verify 'Continue' Click Redirects to Homepage
    Given User clicks pay and confirm with valid data
    When User clicks continue
    Then User directed to Homepage
