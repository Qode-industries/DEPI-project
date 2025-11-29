Feature: Checkout Page Feature Functionality

  Background:
    Given User in cart page
    Given User is signed in
    Given User has an item in cart
    Given User clicks Proceed to Checkout

  Scenario: Verify Comment Input Functionality
    When User types a comment in checkout and click proceed to payment
    Then User directed to Payment page

  Scenario: Verify proceed to payment functionality
    When User clicks Proceed to Payment
    Then User directed to Payment page

