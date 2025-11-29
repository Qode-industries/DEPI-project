Feature: Signup / Login Features



  Scenario: Verify login fails when fields are empty
    Given the user is on the "Signup / Login" page
    When the user leaves the login fields empty and clicks the "Login" button
    Then the system should display a validation error "Please fill out this field"

  Scenario: Verify login fails with invalid email format
    Given the user is on the "Signup / Login" page
    When the user enters an invalid email format and clicks the "Login" button
    Then the system should display a validation error "Invalid email format"

  Scenario: Verify login fails with invalid credentials
    Given the user is on the "Signup / Login" page
    When the user enters incorrect credentials and clicks the "Login" button
    Then the system should display the error message "Your email or password is incorrect!"

  Scenario: Verify login success with valid credentials
    Given the user is on the "Signup / Login" page
    When the user enters valid credentials and clicks the "Login" button
    Then the user should be redirected to the Homepage with the username visible

  Scenario: Verify initial signup fails when fields are empty
    Given the user is on the "Signup / Login" page
    When the user leaves the signup fields empty and clicks the "Signup" button
    Then the system should display a validation error "Please fill out this field"



  Scenario: Verify initial signup fails with invalid email format
    Given the user is on the "Signup / Login" page
    When the user enters an invalid email format in the signup form and clicks the "Signup" button
    Then the system should display a validation error "Invalid email format"

  Scenario: Verify initial signup fails with an existing email
    Given the user is on the "Signup / Login" page
    When the user submits an existing email address via the "Signup" button
    Then the system should display the error message "Email Address already exist!"

  Scenario: Verify initial signup success with valid details
    Given the user is on the "Signup / Login" page
    When the user submits valid new registration details via the "Signup" button
    Then the user should be redirected to the "Enter Account Information" page



  Scenario: Verify Full Account Creation fails when mandatory fields are empty
    Given the user is on the "Enter Account Information" page
    When the user leaves mandatory fields empty and clicks the "Create Account" button
    Then the system should display a validation error "Please fill out this field" on the missing input

  Scenario: Verify Full Account Creation success with all mandatory fields filled
    Given the user is on the "Enter Account Information" page
    When the user fills all mandatory fields and clicks the "Create Account" button
    Then the user should be redirected to the "Account Created!" success page