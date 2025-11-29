Feature: Cart Page Functional Test Coverage
  All functional behaviors of the Cart Page are validated individually.

  Background:
    Given User in cart page

  Scenario: Verify Logo Click Redirection from Cart Page
    When the user clicks the site logo
    Then the user should be redirected to the Home page

  Scenario: Verify 'Products' Click Redirection from Cart Page
    When the user clicks the Products link
    Then the user should be redirected to the Products page

  Scenario: Verify 'Logout' Click Redirection from Cart Page
    Given User is signed in
    When the user clicks the Logout link
    Then the user should be redirected to the Login page

  Scenario: Verify 'Delete Account' Click Redirection from Cart Page
    Given User is signed in
    When the user clicks the Delete Account link
    Then the user should be redirected to the Account Deletion page

  Scenario: Verify 'Contact' Click Redirection from Cart Page
    When the user clicks the Contact link
    Then the user should be redirected to the Contact page

  Scenario: Verify Product Title Click Redirects to Product Details
    Given User has an item in cart
    When the user clicks the product title in the cart
    Then the user should be redirected to the Product Details page

  Scenario: Verify Delete Button Removes Item from Cart
    Given User has an item in cart
    When the user clicks the delete button for a cart item
    Then the item should be removed from the cart

#  Scenario: Verify Subscription Validation with Empty Email
#    When the user enters an empty email in the subscription field
#    Then an error message should be shown
#
#  Scenario: Verify Subscription Validation with Invalid Email
#    When the user enters an invalid email in the subscription field
#    Then an error message should be shown

  Scenario: Verify Subscription Success with Valid Email
    When the user enters a valid email in the subscription field
    Then a success message should be shown

  Scenario:
   Given User has an item in cart
   When user clicks proceed to checkout
   Then user is directed to checkout page

